package com.workon.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CentralSearchPageLocators {

	@FindBy(css="#FullTextSearch")
	public WebElement textSearch;
	
	
	@FindBy(css="#resetbtn")
	public WebElement resetBtn;

	
	@FindBy(xpath="//a[contains(text(),'Next')]")
	public WebElement nextBtn;


	@FindBy(xpath="//a[contains(text(),'Last')]")
	public WebElement lastBtn;


	@FindBy(xpath="//a[@class='sidebar-toggle bosch']")
	public WebElement sidebarToggleSearch;
	
	
	//quick filter
	
	@FindBy(xpath="//span[contains(text(),'Quick Filters')]")
	public WebElement quickfilter;

	
	
}
