package com.workon.testcases.regression;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.workon.base.Page;
import com.workon.pages.actions.DashboardPage;
import com.workon.pages.actions.SearchPage;
import com.workon.pages.actions.searchrequest.SearchRequestPage;
import com.workon.utilities.loggers.Log;

public class TestCase_PrintRequest {
	
	/*
	 *
	 * 1. Search any request
	 * 2.Open the first Request
	 * 3. Verify the print button is present in the page
	 * 4. Click on the print button in the top right corner
	 * 5. Verify the details which is present in the request is present in the printables format
	 * 6. Any form details not present fail the case
	 * 7. All the rows must now extend the printable area
	 * 8. Verify that the bosch logo is present in the top right corner
	 *
	 *
	 * 
	 * 
	 */

	@Test
	public void verifyPrintRequest() throws InterruptedException {
		Log.startTestCase("VerifyPrintRequest");

		DashboardPage dp = new DashboardPage();
		SearchPage sp = dp.gotoSearchBox();
		SearchRequestPage searchRequestPage = sp.gotoSearchRequest("RBGA");
		searchRequestPage.switchToRequestSearching();
		Log.info("Opening the first Request in RBGA Search Request Page");
		searchRequestPage.openingFirstRequest();

		//after opening first request
		
		//click on the print request button
		
		searchRequestPage.clickOnPrintButton();
		
		//switch to the print page
		
		searchRequestPage.switchToPrintPage();
		
		boolean isboschlogopresent=searchRequestPage.isBoschLogoPresent();
		Assert.assertEquals(isboschlogopresent, true);
		
		
		
		//we can verify that the details that were entered are the same or not 
		
		
		
		
		
	
		Thread.sleep(4000);
		
		
		

		Log.endTestCase("VerifyPrintRequest");

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
