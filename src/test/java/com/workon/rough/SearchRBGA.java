package com.workon.rough;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.workon.base.Page;
import com.workon.pages.actions.DashboardPage;
import com.workon.pages.actions.SearchPage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class SearchRBGA {
  @Test
  public void searchrbga() throws InterruptedException {
	  
	  Page.initConfiguration();
	  
	  DashboardPage dashboardpage=new DashboardPage();
	  SearchPage searchpage= dashboardpage.gotoSearchBox();
	  searchpage.gotoRBGA();
	  Thread.sleep(3000);
	  Page.quitBrowser();
	  
	  
	  
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Searching rbga");
  }

  @AfterClass
  public void afterClass() {
  }

}
