package com.workon.pages.locators.apga;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class APGARequestCreationLocators {

	@FindBy(xpath = "//label[contains(.,'I have read and agreed the usage agreement above.')]//preceding-sibling::input")
	public WebElement checkboxElement;
	
	
	@FindBy(xpath="//span[contains(text(),'RGB:*')]//parent::label[@class='rb_WorkON_LabelArea']//following-sibling::div[@class='rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ']//select")
	public WebElement rgbElement;
	
	@FindBy(xpath="//span[contains(text(),'Predefined Workflow:*')]//parent::label[contains(@class,'rb_WorkON_LabelArea')]//following-sibling::div[@class='rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ']//select")
	public WebElement predinedWorkflow;


	@FindBy(xpath="//label[contains(text(),'Brief Description:*')]//following-sibling::div[@class='rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ']//input")
	public WebElement briefDescription;


	@FindBy(xpath="//span[contains(text(),'Comments:*')]//parent::label[@class='rb_WorkON_LabelArea']//following-sibling::div[@class='rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ']//textarea")
	public WebElement comments;
	
	
	@FindBy(xpath="//img[@class='ApprovalListGridControlButton_Edit']")
	public List<WebElement> approvalGridList;
	
	@FindBy(css = "#NameFilterField")
	public WebElement enterNtid;

	@FindBy(xpath = "//div[contains(@class,'x-grid3-cell-inner x-grid3-col-name')]")
	public WebElement selectNtid;

}
