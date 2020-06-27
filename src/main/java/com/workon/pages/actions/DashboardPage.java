package com.workon.pages.actions;

import com.workon.base.Page;
import com.workon.pages.locators.DashboardPageLocators;

public class DashboardPage extends Page {
	
	//DashboardPage is a Page so thats why we are extending the Page 
	
	
	public static DashboardPageLocators dashboardpagelocator;
	
	
	public DashboardPage() {
		this.dashboardpagelocator=new DashboardPageLocators();
		
		
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
