package com.workon.testcases.regression;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.workon.base.Page;
import com.workon.pages.actions.CentralSearchPage;
import com.workon.pages.actions.DashboardPage;
import com.workon.pages.actions.SearchPage;
import com.workon.pages.actions.rbga.RBGARequestCreation;
import com.workon.pages.actions.searchrequest.SearchRequestPage;
import com.workon.utilities.loggers.Log;

public class TestCase_SaveAsDraft {

	/*
	 * IMP: Here we will not use the SearchRequest Page since here we need ot creATE
	 * THE REQUEST in that case we need the RBGARequestCreation Product Backlog Item
	 * 18 Task 19
	 * 
	 * TODO Click on the new request fill the form Verify if Save as draft , Submit
	 * , Reset buttons are present Click on save as draft Verify if the key is
	 * displayed as Key-ID Verify the status should be draft Verify the current
	 * ssignee details such as first name , lastname and department name Verify the
	 * applicant is the current user Verify if created date as the current date
	 * Verify that the priority is the default priority
	 * 
	 * 
	 */

	@Test
	public void verifySaveAsDraft() throws InterruptedException {
		Log.startTestCase("verifySaveAsDraft");

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

		SearchRequestPage searchRequestPage = new SearchRequestPage();

		Assert.assertEquals(searchRequestPage.isSaveAsDraftPresent(), true);

		Assert.assertEquals(searchRequestPage.isSubmitPresent(), true);

		Assert.assertEquals(searchRequestPage.isResetPresent(), true);

		// click on save as braft
		searchRequestPage.clickOnSaveAsDraft();

		// verify key is present
		Assert.assertEquals(searchRequestPage.isKeyPresent(), true);

		rbga.displayRequestKey();

		// Verify Status should be draft

		/*
		 * The Status we are receriving is in the form is Status: Draft
		 * 
		 * So we need to split the status string using ":" and then we need to trim the
		 * spaces to get the status
		 * 
		 */
		String status = searchRequestPage.getStatus();

		String currentStatus = searchRequestPage.getTrimmedValue(status);
		System.out.println("***** Current Status Found is " + currentStatus);
		String expectedStatus = "Draft";
		Assert.assertEquals(expectedStatus.equals(currentStatus), true);

		Thread.sleep(5000);

		// Assert Applicant name

		String applicantName = searchRequestPage.getApplicantName();

		Log.info(applicantName);

		String trimmedApplicantName = searchRequestPage.getTrimmedValue(applicantName);
		Log.info(trimmedApplicantName);

		String expectedApplicantName = "Sandeep Singh Negi (RBEI/BSW2)";
		Assert.assertEquals(trimmedApplicantName, expectedApplicantName, "Applicant name doesn't matched");

		// Assert Date

		String createdDate = searchRequestPage.getCreatedDate();
		Log.info(createdDate);

		String currentDate = searchRequestPage.getCurrentDate();
		Log.info(currentDate);

		Assert.assertEquals(createdDate, currentDate, "Date is not matched");

		// Assert Priority

		String currentPriority = searchRequestPage.getPriority();
		Log.info(currentPriority);

		String trimmedCurrentPriority = searchRequestPage.getTrimmedValue(currentPriority);
		Log.info(trimmedCurrentPriority);

		String expectedPriority = "Default";

		Assert.assertEquals(trimmedCurrentPriority, expectedPriority, " **   Priority Matching Failed   **");

		Log.endTestCase("verifySaveAsDraft");

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
