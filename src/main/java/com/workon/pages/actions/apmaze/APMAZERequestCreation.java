package com.workon.pages.actions.apmaze;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

import com.workon.base.Page;
import com.workon.pages.locators.apmaze.APMAZERequestCreationLocators;

public class APMAZERequestCreation extends Page {
	
	
	public APMAZERequestCreationLocators apmazeRequestCreationLocators;
	public APMAZERequestCreation() {
		this.apmazeRequestCreationLocators=new APMAZERequestCreationLocators();
		
		AjaxElementLocatorFactory factory=new AjaxElementLocatorFactory(driver,15);
		PageFactory.initElements(factory, this.apmazeRequestCreationLocators);
		
	}
	
	public void apmazeRequestCreation() {
		
		
		//as soon as in the search page we will search for APMAZE we will be redirected to here
		
		/*
		 * 1. we will switch the browser tab
		 * 2. Fill the form
		 * 3. Click on workflow
		 * 4. Add the Approver
		 * 5. Submit the Form
		 */
		
		switchToSecondTab(driver);
		
		System.out.println("inside the apmaze request creation after switching tab");
		
		
		click(apmazeRequestCreationLocators.requestDataElement);
		
		type(apmazeRequestCreationLocators.subjectElement,"This is Test APMAZE Request");
		
		type(apmazeRequestCreationLocators.summary,"Testing APMAZe please ignore");
		
		type(apmazeRequestCreationLocators.phoneNumber,"7973882171");
		
		type(apmazeRequestCreationLocators.partName,"Test Part");
		
		
		selectOption(apmazeRequestCreationLocators.priorityDropDown,"Low");
		
		selectOption(apmazeRequestCreationLocators.rbtaElement,"RBTA");
		
		type(apmazeRequestCreationLocators.business,"TEST business entry");
		
		type(apmazeRequestCreationLocators.process,"Testing Process");
		
		type(apmazeRequestCreationLocators.machine,"Testing machine");
		
		type(apmazeRequestCreationLocators.maximumStock,"23");
		
		type(apmazeRequestCreationLocators.reorderPoint,"Test Reorder Text");
		
		type(apmazeRequestCreationLocators.description,"Test Description");
		
		type(apmazeRequestCreationLocators.reason,"Test Reason input");
		
		
		type(apmazeRequestCreationLocators.delivery,"10");
		
		type(apmazeRequestCreationLocators.descriptionTextArea,"Test description input");
		
		click(apmazeRequestCreationLocators.workflow);
		
		click(apmazeRequestCreationLocators.editPosition);
		
		type(apmazeRequestCreationLocators.enterNTid,"end1cob");
		
		action.sendKeys(Keys.chord(Keys.ENTER)).perform();
		
		click(apmazeRequestCreationLocators.selectNTIDApmazeXPath);
		
		click(apmazeRequestCreationLocators.submitBtn);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
	}
	

}
