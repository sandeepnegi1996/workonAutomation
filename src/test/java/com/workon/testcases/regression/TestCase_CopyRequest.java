package com.workon.testcases.regression;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.workon.base.Page;
import com.workon.pages.actions.DashboardPage;
import com.workon.pages.actions.SearchPage;
import com.workon.pages.actions.searchrequest.SearchRequestPage;
import com.workon.utilities.loggers.Log;

public class TestCase_CopyRequest {

	/*
	 *
	 * 1. Search any request 2. Go to search page 3. open the first requesty 4. open
	 * the first request 5. Click on the copy Request
	 *
	 *
	 * 
	 * 
	 */

	@Test
	public void verifyDeleteDraft() throws InterruptedException {
		Log.startTestCase("VerifyCopyRequest");

		DashboardPage dp = new DashboardPage();
		SearchPage sp = dp.gotoSearchBox();
		SearchRequestPage searchRequestPage = sp.gotoSearchRequest("RBGA");
		searchRequestPage.switchToRequestSearching();
		Log.info("Opening the first Request in RBGA Search Request Page");
		searchRequestPage.openingFirstRequest();

		// Read the brief description values and store it in field when click on the
		// copy button
		// new page will contain this text as well as clone is attached in the front of
		// that text

		// span[contains(text(),'Brief
		// Description:*')]//parent::label[@class='rb_WorkON_LabelArea']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea
		// rb_WorkON_FieldValueArea_view')]

		// Thread.sleep(4000);
		String briefDescriptionText = Page.getElementText(By.xpath(
				"//span[contains(text(),'Brief Description:*')]//parent::label[@class='rb_WorkON_LabelArea']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_view')]"));

		Log.info(briefDescriptionText);

		// Verfy Copy button is Present

		Assert.assertEquals(searchRequestPage.isCopyButtonPresent(), true);

		searchRequestPage.clickOnCopyButton();

		/*
		 * Thread.sleep(3000); rbga.switchToCopyWindow();
		 */
		boolean isCloneSummaryPresent = Page
				.isElementPresent(By.xpath("//input[@id='summary' and @class='textfield']"));

		Assert.assertEquals(isCloneSummaryPresent, true);

		// get summary text in the copy request page

		String cloneRequestSummary = Page.driver.findElement(By.xpath("//input[@id='summary' and @class='textfield']"))
				.getAttribute("value");
		Log.info("Clone Request Summary is :  " + cloneRequestSummary);

		// Assert Clone Request Summary contains text "CLONE"

		boolean isContainClone = cloneRequestSummary.contains("CLONE");

		Assert.assertEquals(isContainClone, true);

		// Assert that the brief DescriptionText should be present in the request in the
		// clone Request Summary

		boolean isContainBriefDescription = cloneRequestSummary.contains(briefDescriptionText);

		Assert.assertEquals(isContainBriefDescription, true);

		// click on the create button

		searchRequestPage.clickOnCreateButton();

		// verify the form data is similar to original request

		// Verify the attachments is copied from the original request

		//Verify the status is draft
		
		// Verify that the request is created

		searchRequestPage.clickOnDraftSubmitButton();
		Log.info("Creating Request After Copying");
		
		// verify key is present
		Assert.assertEquals(searchRequestPage.isKeyPresent(), true);

		searchRequestPage.displayRequestKeyAfterCopying();
		
		//

		Thread.sleep(4000);

		Log.endTestCase("VerifyCopyRequest");

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
