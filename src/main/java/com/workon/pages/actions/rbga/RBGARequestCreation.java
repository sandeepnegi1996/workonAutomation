package com.workon.pages.actions.rbga;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.workon.base.Page;
import com.workon.pages.locators.rbga.RBGARequestCreationLocators;

public class RBGARequestCreation extends Page {
	
	
	public RBGARequestCreationLocators rbgaRequestLocator;
	public RBGARequestCreation() {
		
		this.rbgaRequestLocator=new RBGARequestCreationLocators();
		
		AjaxElementLocatorFactory factory=new AjaxElementLocatorFactory(driver, 15);
		
		PageFactory.initElements(factory, this.rbgaRequestLocator);
		
	}
	
	public void rbgaRequestCreation() {
		
		System.out.println("generating all the windows id means tab id");
		Set<String> windowsID= driver.getWindowHandles();
		
		Iterator<String> itr= windowsID.iterator();
		String firstWindowId= itr.next();
		String secondWindowId=itr.next();
		
		System.out.println(secondWindowId);
		
		driver.switchTo().window(secondWindowId);
		
		
		//clicking the tick mark
		
		click(rbgaRequestLocator.tickMark);
		
		//Fill the subject
		
		type(rbgaRequestLocator.subject,"This is sample test Request Please ignore");
		
		//Fill the description
		type(rbgaRequestLocator.description,"This is the description for the request RBGA");
		
		//Click on the workflow tab
		click(rbgaRequestLocator.workflowTab);
		
		
		//fill the approver details
		WebElement firstApproverBtn= rbgaRequestLocator.approverBtn.get(0);
		
		click(firstApproverBtn);
		
		//enter the ntid
		type(rbgaRequestLocator.enterNtid,"end1cob");
		action.sendKeys(Keys.chord(Keys.ENTER)).perform();
		
		//actually we don't need to switch back to the secondwindowId 
		driver.switchTo().window(secondWindowId);
		
		
		click(rbgaRequestLocator.selectNtid);
		
		
		
		//click on the submit button
		click(rbgaRequestLocator.submitBtn);
		
		
		
		
	}

}
