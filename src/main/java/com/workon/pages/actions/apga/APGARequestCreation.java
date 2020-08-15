package com.workon.pages.actions.apga;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.workon.base.Page;
import com.workon.pages.actions.rbga.RBGARequestCreation;
import com.workon.pages.locators.apga.APGARequestCreationLocators;
import com.workon.pages.locators.rbga.RBGARequestCreationLocators;
import com.workon.utilities.loggers.Log;

public class APGARequestCreation extends Page{
	
	
	public APGARequestCreationLocators apga;

	public APGARequestCreation() {

		this.apga = new APGARequestCreationLocators();

		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 15);

		PageFactory.initElements(factory, this.apga);

	}

	/*
	 * RBGA REQUEST CREATION PROCESS
	 * [X] 1. switch to the new tab after clicking on the new request 
	 * [X] 2. click on the checkbox element                           
	 * [X] 3. select RGB --> DCCN-HK                                     
	 * [X] 4. select the predined workflow 
	 * [X] 5. Enter description
	 * [X] 6. Enter Comments
	 * [X] 7. GotoWorkflow -->method present in the parent class
	 * []  8. just edit the workflow and give your name in both the approver item
	 */
	
	public void switchToRequestCreation() throws InterruptedException {
		switchToAnyTab(driver,2);
	}


	public void clickCheckBoxElement() throws InterruptedException {
		click(apga.checkboxElement);	

	}

	
	public void selectRGB() throws InterruptedException {
		
		//boolean isPresent=Page.isElementPresent(By.xpath("//span[contains(text(),'RGB:*')]//parent::label[@class='rb_WorkON_LabelArea']//following-sibling::div[@class='rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ']//select"));		
	
	//	Page.wait.until(ExpectedConditions.elementToBeClickable(apga.rgbElement));
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		/*
		 * if(isPresent) { selectOption(apga.rgbElement,"DCCN-HK");
		 * 
		 * }
		 */
		
		selectOption(apga.rgbElement,"DCCN-HK");
		
	}
	
	
	

	public void selectPrefinedWorkflow() throws InterruptedException {
		
		//boolean isPresent=Page.isElementPresent(By.xpath("//span[contains(text(),'Predefined Workflow:*')]//parent::label[contains(@class,'rb_WorkON_LabelArea')]//following-sibling::div[@class='rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ']//select"));
		
		//Page.wait.until(ExpectedConditions.elementToBeClickable(apga.predinedWorkflow));
		//below used wait is the implicit wait 
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		/*
		 * if(isPresent) { selectOption(apga.predinedWorkflow,"DCHK Contract Approval");
		 * }
		 */
		
		selectOption(apga.predinedWorkflow,"DCCN-HK Customer Application Form");
		
	}
	
	public void typeBriefDecription() {
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		type(apga.briefDescription,"This is the test request please ignore ");
	}
	
	public void typeComment() {
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		type(apga.comments,"This is the test request please ignore");
		
	}
	
	//gotoWorkflow
	
	public void clickApprovalGridList(String ntid) throws InterruptedException {
		
		
		List<WebElement> list= apga.approvalGridList;
		
		for(WebElement element:list) {
			Log.info("clicking inthe approval grid list");
		
			click(element);
			driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
			addApprover(ntid);
			
		}
	}

	public void addApprover(String ntid) {

		type(apga.enterNtid, ntid);
		action.sendKeys(Keys.chord(Keys.ENTER)).perform();
		click(apga.selectNtid);

	}



}
