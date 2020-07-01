package com.workon.testcases.functional.bug;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.workon.base.Page;
import com.workon.pages.actions.DashboardPage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestCase_Bug16794 {
	 @Test(invocationCount=6)
	  public void testUserLogin() throws InterruptedException {
		  DashboardPage dp=new DashboardPage();
		  dp.gotoUserLogin();
		  Thread.sleep(3000);
		  
		  
	  }
	  @BeforeClass
	  public void beforeClass() {
		  Page.initConfiguration();
	  }

	  @AfterClass
	  public void afterClass() {
		  Page.quitBrowser();
	  }
}
