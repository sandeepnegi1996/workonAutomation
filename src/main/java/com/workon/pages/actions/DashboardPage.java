package com.workon.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

import com.workon.base.Page;
import com.workon.pages.locators.DashboardPageLocators;

public class DashboardPage extends Page {
	
	//DashboardPage is a Page so thats why we are extending the Page 
	
	
	public  DashboardPageLocators dashboardpagelocator;
	
	
	public DashboardPage() {
		
		this.dashboardpagelocator=new DashboardPageLocators();
		
		AjaxElementLocatorFactory factory=new AjaxElementLocatorFactory(driver, 15);
		
		//we want to initialize the elements of the dashboardpagelocatos so that why in the pagefactory init elements we have given the dashboadpagelocator 
		PageFactory.initElements(factory, this.dashboardpagelocator);
		
		System.out.println("inside the dashboard page object of dashboardpagelocators is initialized");
		
		
	}
	
	
	/*
	 * in some cases i am using directly gotoCentralSearch like this 
	 * but in some cases i am using gotoworkonArchive i am using workon in the function name
	 * this is because of the name in the workon dashboard page
	 * 
	 */
	
	public SearchPage gotoSearchBox() {
		/*
		 *return the object of the searchPage
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
	
	//==================================================================
	
	public DashboardPage gotoUserLogin() throws InterruptedException {
		click(dashboardpagelocator.userLogin);
		
		//check END1COB is available or not after the click
		
		
		
		String currentLoggedinUser= dashboardpagelocator.userdata.getText();
		Assert.assertEquals(currentLoggedinUser, "END1COB");
		
		
		System.out.println(currentLoggedinUser);		
		//after that click on the close button
		
		
		click(dashboardpagelocator.closeuserIcon);
		return this;
	}
	
	
	
	

}
