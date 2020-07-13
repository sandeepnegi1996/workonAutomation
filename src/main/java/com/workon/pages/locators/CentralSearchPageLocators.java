package com.workon.pages.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CentralSearchPageLocators {

	@FindBy(css = "#FullTextSearch")
	public WebElement textSearch;

	@FindBy(css = "#resetbtn")
	public WebElement resetBtn;

	@FindBy(xpath = "//a[contains(text(),'Next')]")
	public WebElement nextBtn;

	@FindBy(xpath = "//a[contains(text(),'Last')]")
	public WebElement lastBtn;

	@FindBy(xpath = "//a[@class='sidebar-toggle bosch']")
	public WebElement sidebarToggleSearch;

	// quick filter

	@FindBy(xpath = "//span[contains(text(),'Quick Filters')]")
	public WebElement quickfilter;

	@FindBy(xpath = "//li//a[contains(text(),'All My Requests')]")
	public WebElement allmyrequest;

	@FindBy(xpath = "//li//a[contains(text(),'Pending my action')]")
	public WebElement pendingMyActions;

	@FindBy(xpath = "//li[@class='treeview']//span[contains(text(),'Project Filter')]")
	public WebElement projectFilters;

	@FindBy(xpath = "//li[@class='treeview']//span[contains(text(),'More Filters')]")
	public WebElement moreFilters;

	// =====================================================================

	@FindBy(xpath = "//span[contains(text(),'Date Filters')]//preceding-sibling::input[@type='checkbox']")
	public List<WebElement> dateFilters;

	@FindBy(xpath = "//span[contains(text(),'User Filters')]//preceding-sibling::input[@type='checkbox']")
	public List<WebElement> userFilters;

	@FindBy(xpath = "//span[contains(text(),'Resolution & Status Filter')]//preceding-sibling::input[@type='checkbox']")
	public List<WebElement> resolutionAndStatusFilters;

	@FindBy(xpath = "//span[contains(text(),'Action Taken')]//preceding-sibling::input[@type='checkbox']")
	public List<WebElement> actionTakenFilters;

	@FindBy(xpath = "//li[@class='treeview']//span[contains(text(),'Help')]")
	public WebElement help;

	@FindBy(xpath="//div[@class='jqx-grid-cell-left-align']//a")
	public List<WebElement> allRequests;

	
	@FindBy(xpath="//b[contains(text(),'Key:')]//parent::td//following-sibling::b//a")
	public WebElement currentKey;

}
