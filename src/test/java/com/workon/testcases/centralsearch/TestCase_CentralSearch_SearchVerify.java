package com.workon.testcases.centralsearch;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.workon.base.Page;
import com.workon.pages.actions.CentralSearchPage;
import com.workon.pages.actions.DashboardPage;

public class TestCase_CentralSearch_SearchVerify {
	
	@Test
	  public void verifyTheRequestInTable() throws InterruptedException {
		  
		  DashboardPage dp=new DashboardPage();
		  CentralSearchPage cp= dp.gotoCentralSearch();
		  
		  cp.gotoSearchRequest("RBGA");
		 cp.displayFirstRequestKey();
		 
		 //compare the Paased Key with the key returned by the displayFirstRequestKey
		 
		 boolean isRequestPresent= cp.requestKey.contains("RBGA");
		System.out.println(isRequestPresent);
		 Assert.assertEquals(isRequestPresent, true);
		
		 //if both are not equal test case will be fail
		  
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
