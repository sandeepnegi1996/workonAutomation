package com.workon.testcases.regression;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.workon.base.Page;
import com.workon.pages.actions.DashboardPage;
import com.workon.pages.actions.SearchPage;

import com.workon.pages.actions.searchrequest.SearchRequestPage;
import com.workon.utilities.loggers.Log;

public class TestCase_DeleteAsDraft {

	/*
	 *
	 * 1. Create a request 2. Save as Draft 3. Edit as Draft 4. Delete Draft Request
	 *
	 *
	 * 
	 * 
	 */

	@Test
	public void verifyDeleteDraft() throws InterruptedException {
		Log.startTestCase("VerifyDeleteAsDraft");

		DashboardPage dp = new DashboardPage();
		SearchPage sp = dp.gotoSearchBox();
		SearchRequestPage searchRequestPage = sp.gotoSearchRequest("RBGA");
		searchRequestPage.switchToRequestSearching();
		int requestRowNumber = searchRequestPage.requestWithStatusAsDraft();
		String requestKey = searchRequestPage.getRequestKeyWithRowNumber(requestRowNumber);
		searchRequestPage.openRequestWithStatusDraft(requestRowNumber);

		// Stroring the request key in the String so that
		// we will check in the list after deletig whetyher it is present or nont

		// Verify that the Delete Draft button is present

		Assert.assertEquals(searchRequestPage.isDeleteDraftButtonPresent(), true);

		searchRequestPage.clickOnDeleteDraft();

		searchRequestPage.typeComment();
		Log.info("waiting after entering comment");

		searchRequestPage.clickOnOkComment();
		Log.info("waiting after clicking on the OK button");

		Thread.sleep(3000);

		boolean isRequestAvailableInSearchRequestPage = searchRequestPage.isRequestKeyAvailable(requestKey);

		Assert.assertEquals(isRequestAvailableInSearchRequestPage, false);

		// if request found means it is not delted and isRequestKeyAvailable will return
		// true
		// We are checking again false so we want it to be false rather than true

		Thread.sleep(4000);

		Log.endTestCase("VerifyDeleteAsDraft");

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
