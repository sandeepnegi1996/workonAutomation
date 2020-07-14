package com.workon.pages.locators.rbubkpa;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RBUBKPARequestCreationLocators {
	
	

	@FindBy(xpath="//span[contains(text(),' Subject *')]//parent::label[@class='rb_WorkON_LabelArea']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create')]//input[@type='text']")
	public WebElement subject;
	
	
	
	@FindBy(xpath="//label[contains(text(),'Summary')]//parent::div[@class='rb_WorkON_FieldContainer']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ')]//input[@type='text']")
	public WebElement summary;
	

	@FindBy(xpath="//label[contains(text(),'Responsible buyer identical with applicant?')]//parent::div[@class='rb_WorkON_FieldContainer']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ')]//table[@class='workonstdtable']//tbody//tr//td//input[@type='checkbox']")
	public WebElement ResponsibleBuyer;
	
	
	

	@FindBy(xpath="//label[contains(text(),'Phone *')]//parent::div[@class='rb_WorkON_FieldContainer']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ')]//input[@type='text']")
	public WebElement phoneNumber;
	
	
	@FindBy(xpath="//label[contains(text(),'Buyer Code*')]//parent::div[@class='rb_WorkON_FieldContainer']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ')]//input[@type='text']")
	public WebElement buyersCode;
	
	
	@FindBy(xpath="//label[contains(text(),'Group*')]//parent::div[@class='rb_WorkON_FieldContainer']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ')]//select")
	public WebElement group;
	
	
	@FindBy(xpath="//label[contains(text(),'Purchasing Approval type*')]//parent::div[@class='rb_WorkON_FieldContainer']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ')]//select")
	public WebElement purchasingApprovaType;
	
	
	@FindBy(xpath="//label[contains(text(),'Material Group')]//parent::div[@class='rb_WorkON_FieldContainer']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ')]//textarea[@class='textarea']")
	public WebElement materialGroup;
	
	
	@FindBy(xpath="//label[contains(text(),'Part Number*')]//parent::div[@class='rb_WorkON_FieldContainer']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ')]//textarea[@class='textarea']")
	public WebElement partNumber;
	
	
	@FindBy(xpath="//label[contains(text(),'Plant specific vendor Code*')]//parent::div[@class='rb_WorkON_FieldContainer']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ')]//textarea[@class='textarea']")
	public WebElement plantSpecificVendorCode;
	
	
	
	@FindBy(xpath="//td//div//span//img[@class='ApprovalListGridControlButton_Delete']")
	public List<WebElement> deleteApprovalBtn;
	
	@FindBy(xpath="//button[contains(text(),'Add an approver')]")
	public  List<WebElement> approverBtn;
	
	
	@FindBy(css="#NameFilterField")
	public WebElement enterNtid;
	
	@FindBy(xpath="//div[contains(@class,'x-grid3-cell-inner x-grid3-col-name')]")
	public WebElement selectNtid;
	

	
	
	
	
	
}
