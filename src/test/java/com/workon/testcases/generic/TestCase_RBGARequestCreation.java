package com.workon.testcases.generic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.workon.base.Page;
import com.workon.pages.actions.DashboardPage;
import com.workon.pages.actions.SearchPage;
import com.workon.pages.actions.rbga.RBGARequestCreation;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestCase_RBGARequestCreation {

	@BeforeClass
	public void beforeClass() {
		Page.initConfiguration();

	}

	@AfterClass
	public void afterClass() {
		Page.quitBrowser();
	}

	@Test
	public void rbgaRequestCreation() throws InterruptedException {

		DashboardPage dp = new DashboardPage();
		SearchPage sp = dp.gotoSearchBox();
		RBGARequestCreation rbga = sp.gotoRBGA();
		rbga.switchToRbgaRequestCreation();
		rbga.clickCheckBoxElement();
		rbga.typeBriefDescription();
		rbga.typeFullDescription();
		rbga.clickOnWorkflowTab();
		rbga.clickfirstApproverButton();
		rbga.addApprover();
		rbga.clickOnSubmitButton();
		rbga.displayRequestKey();
		
		Thread.sleep(4000);

	}

}
