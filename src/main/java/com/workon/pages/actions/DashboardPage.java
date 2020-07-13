package com.workon.pages.actions;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

import com.workon.base.Page;
import com.workon.pages.locators.DashboardPageLocators;

public class DashboardPage extends Page {

	// DashboardPage is a Page so thats why we are extending the Page

	public DashboardPageLocators dashboardpagelocator;

	public DashboardPage() {

		this.dashboardpagelocator = new DashboardPageLocators();

		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 15);

		// we want to initialize the elements of the dashboardpagelocatos so that why in
		// the pagefactory init elements we have given the dashboadpagelocator
		PageFactory.initElements(factory, this.dashboardpagelocator);

	}

	/*
	 * in some cases i am using directly gotoCentralSearch like this but in some
	 * cases i am using gotoworkonArchive i am using workon in the function name
	 * this is because of the name in the workon dashboard page
	 * 
	 */

	public SearchPage gotoSearchBox() {
		/*
		 * return the object of the searchPage
		 * 
		 */

		return new SearchPage();
	}

	public CentralSearchPage gotoCentralSearch() {

		System.out.println("inside the gotoCentralSearch");

		click(dashboardpagelocator.centralSearchLink);

		System.out.println("clicked on the central search page links");

		return new CentralSearchPage();
	}

	public void gotoWorkONArchive() {

	}

	public void gotoUIB() {

	}

	public void gotoWorkONProfile() {

	}

	public void gotoDevQualityCheckTool() {

	}

	public void gotoWorkONEndUserWiki() {

	}

	public void gotoWorkONCommunity() {

	}

	public void gotoWorkONGlobalNet() {

	}

	public void gotoUserInformation() {

	}

	// ==================================================================

	public DashboardPage gotoUserLogin() throws InterruptedException {

		click(dashboardpagelocator.userLogin);

		Thread.sleep(2000);
		// check END1COB is available or not after the click

		String currentLoggedinUser = dashboardpagelocator.userdata.getText();

		// Assert.assertEquals(currentLoggedinUser, "END1COB");

		System.out.println(" *******    Current Login User: " + currentLoggedinUser  +"  *******");
		// after that click on the close button
		click(dashboardpagelocator.closeuserIcon);
		Thread.sleep(2000);

		return this;
	}

	// gotoWorkflows

	public void gotoWorkflows() {

		click(dashboardpagelocator.workflowTabDashboard);
		System.out.println(" ****  clicked on the workflow tab  *****");

	}

	// gotoMyFavTab

	public void gotoMyFavTab() {

		click(dashboardpagelocator.myfavtab);
		System.out.println("  ******    clicked on the myfav tab  *****");

	}

	public void addItemsToFav() {
		
		System.out.println("***  Adding items in the Favorities Tab ******");

		List<WebElement> favItems = dashboardpagelocator.starBtn;

		if (!favItems.isEmpty()) {
			// iterating through items and adding them

			for (WebElement element : favItems) {
				click(element);
				System.out.println("Adding items");
			}

		} else {
			System.out.println("no items in the fav");
		}

	}

	public void removeItemsFromFav() {

		System.out.println("*** Removing items from the favorites tab ****");
		// List<WebElement> favItems = dashboardpagelocator.starBtn;
		List<WebElement> removeItems = null;
		boolean flag = true;

		try {

			removeItems = driver.findElements(By.xpath("//a[@title='Add to your favourites.']"));

		} catch (NoSuchElementException e) {
			flag = false;
			System.out.println("element not found");

		}

		if (flag) {

			for (int i = 0; i < 2; i++) {
				click(removeItems.get(i));
				System.out.println("removing items from the Myfav tab");
			}

		}
	}
	
	
	
	
	

}
