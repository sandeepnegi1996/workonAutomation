package com.workon.testcases.generic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.workon.base.Page;
import com.workon.pages.actions.DashboardPage;
import com.workon.pages.actions.SearchPage;
import com.workon.pages.actions.amlacsaltrecolann.AMLACSALTRECOLANNRequestCreation;
import com.workon.pages.actions.rbga.RBGARequestCreation;

public class TestCase_AMLACSALTPRECOLANCRequestCreation {
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
		AMLACSALTRECOLANNRequestCreation amlacsal = sp.gotoAMLACSALTRECOLANN();
		amlacsal.switchToAMLACSALTRECOLANNRequestCreation();
		amlacsal.clickOnFirstInnerTab();
		amlacsal.typeClientInformation();
		amlacsal.typeMontate();
		amlacsal.typeCommercials();
		amlacsal.clickOnWorkflowTab();
		amlacsal.clickOnApprovalButton();
		amlacsal.addApprover("end1cob");
		amlacsal.clickOnSubmitButton();
		amlacsal.displayRequestKeyAMLAC();
		Thread.sleep(2000);

		
		

	}

}
