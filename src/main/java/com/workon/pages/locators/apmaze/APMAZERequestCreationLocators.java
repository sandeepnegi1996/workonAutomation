package com.workon.pages.locators.apmaze;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class APMAZERequestCreationLocators {
	
	@FindBy(xpath="//a[contains(text(),'Request Data')]")
	public WebElement requestDataElement;
	
	
	
	@FindBy(xpath="//span[contains(text(),'Subject')]//parent::label[@class='rb_WorkON_LabelArea']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create')]//input[@type='text']")
	public WebElement subjectElement;
	
	@FindBy(xpath="//label[contains(text(),'Summary')]//parent::div[@class='rb_WorkON_FieldContainer']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ')]//input[@type='text']")
	public WebElement summary;
	
	
	@FindBy(xpath="//span[contains(text(),'Phone')]//parent::label[@class='rb_WorkON_LabelArea']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create')]//input[@type='text']")
	public WebElement phoneNumber;
	
	
	@FindBy(xpath="//label[contains(text(),'Part Name *')]//parent::div[@class='rb_WorkON_FieldContainer']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ')]//input[@type='text']")
	public WebElement partName;

}
