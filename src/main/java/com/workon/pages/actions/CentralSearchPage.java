package com.workon.pages.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.workon.base.Page;
import com.workon.pages.locators.CentralSearchPageLocators;

public class CentralSearchPage extends Page {
	

	public CentralSearchPageLocators centralpage;
	
	public CentralSearchPage() {
		this.centralpage=new CentralSearchPageLocators();
		
		AjaxElementLocatorFactory factory=new AjaxElementLocatorFactory(driver,15);
		PageFactory.initElements(factory,this.centralpage);
	}
	
	
	public  CentralSearchPage gotoSearchRequest() {
		
		switchToSecondTab(driver);
		type(centralpage.textSearch,"RBGA");
		action.sendKeys(Keys.chord(Keys.ENTER)).perform();
		return this;
		
	}
	
	

}
