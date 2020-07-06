package com.workon.testcases.functional.pbi;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.workon.base.Page;
import com.workon.pages.actions.DashboardPage;
import com.workon.pages.actions.SearchPage;
import com.workon.pages.actions.rbga.RBGARequestCreation;

public class TestCase_PBI_20258_Feedback {
	
	
	/*
	 * 1. check the cross sign in feedback
	 * 2. if cross sign outside then open the feedback check inside the feedback that the sign is "X"
	 * 
	 */
	
	@BeforeClass
	public void beforeClass() {
		Page.initConfiguration();

	}

	@AfterClass
	public void afterClass() {
		Page.quitBrowser();
	}

	@Test
	public void testCrossSignFeedback() throws InterruptedException {

		DashboardPage dp = new DashboardPage();
		SearchPage sp = dp.gotoSearchBox();
		RBGARequestCreation rbga = sp.gotoRBGA();
		rbga.gotoCloseFeedbackform();
		rbga.findFeedbackformPresence();

		
		
		Thread.sleep(4000);

	}
	
	//test case to verify the working of the cross sign
	//as soon as cross is pressed the two fix that is 
	//Close Feedback  ->input tad display none
	//btnFdBk   --> div --> display none  -->.getAttribite("")
	// 
	//these two div input tag
	
	/*
	 * @Test public void testFeedbackClosed() throws InterruptedException {
	 * 
	 * //this test case is deependend on the first one
	 * 
	 * 
	 * 
	 * Thread.sleep(4000);
	 * 
	 * }
	 */

}
