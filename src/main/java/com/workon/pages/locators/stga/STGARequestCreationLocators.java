package com.workon.pages.locators.stga;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class STGARequestCreationLocators {
	
	
	@FindBy(xpath="//a[contains(text(),'Request Data')]")
	public WebElement requestDataElement;

	@FindBy(xpath="//label[contains(text(),'Subject')]//parent::div[@class='rb_WorkON_FieldContainer']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ')]//input[@type='text']")
	public WebElement subjectElement;
	
	@FindBy(xpath="//label[contains(text(),'Summary')]//parent::div[@class='rb_WorkON_FieldContainer']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ')]//input[@type='text']")
	public WebElement summary;
	
	
	
	@FindBy(xpath="//span[contains(text(),'Process *')]//parent::label[@class='rb_WorkON_LabelArea']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create')]//select")
	public WebElement process;
	
	
	@FindBy(xpath="//label[contains(text(),'Subprocess *')]//parent::div[@class='rb_WorkON_FieldContainer']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ')]//select")
	public WebElement subprocess;
	
	

	@FindBy(xpath="//span[contains(text(),'Topic *')]//parent::label[@class='rb_WorkON_LabelArea']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create')]//input")
	public WebElement topic;
	
	
	@FindBy(xpath="//label[contains(text(),'Description / Notes')]//parent::div[@class='rb_WorkON_FieldContainer']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ')]//textarea")
	public WebElement description;
	
	
	@FindBy(xpath="//img[contains(@class,'DynamicGridControlButton_Delete')]//parent::a")
	public List<WebElement> deleteAdditionalFieldsBtn;

	
	@FindBy(xpath="//a[contains(text(),'Workflow')]")
	public WebElement workflowTab;
	
	@FindBy(xpath="//td//div//span//img[@class='ApprovalListGridControlButton_Delete']")
	public List<WebElement> deleteApprovalBtn;
	
	
	@FindBy(xpath="//button[contains(text(),'Add an approver')]")
	public  List<WebElement> approverBtn;
	
	
	@FindBy(css="#NameFilterField")
	public WebElement enterNtid;
	
	@FindBy(xpath="//div[contains(@class,'x-grid3-cell-inner x-grid3-col-name')]")
	public WebElement selectNtid;
	

	@FindBy(css="#WorkOnSubmitButton")
	public WebElement submitBtn;
	
	
	
	@FindBy(xpath="//b[contains(text(),'Key:')]//parent::td//following-sibling::b//a")
	public WebElement stgaKey;
	
	
	
}
