package com.workon.testcases.generic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.workon.base.Page;
import com.workon.pages.actions.DashboardPage;
import com.workon.pages.actions.SearchPage;
import com.workon.pages.actions.amlacsaltrecolann.AMLACSALTRECOLANNRequestCreation;
import com.workon.pages.actions.apga.APGARequestCreation;

public class TestCase_APGARequestCreation {
	
	@BeforeClass
	public void beforeClass() throws InterruptedException {
		Page.initConfiguration();

	}

	@AfterClass
	public void afterClass() {
		Page.quitBrowser();
	}

	@Test(priority = 1)
	public void rbgaRequestCreation() throws InterruptedException {

		DashboardPage dp = new DashboardPage();
		SearchPage sp = dp.gotoSearchBox();
		APGARequestCreation apga = sp.gotoAPGA();
		apga.switchToRequestCreation();
		
		apga.clickCheckBoxElement();
		
		apga.selectRGB();
		apga.selectPrefinedWorkflow();
		apga.typeBriefDecription();
		apga.typeComment();	
		apga.clickOnWorkflowTab();
	
		
		//Edit the name of the both approval approval	
		apga.clickApprovalGridList("end1cob");
		
		apga.clickOnSubmitButton();
		apga.displayRequestKey();
		Thread.sleep(2000);

		
		

	}

}
