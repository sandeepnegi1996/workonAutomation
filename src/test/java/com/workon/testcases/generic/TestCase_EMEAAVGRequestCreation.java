package com.workon.testcases.generic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.workon.base.Page;
import com.workon.pages.actions.DashboardPage;
import com.workon.pages.actions.SearchPage;
import com.workon.pages.actions.emeaavg.EMEAAVGRequestCreation;

public class TestCase_EMEAAVGRequestCreation {

	
	@BeforeClass
	public void beforeClass() throws InterruptedException {
		
		Page.initConfiguration();
		
	}
	
	
	@Test
	public void emeaavgRequestCreation() throws InterruptedException {
		
		DashboardPage dp=new DashboardPage();
		SearchPage sp= dp.gotoSearchBox();
		EMEAAVGRequestCreation em= sp.gotoEMEAAVG();
		em.createEMEAAVGRequest();
	
	}
	
	
	@AfterClass
	public void afterClass() {
		Page.quitBrowser();
		
	}
}
