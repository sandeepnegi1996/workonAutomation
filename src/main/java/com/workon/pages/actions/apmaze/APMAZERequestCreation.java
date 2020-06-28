package com.workon.pages.actions.apmaze;

import com.workon.base.Page;
import com.workon.pages.locators.apmaze.APMAZERequestCreationLocators;

public class APMAZERequestCreation extends Page {
	
	
	public APMAZERequestCreationLocators apmazeRequestCreationLocators;
	public APMAZERequestCreation() {
		this.apmazeRequestCreationLocators=new APMAZERequestCreationLocators();
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
		
	
		
		
	}
	

}
