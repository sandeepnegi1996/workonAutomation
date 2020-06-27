package com.workon.testcases.generic;

import org.testng.annotations.Test;

import com.workon.base.Page;
import com.workon.pages.actions.DashboardPage;
import com.workon.pages.actions.SearchPage;
import com.workon.pages.actions.rbga.RBGARequestCreation;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestCase_RBGARequestCreation {
  @Test
  public void rbgaRequestCreation() throws InterruptedException {
	  
	  Page.initConfiguration();
	  DashboardPage dp=new DashboardPage();
	 SearchPage sp= dp.gotoSearchBox();
	 RBGARequestCreation rbga= sp.gotoRBGA();
	 rbga.rbgaRequestCreation();
	  
	  Thread.sleep(4000);
	  Page.quitBrowser();
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}
