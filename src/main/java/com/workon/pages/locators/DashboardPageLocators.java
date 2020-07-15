package com.workon.pages.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPageLocators {

	@FindBy(xpath = "//span[contains(text(),'Try with New Dashboard UI for Cross Project Search')]//parent::div//following-sibling::a")
	public WebElement centralSearchLink;

	// workon archive link
	@FindBy(xpath = "//span[contains(text(),'It stores all closed requests according to the archive definition chosen by the process owner.')]//preceding-sibling::a")
	public List<WebElement> archiveLink;

	// workon UIB
	@FindBy(xpath = "//span[contains(text(),'For edit/approve workflow requests you received')]//preceding-sibling::a")
	public List<WebElement> uib;

	
	
	
	@FindBy(xpath = "//img[@class='sprite-menu_user']//parent::a")
	public WebElement userLogin;

	@FindBy(xpath = "//div[@id='userdetailinfo_header_controls']//img[@class='sprite-close']")
	public WebElement closeuserIcon;
	// div[@id='userdetailinfo_header_controls']//img[@class='sprite-close']

	// td[contains(text(),'END1COB')]

	@FindBy(xpath = "//td[contains(text(),'END1COB')]")
	public WebElement userdata;

	@FindBy(xpath = "//a[@id='menuForm:search']")
	public WebElement workflowTabDashboard;

	@FindBy(xpath = "//a[@id='menuForm:fav']")
	public WebElement myfavtab;

	@FindBy(xpath = "//a[@title='Add to your favourites.']")
	public List<WebElement> starBtn;

}
