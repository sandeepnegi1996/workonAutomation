package com.workon.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPageLocators {

	@FindBy(xpath = "//a[contains(text(),'WorkON Central Search')]")
	public WebElement centralSearchLink;

}
