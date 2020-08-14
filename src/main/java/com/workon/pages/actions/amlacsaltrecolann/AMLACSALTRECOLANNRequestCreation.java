package com.workon.pages.actions.amlacsaltrecolann;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.workon.base.Page;
import com.workon.pages.actions.rbga.RBGARequestCreation;
import com.workon.pages.locators.amlacsaltreclann.AMLACSALTRECOLANNRequestCreationLocators;
import com.workon.pages.locators.rbga.RBGARequestCreationLocators;
import com.workon.utilities.loggers.Log;

public class AMLACSALTRECOLANNRequestCreation extends Page {
	
	public AMLACSALTRECOLANNRequestCreationLocators amlacsal;

	public AMLACSALTRECOLANNRequestCreation() {

		this.amlacsal = new AMLACSALTRECOLANNRequestCreationLocators();

		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 15);

		PageFactory.initElements(factory, this.amlacsal);

	}

	/*
	 * 1. click on the new request 
	 * 2. switch to the new tab
	 * 3. click on the first tab
	 * 4. Fill details
	 * 5. click on the second tab
	 * 6. Add the approver 
	 * 7. Submit details
	 * 
	 * 
	 */
	
	public void switchToAMLACSALTRECOLANNRequestCreation() throws InterruptedException {
		//switchToSecondTab(driver);
		switchToAnyTab(driver,2);
	}


	public void clickOnFirstInnerTab() {
		click(amlacsal.firstTab);
	}
	
	
	//type the client
	
	public void typeClientInformation() {
		type(amlacsal.clientElement,"test client information");
	}
	
	//enter montante
	
	public void typeMontate() {
		type(amlacsal.montateElement,"this is montate field");
		
	}
	
	//enter Commercials something is there
	public void typeCommercials() {
		type(amlacsal.commercialElement,"test element");
	}
	
	
	//click on the second element workdlow
	//from the parent 
	
	
	//click on the approval button
	public void clickOnApprovalButton() {
		click(amlacsal.approverButtonElement);
	}
	
	
	
	
	

	public AMLACSALTRECOLANNRequestCreation addApprover(String ntid) {

		type(amlacsal.enterNtid, ntid);
		action.sendKeys(Keys.chord(Keys.ENTER)).perform();
		click(amlacsal.selectNtid);

		return this;
	}

	
	
	public void displayRequestKeyAMLAC() {
		

			Log.info("=====================================");
			Log.info(driver.findElement(By.xpath("//b[contains(text(),'Chave:')]//parent::td//following-sibling::b//a")).getText());
			Log.info("======================================");
		
		
	}
	


}
