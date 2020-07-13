package com.workon.pages.locators.rbga;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class RBGARequestCreationLocators {

	@FindBy(xpath = "//body[contains(@class,'ext-safari')]/form[contains(@name,'workOnIssueForm')]/table[contains(@class,'jiraform maxWidth')]/tbody/tr/td[contains(@class,'rb_formArea')]/fieldset[contains(@class,'rb_WorkON_FieldSet')]/table/tbody/tr/td/div[contains(@class,'rb_WorkON_FieldContainer')]/div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create rb_WorkON_ValueArea_Wide')]/table[contains(@class,'workonstdtable')]/tbody/tr/td/input[1]")
	public WebElement tickMark;

	@FindBy(xpath = "//body[contains(@class,'ext-safari')]/form[contains(@name,'workOnIssueForm')]/table[contains(@class,'jiraform maxWidth')]/tbody/tr/td[contains(@class,'rb_formArea')]/fieldset[contains(@class,'rb_WorkON_FieldSet')]/table/tbody/tr[3]/td[1]/div[1]/div[1]/input[1]")
	public WebElement subject;

	@FindBy(xpath = "//tr[1]//td[1]//div[1]//div[1]//textarea[1]")
	public WebElement description;

	@FindBy(xpath = "//button[contains(text(),'Add an approver')]")
	public List<WebElement> approverBtn;

	@FindBy(css = "#NameFilterField")
	public WebElement enterNtid;

	@FindBy(xpath = "//div[contains(@class,'x-grid3-cell-inner x-grid3-col-name')]")
	public WebElement selectNtid;

	@FindBy(css = "#WorkOnSubmitButton")
	public WebElement submitBtn;


	// ================================================================

	@FindBy(xpath = "//div[@title='Close Feedback']//input[@value='x']")
	public WebElement feedbackCloseBtn;

	@FindBy(xpath = "//div[@id='btnFdBk']")
	public WebElement feedbackbtn;

}
