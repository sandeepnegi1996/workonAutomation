package com.workon.testcases.generic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.workon.base.Page;
import com.workon.pages.actions.DashboardPage;
import com.workon.pages.actions.SearchPage;
import com.workon.pages.actions.apmaze.APMAZERequestCreation;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestCase_APMAZERequestCreation {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("*******  initializing browser *********");
		Page.initConfiguration();
	}

	

	@Test
	public void apmazeRequestCreation() throws InterruptedException {
		DashboardPage dp=new DashboardPage();
		SearchPage sp= dp.gotoSearchBox();
		APMAZERequestCreation apmaze= sp.gotoAPMAZE();
		apmaze.apmazeRequestCreation();
		
		Thread.sleep(6000);
	
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("*******  closing browser *********");
		Page.quitBrowser();
	}


}
