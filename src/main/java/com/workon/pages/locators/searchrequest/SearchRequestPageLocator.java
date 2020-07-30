package com.workon.pages.locators.searchrequest;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchRequestPageLocator {

	@FindBy(xpath = "//td[@class='nav status']")
	public List<WebElement> statusList;
	
	
	
	//td[@class='nav issuekey']//a
	
	
	@FindBy(xpath = "//td[@class='nav issuekey']//a")
	public List<WebElement> issueKeyList;
	
	
	
	@FindBy(xpath="//textarea")
	public WebElement textareaElement;
	
	//span[contains(text(),'Please enter the comments!')]//following-sibling::div//input//following-sibling::textarea
	
	
	@FindBy(xpath="//span[contains(text(),'Please enter the comments!')]//following-sibling::div//input//following-sibling::textarea")
	public WebElement commentBoxElement;
	
	//button[contains(text(),'OK')]
	

	@FindBy(xpath="//button[contains(text(),'OK')]")
	public WebElement okButtonElement;
	
	
	//input[@type='submit' and @name='Create']
	
	@FindBy(xpath="//input[@type='submit' and @name='Create']")
	public WebElement createButtonElement;
	
	
	
	//input[@id='createFromDraftButton']
	
	
	@FindBy(xpath="//input[@id='createFromDraftButton']")
	public WebElement createDraftButtonElement;
	
	
	//below elements are first checked whether they are present or not
	//SaveAsDraftButton
	
	
	  @FindBy(css="#saveAsDraftButton") 
	  public WebElement saveAsDraftButtonElement;
	  
	  
	  //WorkOnSubmitButton
	  
	  @FindBy(css="#WorkOnSubmitButton") public WebElement
	  workONSubmitButtonElement;
	  
	  
	  
	  //cancelCreateButton //This is the cancel button with id as
	 // cancelCreateButton
	  
	  @FindBy(css="#WorkOnSubmitButton") public WebElement
	  cancelCreateButtonElement;
	 
	//b[contains(text(),'Key:')]//parent::td//following-sibling::b//a"
	
	@FindBy(xpath="//b[contains(text(),'Key:')]//parent::td//following-sibling::b//a")
	public WebElement requestKeyElement;
	
	
	
	//b[contains(text(),'Status:')]//parent::td
	
	@FindBy(xpath="//b[contains(text(),'Status:')]//parent::td")
	public WebElement requestStatusElement;
	
	
	
	//b[contains(text(),'Applicant:')]//parent::td
	//Applicant Name
	@FindBy(xpath="//b[contains(text(),'Applicant:')]//parent::td")
	public WebElement applicantNameElement;
	
	
	
	
	
	@FindBy(css="#creationDate")
	public WebElement createdDateElementElement;
	
	
	
	
	@FindBy(xpath="//b[contains(text(),'Priority:')]//parent::td")
	public WebElement priorityDateElement;
	
	
	
	//DeleteDraft
	@FindBy(xpath="//a[contains(text(),'Delete Draft")
	public WebElement deleteDraftElement;
	
	
	//CopyButtonElement
	@FindBy(xpath="//a[contains(text(),'Copy')]")
	public WebElement copyButtonElement;
	
	
	
	//a[contains(text(),'Print')]
	@FindBy(xpath="//a[contains(text(),'Print')]")
	public WebElement printButtonElement;



	//a[contains(text(),'Suspend')]
	@FindBy(xpath="//a[contains(text(),'Suspend')]")
	public WebElement suspendButtonElement;
	
	
	//span[contains(text(),'Please enter a reason for suspending this request:')]//following-sibling::div//input//following-sibling::textarea")
	

	@FindBy(xpath="//span[contains(text(),'Please enter a reason for suspending this request:')]//following-sibling::div//input//following-sibling::textarea")
	public WebElement suspendReasonTextareaElement;



	@FindBy(xpath="//a[contains(text(),'Resume')]")
	public WebElement resumeButtonElement;


	@FindBy(xpath="//span[contains(text(),'Please enter a reason for resuming this request:')]//following-sibling::div//input//following-sibling::textarea")
	public WebElement resumeReasonTextareaElement;



	@FindBy(xpath="//textarea[@id='comment']")
	public WebElement forwardButtonElement;



	
	//textarea[@id='comment']
	@FindBy(xpath="//textarea[@id='comment']")
	public WebElement commentBoxAfterForward;


	//div[@id='pickButton:system.field.boschassignee']
	@FindBy(xpath="//div[@id='pickButton:system.field.boschassignee']")
	
	public WebElement userpicker;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
