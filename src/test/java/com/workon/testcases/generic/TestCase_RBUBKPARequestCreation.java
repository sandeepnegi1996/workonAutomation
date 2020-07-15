package com.workon.testcases.generic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.workon.base.Page;
import com.workon.pages.actions.DashboardPage;
import com.workon.pages.actions.SearchPage;
import com.workon.pages.actions.rbubkpa.RBUBKPA_RequestCreation;

public class TestCase_RBUBKPARequestCreation {
	
	
	@BeforeClass
	public void beforeClass() throws InterruptedException {
		System.out.println("*********  Initializing Browser  **********");
		Page.initConfiguration();
	}
	
	
	
	@Test
	public void rbubkpaRequestCreation() throws InterruptedException {
		DashboardPage dp=new DashboardPage();
		SearchPage sp= dp.gotoSearchBox();
		RBUBKPA_RequestCreation rbubkpa= sp.gotoRBUBKPA();
		rbubkpa.createRbubkpaRequest();
		
		Thread.sleep(3000);
	
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("********  Closing the browser   **********");
		Page.quitBrowser();
	}
}
