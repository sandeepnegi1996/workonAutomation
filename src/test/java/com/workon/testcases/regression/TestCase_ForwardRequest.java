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

public class TestCase_ForwardRequest {
	
	@Test
	public void verifyForwardRequest() throws InterruptedException {
		Log.startTestCase("VerifyForwardRequest");

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

		Assert.assertEquals(searchRequestPage.isForwardButtonPresent(), true);

		searchRequestPage.clickOnForwardButton();
		

		//textarea[@id='comment']
		Assert.assertEquals(searchRequestPage.isCommentBoxPresent(), true);

		searchRequestPage.typeCommentInForwardForm("this is forwarding request for testing");
		
		
		//Add a from the user picker
		
		
		//click on the user picker
		
		//div[@id='pickButton:system.field.boschassignee']
		searchRequestPage.clickOnUserPicker();
		
		
		//add approver
		//changing the assignee
		rbga.addApprover("ugm1cob");
		
		
		
		
		rbga.clickOnSubmitButton();
		/*
		 * //click on the Assign button
		 * 
		 * Assert.assertEquals(searchRequestPage.isAssignButtonPresent(), true);
		 * 
		 * searchRequestPage.clickOnAssignButton();
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
