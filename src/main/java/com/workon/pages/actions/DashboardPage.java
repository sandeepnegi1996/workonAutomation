package com.workon.pages.actions;


import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.workon.base.Page;
import com.workon.pages.locators.DashboardPageLocators;

public class DashboardPage extends Page {
	
	//DashboardPage is a Page so thats why we are extending the Page 
	
	
	public  DashboardPageLocators dashboardpagelocator;
	
	
	public DashboardPage() {
		
		this.dashboardpagelocator=new DashboardPageLocators();
		
		AjaxElementLocatorFactory factory=new AjaxElementLocatorFactory(driver, 15);
		
		//we wanrt to initialize the elements of the dashboardpagelocatos so that why in the pagefactory init elements we have given the dashboadpagelocator 
		PageFactory.initElements(factory, this.dashboardpagelocator);
		
		System.out.println("inside the dashboard page object of dashboardpagelocators is initialized");
		
		
	}
	
	
	/*
	 * in some cases i am using directly gotoCentralSearch like this 
	 * but in some cases i am using gotoworkonArchive i am using workon in the function name
	 * this is because of the name in the workon dashboard page
	 * 
	 */
	
	public void gotoSearchBox() {
		
	}
	
	public void gotoCentralSearch() {
		
		System.out.println("inside the gotoCentralSearch");
		
		/*driver.findElement(By.xpath("//a[contains(text(),'WorkON Central Search')]")).click();*/
		
		click(dashboardpagelocator.centralSearchLink);
		
		System.out.println("clicked on the central search page links");
		
		
		
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
	
	
	
	

}
