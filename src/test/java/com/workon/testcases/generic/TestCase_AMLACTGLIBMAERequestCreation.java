package com.workon.testcases.generic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.workon.base.Page;
import com.workon.pages.actions.DashboardPage;
import com.workon.pages.actions.SearchPage;
import com.workon.pages.actions.amlactglibmae.AMLACTGLIBMAERequestCreation;

public class TestCase_AMLACTGLIBMAERequestCreation {
	
	
	@BeforeClass
	public void beforeClass() {
		Page.initConfiguration();
	}
	
	
	@Test
	public void amalactglibmaeRequestCreation() throws InterruptedException {
		
		DashboardPage dp=new DashboardPage();
		SearchPage sp= dp.gotoSearchBox();
		AMLACTGLIBMAERequestCreation amlact= sp.gotoAMLACTGLIBMAE();
		amlact.createNewRequest();
		
		Thread.sleep(3000);
	}	
	
	@AfterClass
	public void afterClass() {
		
		Page.quitBrowser();
		
	}
	
}
