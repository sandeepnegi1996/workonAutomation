package com.workon.testcases.centralsearch;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.workon.base.Page;
import com.workon.pages.actions.CentralSearchPage;
import com.workon.pages.actions.DashboardPage;

public class  {
  
	
  @Test
  public void searchCentralSearch() throws InterruptedException {
	  
	  DashboardPage dp=new DashboardPage();
	  CentralSearchPage cp= dp.gotoCentralSearch();
	  cp.gotoSearchRequest();
	  Thread.sleep(4000);
	  
	  
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println(" ******  starting browser   ********");
	  Page.initConfiguration();
  }
  
  @AfterClass
  public void afterClass() {
	  System.out.println("***** Closing the browser  **********");
	  Page.quitBrowser();
  }
}
