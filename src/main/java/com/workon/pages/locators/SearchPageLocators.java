package com.workon.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPageLocators {

	@FindBy(css="#searchInputField")
	public WebElement searchInput;
	
	
	@FindBy(xpath="//a[@title='Request a new workflow for RB General Approval Form']")
	public WebElement rbgaNewRequest;
	
	@FindBy(xpath="//a[@title='Request a new workflow for APMAZE']")
	public WebElement apmazeNewRequest;
	
	@FindBy(xpath="//a[@title='Request a new workflow for CP/ABx - Purchasing Approval Workflow']")
	public WebElement rbubkpaNewRequest;
}
