package com.workon.pages.locators.emeaavg;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EMEAAVGRequestCreationLocators {
	
	
	@FindBy(xpath="//span[contains(text(),'Reason for Admin Access*')]//parent::label[@class='rb_WorkON_LabelArea']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create')]//textarea[contains(@class,'textarea')]")
    public WebElement reasonAdminAcess;
	
	
	
	
	//span[contains(text(),'System type*')]//parent::label[@class='rb_WorkON_LabelArea']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create')]//select
	
	@FindBy(xpath="//span[contains(text(),'System type*')]//parent::label[@class='rb_WorkON_LabelArea']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create')]//select")
    public WebElement systemTypeOption;
	
	
	@FindBy(xpath="//span[contains(text(),'Region*')]//parent::label[@class='rb_WorkON_LabelArea']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create')]//select")
    public WebElement regionOption;
	
	
	@FindBy(xpath="//span[contains(text(),'Type of Request*')]//parent::label[@class='rb_WorkON_LabelArea']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create')]//select")
    public WebElement typeOfRequestOption;
	
	
	@FindBy(xpath="//span[contains(text(),'System Name(s)*')]//parent::label[@class='rb_WorkON_LabelArea']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create')]//input")
    public WebElement systemName;
	
	
	
	@FindBy(xpath="//span[contains(text(),'Domain\\Account Name  Domain\\Group Name*')]//parent::label[@class='rb_WorkON_LabelArea']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create')]//input")
    public WebElement domainAccountName;
	

	
	//add the department
	
	
	@FindBy(xpath="//div[contains(@class,'WorkOnCls-UserPicker-PickTrigger')]")
    public List<WebElement> departmentManagerCost;
	
	//add the approver
	
	//clear the approval list
	
	@FindBy(xpath="//button[contains(text(),'Clear approval list')]")
	public List<WebElement> clearApprovalList;
	
	
	
	
	//add an approver 
	
	
	@FindBy(xpath="//button[contains(text(),'Add an approver')]")
	public  List<WebElement> approverBtn;
	
	
	@FindBy(css="#NameFilterField")
	public WebElement enterNtid;
	
	@FindBy(xpath="//div[contains(@class,'x-grid3-cell-inner x-grid3-col-name')]")
	public WebElement selectNtid;
	

	//submit
	@FindBy(css="#WorkOnSubmitButton")
	public WebElement submitBtn;
	
	//get the key
	
	
	@FindBy(xpath="//b[contains(text(),'Key:')]//parent::td//following-sibling::b//a")
	public WebElement emeaavgKey;
	

	
	
	
}
