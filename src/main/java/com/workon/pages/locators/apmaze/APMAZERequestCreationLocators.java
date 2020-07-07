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
	
	@FindBy(xpath="//label[contains(text(),'Priority')]//parent::div[@class='rb_WorkON_FieldContainer']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ')]//select")
	public WebElement priorityDropDown;
	
	@FindBy(xpath="//div[@class='rb_WorkON_FieldContainer']//div[@class='rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create rb_WorkON_ValueArea_Wide']//select")
	public WebElement rbtaElement;
	
	@FindBy(xpath="//label[contains(text(),'Business')]//parent::div[@class='rb_WorkON_FieldContainer']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ')]//input[@type='text']")
	public WebElement business;
	
	
	@FindBy(xpath="//label[contains(text(),'Line or Process *')]//parent::div[@class='rb_WorkON_FieldContainer']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ')]//input[@type='text']")
	public WebElement process;
	
	
	@FindBy(xpath="//label[contains(text(),'Machine Name *')]//parent::div[@class='rb_WorkON_FieldContainer']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ')]//input[@type='text']")
	public WebElement machine;
	
	
	@FindBy(xpath="//label[contains(text(),'Maximum Stock *')]//parent::div[@class='rb_WorkON_FieldContainer']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ')]//input[@type='text']")
	public WebElement maximumStock;
	
	
	@FindBy(xpath="//label[contains(text(),'Reorder point *')]//parent::div[@class='rb_WorkON_FieldContainer']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ')]//input[@type='text']")
	public WebElement reorderPoint;
	
	@FindBy(xpath="//label[contains(text(),'Description (Brand,Models) *')]//parent::div[@class='rb_WorkON_FieldContainer']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ')]//textarea[@class='textarea']")
	public WebElement description;
	
	@FindBy(xpath="//label[contains(text(),'Reason (M-FMEA) *')]//parent::div[@class='rb_WorkON_FieldContainer']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ')]//input[@type='text']")
	public WebElement reason;
	
	@FindBy(xpath="//label[contains(text(),'Delivery Time *')]//parent::div[@class='rb_WorkON_FieldContainer']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ')]//input[@type='text']")
	public WebElement delivery;
	
	
	@FindBy(xpath="//label[contains(text(),'Description / Remarks')]//parent::div[@class='rb_WorkON_FieldContainer']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ')]//textarea[@class='textarea']")
	public WebElement descriptionTextArea;
	
	@FindBy(xpath="//a[contains(text(),'Workflow')]")
	public WebElement workflow;
	
	@FindBy(xpath="//img[@class='ApprovalListGridControlButton_Edit']")
	public WebElement editPosition;
	
	@FindBy(xpath="//input[@id='NameFilterField']")
	public WebElement enterNTid;
	
	@FindBy(xpath="//td[contains(@class,'x-grid3-col x-grid3-cell x-grid3-td-name x-grid3-cell-first')]")
	public WebElement selectNTIDApmazeXPath;
	
	@FindBy(css="#WorkOnSubmitButton")
	public WebElement submitBtn;
	
	
	
	@FindBy(xpath="//b[contains(text(),'Key:')]//parent::td//following-sibling::b//a")
	public WebElement apmazekey;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
