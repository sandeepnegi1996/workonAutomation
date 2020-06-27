package com.workon.rough;

import org.testng.annotations.Test;

import com.workon.base.Page;
import com.workon.pages.actions.DashboardPage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class DashboardTestCentralSearch {
  @Test
  public void f() throws InterruptedException {
	  
	  System.out.println("Testing basic Testng");
	  
	  Page.initConfiguration();
	 // Thread.sleep(3000);
	  
	  DashboardPage dashboardpage=new DashboardPage();
	  dashboardpage.gotoCentralSearch();
	  Thread.sleep(5000);
	  Page.quitBrowser();
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
