package com.workon.pages.locators.rbga;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class RBGARequestCreationLocators {

	@FindBy(xpath = "//label[contains(text(),'I have read and agreed the usage agreement above.')]//preceding-sibling::input[@type='checkbox']")
	public WebElement checkboxElement;
	
	@FindBy(xpath="//span[contains(text(),'Brief Description:*')]//parent::label[@class='rb_WorkON_LabelArea']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create')]//input[@type='text']")
	public WebElement briefDescriptionElement;
	
	@FindBy(xpath="//span[contains(text(),'Description:*')]//parent::label[@class='rb_WorkON_LabelArea']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create')]//textarea[@class='textarea']")
	public WebElement descriptionElement;
	
	@FindBy(xpath = "//button[contains(text(),'Add an approver')]")
	public List<WebElement> AddApproverBtn;

	@FindBy(css = "#NameFilterField")
	public WebElement enterNtid;

	@FindBy(xpath = "//div[contains(@class,'x-grid3-cell-inner x-grid3-col-name')]")
	public WebElement selectNtid;
	
	

	
	
	//=================================================================
	
	@FindBy(xpath="//a[contains(text(),'Approve')]")
	public WebElement approverBtn;
	
	
	
	
	// ================================================================

	@FindBy(xpath = "//div[@title='Close Feedback']//input[@value='x']")
	public WebElement feedbackCloseBtn;

	@FindBy(xpath = "//div[@id='btnFdBk']")
	public WebElement feedbackbtn;

	
	
	

}
