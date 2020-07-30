package com.workon.testcases.regression;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.workon.base.Page;
import com.workon.pages.actions.DashboardPage;
import com.workon.pages.actions.SearchPage;
import com.workon.pages.actions.rbga.RBGARequestCreation;
import com.workon.pages.actions.searchrequest.SearchRequestPage;
import com.workon.utilities.loggers.Log;

public class TestCase_SuspendRequest {

	/*
	 * 
	 * Steps from the excel
	 * 
	 * Log In to the WorkOn Dashboard
	 * (https://inside-q.bosch.com/irj/portal?NavigationTarget=navurl://
	 * a6992df13ba1bd810b2ae1b9a2b82b6d&ExecuteLocally=true&NavPathUpdate=true)
	 * Click on 'Search Request' link of any Application Click on any of the
	 * Application Key Click on Suspend button in the top right corner Enter reason
	 * as "Test reason" and click OK� Verify if the Status is displayed a
	 * "Suspended" "Verify if the change history is displayed as below: Field:
	 * Status Original Value : (Old Status) New Value : Suspended" Verify if an UIB
	 * email is published with Task-Suspended to the assignee Click on source button
	 * Verify if Workon Email is received with "Reason for suspension" Verify if
	 * 'Resume' button is present as applicant Click on Resume request Enter reason
	 * as "Test resume reason" and click OK "Verify if the change history is
	 * displayed as below: Field: Status Original Value : Suspended New Value : (Old
	 * Status)"
	 */

	// i think this testcase should be in the generic test cases of the RBGA
	// since after the request creation
	// I can test all those functionality

	@Test
	public void verifySaveAsDraft() throws InterruptedException {
		Log.startTestCase("VerifySuspendAndResume");

		DashboardPage dp = new DashboardPage();
		SearchPage sp = dp.gotoSearchBox();
		RBGARequestCreation rbga = sp.gotoRBGA();
		rbga.switchToRbgaRequestCreation();
		rbga.clickCheckBoxElement();
		rbga.typeBriefDescription();
		rbga.typeFullDescription();
		rbga.clickOnWorkflowTab();
		rbga.clickfirstApproverButton();
		rbga.addApprover("end1cob");
		rbga.clickOnSubmitButton();
		rbga.displayRequestKey();
		Thread.sleep(4000);

		SearchRequestPage searchRequestPage = new SearchRequestPage();

		Assert.assertEquals(searchRequestPage.isSuspendButtonPresent(), true);

		searchRequestPage.clickOnSuspendButton();

		searchRequestPage.typeSuspendReason();

		// ok comment is common is delete draft reqwuest and the suspend request

		searchRequestPage.clickOnOkComment();

		// verify the status is turned to suspended in this case
		String status = searchRequestPage.getStatus();

		String currentStatus = searchRequestPage.getTrimmedValue(status);
		Log.info("Current Status is : " + currentStatus);
		String expectedStatus = "Suspended";
		Assert.assertEquals(expectedStatus.equals(currentStatus), true);

		
		
		//and also we need to check the change history is changed or not
		
		
		
		// Verify the resume button is present
		
		
		Assert.assertEquals(searchRequestPage.isResumeButtonPresent(),true);

		// click the resume button give the reason

		searchRequestPage.clickOnResumeButton();
		
		//fill the reason for the resume button
		
		searchRequestPage.typeResumeRequestReason();
		
		// click on the OK button
		
		searchRequestPage.clickOnOkComment();
	
		// verify the status
		
		/*
		 * String statusResume = searchRequestPage.getStatus();
		 * 
		 * String currentStatusResume = searchRequestPage.getTrimmedValue(statusResume);
		 * Log.info("Current Status is : " + currentStatusResume); String
		 * expectedStatusResume = "Resume";
		 * Assert.assertEquals(expectedStatusResume.equals(currentStatusResume), true);
		 */

		Thread.sleep(4000);

		Log.endTestCase("VerifySuspendAndResume");

		//
	}

	@BeforeClass
	public void beforeClass() throws InterruptedException {
		System.out.println(" ******  starting browser   ********");
		Page.initConfiguration();
	}

	@AfterClass
	public void afterClass() {
		System.out.println("***** Closing the browser  **********");
		Page.quitBrowser();
	}

}
