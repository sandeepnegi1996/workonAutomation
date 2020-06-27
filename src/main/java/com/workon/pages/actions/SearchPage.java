package com.workon.pages.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.workon.base.Page;
import com.workon.pages.locators.SearchPageLocators;

public class SearchPage extends Page {
	
	public SearchPageLocators searchpage;
	public SearchPage() {
		this.searchpage=new SearchPageLocators();
		
		AjaxElementLocatorFactory factory=new AjaxElementLocatorFactory(driver,15);
		
		PageFactory.initElements(factory, this.searchpage);
		
	}
	
	public void gotoRBGA() throws InterruptedException {
		type(searchpage.searchInput,"RBGA");
		
		System.out.println("searching rbga in the search bar");
		
		//this will press enter after searching 
		action.moveToElement(searchpage.searchInput).sendKeys(Keys.ENTER).build().perform();
		
		//click on the new request of the RBGA
		
		Thread.sleep(3000);
		
	}
	
	
	public void gotoAPMAZE() {
		
	}
	
	

}
