package com.workon.testcases.generic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.workon.base.Page;
import com.workon.pages.actions.DashboardPage;
import com.workon.pages.actions.SearchPage;
import com.workon.pages.actions.stga.STGA_RequestCreation;

public class TestCase_STGARequestCreation {
	
	
	@BeforeClass
	public void beforeClass() throws InterruptedException {
		System.out.println("******    opening browser      ********");
		Page.initConfiguration();
	}
	
	
	@AfterClass
	public void afterClass() {
		System.out.println("******    Closing browser     *********");
		Page.quitBrowser();
		
	}

	
	
	@Test
	public void createSTGARequest() throws InterruptedException {
		DashboardPage dp=new DashboardPage();
		SearchPage sp= dp.gotoSearchBox();
		STGA_RequestCreation st= sp.gotoSTGA();
		st.createSTGARequest();
	}
}
