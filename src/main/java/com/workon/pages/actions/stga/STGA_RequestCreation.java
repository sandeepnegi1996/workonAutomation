package com.workon.pages.actions.stga;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.workon.base.Page;
import com.workon.pages.locators.stga.STGARequestCreationLocators;

public class STGA_RequestCreation extends Page {
	
	public STGARequestCreationLocators stga;
	
	public STGA_RequestCreation() {
		
		this.stga=new STGARequestCreationLocators();
		
		AjaxElementLocatorFactory factory=new AjaxElementLocatorFactory(driver, 15);
		PageFactory.initElements(factory, this.stga);
		
	}
	
	
	public void createSTGARequest() {
		
		switchToSecondTab(driver);
		
		click(stga.requestDataElement);
		
		type(stga.subjectElement,"Testing apga Request creation please ignore");
		
		type(stga.summary,"Testing apga Request Creation summary");
		
		selectOption(stga.process,"BT/PU");
		
		selectOption(stga.subprocess,"Awarding approval");
		
		type(stga.topic,"This is the APGA Test Request");
		
		type(stga.description,"Description APGA");
		
		
		
		/*
		 * for(WebElement element:apga.additionalFieldList) {
		 * 
		 * 
		 * //change the property to be unselectable off
		 * 
		 * List<WebElement> unselectableDiv=driver.findElement(By.xpath(""));
		 * 
		 * JavascriptExecutor js = (JavascriptExecutor)driver;
		 * 
		 * String scriptSetAttr="arguments[0].setAttribute(arguments[1],arguments[2])";
		 * js.executeScript(scriptSetAttr,unselectableDiv.get(0),"unselectable","off");
		 * 
		 * click(apga.additionalFieldList.get(0));
		 * 
		 * System.out.println("Deleting the Additional Fields");
		 * 
		 * }
		 */
		
		
	}

}
