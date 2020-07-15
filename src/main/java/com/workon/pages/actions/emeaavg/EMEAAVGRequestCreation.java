package com.workon.pages.actions.emeaavg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.workon.base.Page;
import com.workon.pages.locators.emeaavg.EMEAAVGRequestCreationLocators;

public class EMEAAVGRequestCreation extends Page {

	public EMEAAVGRequestCreationLocators emeaavg;

	public EMEAAVGRequestCreation() {

		this.emeaavg = new EMEAAVGRequestCreationLocators();

		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 15);

		PageFactory.initElements(factory, this.emeaavg);

	}

	public void createEMEAAVGRequest() {

		System.out.println("inside the emeaavg Request");

		switchToSecondTab(driver);

		// fill the reason

		type(emeaavg.reasonAdminAcess, "Testing please ignore");

		// system option

		selectOption(emeaavg.systemTypeOption, "HANA");

		// region option choose EMEA

		selectOption(emeaavg.regionOption, "EMEA");

		// choose the type of request

		selectOption(emeaavg.typeOfRequestOption, "Add");

		// type system name as test

		type(emeaavg.systemName, "test");

		// tyoe the domain name as the test

		type(emeaavg.domainAccountName, "test");

		clickOnWorkflowTab();

		// add the department manager approval
		// from the list choose the first item

		click(emeaavg.departmentManagerCost.get(0));

		// add the approver

		type(emeaavg.enterNtid, "end1cob");
		action.sendKeys(Keys.chord(Keys.ENTER)).perform();

		click(emeaavg.selectNtid);

		// Adding the CI/OSB5
		// choose third one

		click(emeaavg.departmentManagerCost.get(2));

		type(emeaavg.enterNtid, "end1cob");
		action.sendKeys(Keys.chord(Keys.ENTER)).perform();

		// clear the approval list fourth since there are other buttons to

		click(emeaavg.clearApprovalList.get(3));

		// deleting the approver
		click(driver.findElement(By.xpath("//button[contains(text(),'Yes')]")));

		// add the new approver

		type(emeaavg.enterNtid, "end1cob");
		action.sendKeys(Keys.chord(Keys.ENTER)).perform();

		click(emeaavg.selectNtid);

		clickOnSubmitButton();
		
		System.out.println(" ***  Printing the request key after the request is submitted  ***");

		displayRequestKey();

	}

}
