package com.workon.pages.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

import com.workon.base.Page;
import com.workon.pages.locators.CentralSearchPageLocators;

public class CentralSearchPage extends Page {

	private String requestKey = "";
	private String afterOpeningRequestKey = "";

	public CentralSearchPageLocators centralpage;

	public CentralSearchPage() {
		this.centralpage = new CentralSearchPageLocators();

		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 15);
		PageFactory.initElements(factory, this.centralpage);
	}

	public CentralSearchPage gotoSearchRequest() {

		switchToSecondTab(driver);
		type(centralpage.textSearch, "RBGA");
		action.sendKeys(Keys.chord(Keys.ENTER)).perform();
		return this;

	}

	/*
	 * This is one of the most important testcase of central search
	 * 
	 * 1. Choose the first item in the cental search after searching for RBGA // get
	 * 2. the request key and print the request key // open the request in the new
	 * tab 3. go to the new tab // verrifyt that the request is having the same key
	 */

	public void displayFirstRequestKey() {
		requestKey = centralpage.allRequests.get(0).getText();
		System.out.println("  ======================  " + requestKey + "  =========================");
	}

	public CentralSearchPage clickOntheFirstRequest() {

		click(centralpage.allRequests.get(0));
		return this;
	}

	public void gotoRequestTab() {
		switchToThirdTab(driver);
	}

	public void displayTheRequestKeyInNewTab() {
		displayRequestKey();
	}
	
	public void getRequestKeyAfterOpeningRequest() {
		afterOpeningRequestKey = getRequestKey();
	}

	// comparing FirstRequestKey with the Request Opened

	public void compareRequestKey() {
		Assert.assertEquals(requestKey, afterOpeningRequestKey, "Request key is not same in the central search list");
	}

	// Click on the reset button

	public CentralSearchPage clickReset() {
		click(centralpage.resetBtn);
		System.out.println(" *******  Clicked on the Reset Button  ********");
		return this;
	}

	// click on the next button

	public CentralSearchPage clickNextBtn() {

		click(centralpage.nextBtn);
		System.out.println(" *******  Clicked on the Next Button  ********");
		return this;
	}

	// click on the last button

	public CentralSearchPage clickLastBtn() {

		click(centralpage.lastBtn);
		System.out.println(" *******  Clicked on the Last Button  ********");
		return this;
	}

	// click on the sidebar toggle bosch

	public CentralSearchPage clickSideBarToggleSearch() {

		click(centralpage.sidebarToggleSearch);
		System.out.println(" *******  Clicked on the Sidebar Toggle Search Button  ********");
		return this;
	}

	// click quick filters

	public CentralSearchPage clickQuickFilter() {
		click(centralpage.quickfilter);
		System.out.println(" *******  Clicked on the quick filters Button  ********");
		return this;
	}

	// click all my requests

	public CentralSearchPage clickAllMyRequests() {
		click(centralpage.allmyrequest);
		System.out.println(" *******  Clicked on the All my requests Button  ********");
		return this;

	}

	// click pending my actions

	public CentralSearchPage clickPendingMyActions() {

		click(centralpage.pendingMyActions);
		System.out.println(" *******  Clicked on the Pending my actions Button  ********");
		return this;
	}

	// click project filter

	public CentralSearchPage clickProjectFilter() {

		click(centralpage.projectFilters);
		System.out.println(" *******  Clicked on the project filter Button  ********");
		return this;
	}

	// click on more filters

	public CentralSearchPage clickMoreFilters() {
		click(centralpage.moreFilters);
		System.out.println(" *******  Clicked on the more filters Button  ********");
		return this;
	}

	// click the Date Filters

	public CentralSearchPage clickDateFilters() {

		click(centralpage.dateFilters.get(0));
		System.out.println(" *******  Clicked on the date filters Button  ********");
		return this;
	}

	// click the user filters

	public CentralSearchPage clickUserFilters() {
		click(centralpage.userFilters.get(1));
		System.out.println(" *******  Clicked on the user filters Button  ********");
		return this;
	}

	// click the Resolutions and Status filter
	public CentralSearchPage clickResolutionAndStatusFilters() {
		click(centralpage.resolutionAndStatusFilters.get(2));
		System.out.println(" *******  Clicked on the resolution filters Button  ********");
		return this;
	}

	// click the Action Taken filters

	public CentralSearchPage clickActionTakenFilters() {
		click(centralpage.actionTakenFilters.get(3));
		System.out.println(" *******  Clicked on the action taken filters Button  ********");
		return this;
	}

	// click on the help link

	public CentralSearchPage clickHelpCentralSearch() {
		click(centralpage.help);
		System.out.println(" ****** Clicking on the help link of the Central Search Page  *******");
		return this;
	}

}
