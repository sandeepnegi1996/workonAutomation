package com.workon.testcases.centralsearch;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.workon.base.Page;
import com.workon.pages.actions.CentralSearchPage;
import com.workon.pages.actions.DashboardPage;

public class TestCase_CentralSearch {
  
	
  @Test
  public void verifyTheRequestOpeningInNewTab() throws InterruptedException {
	  
	  DashboardPage dp=new DashboardPage();
	  CentralSearchPage cp= dp.gotoCentralSearch();
	  
	  cp=cp.gotoSearchRequest("RBGA");
	  cp.displayFirstRequestKey();
	
	  cp.clickOntheFirstRequest();
	  
	  cp.gotoRequestTab();
	  cp.displayTheRequestKeyInNewTab();
	  cp.getRequestKeyAfterOpeningRequest();
	  cp.compareRequestKey();
	  	  
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
