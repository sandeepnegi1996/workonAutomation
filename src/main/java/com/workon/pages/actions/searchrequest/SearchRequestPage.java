package com.workon.pages.actions.searchrequest;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.workon.base.Page;
import com.workon.pages.locators.searchrequest.SearchRequestPageLocator;
import com.workon.utilities.loggers.Log;

public class SearchRequestPage extends Page {
	
	public SearchRequestPageLocator searchrequestpagelocator=null;
	public SearchRequestPage() {
		
		this.searchrequestpagelocator=new SearchRequestPageLocator();
		
		AjaxElementLocatorFactory factory=new AjaxElementLocatorFactory(driver,20);
		
		PageFactory.initElements(factory, this.searchrequestpagelocator);
	}
	
	
	
	//methods from RBGARequestSearching
	
	
	public void switchToRequestSearching() throws InterruptedException {
		switchToSecondTab(driver);
	}
	
	

	
	
	//This method returns the row from the list which has status as "Draft"
	public int requestWithStatusAsDraft() {

		//List<WebElement> statusList = driver.findElements(By.xpath("//td[@class='nav status']"));
	
		String firstStatus = "";
		for (int i = 0; i < searchrequestpagelocator.statusList.size(); i++) {

			firstStatus = searchrequestpagelocator.statusList.get(i).getText();
			if (firstStatus.equals("Draft")) {
				Log.info("returned Row is " + i);
				return i;
			}
		}
		return 0;

	}

	
	//Based on above method this function will open the request with Status as Draft
	public void openRequestWithStatusDraft(int rowNumber) {
		

		//List<WebElement> keyList= driver.findElements(By.xpath("//td[@class='nav issuekey']//a"));
		
		Log.info("clicked on the row with key as "+searchrequestpagelocator.issueKeyList.get(rowNumber).getText());
		WebElement element = searchrequestpagelocator.issueKeyList.get(rowNumber);
		click(element);
		
	}
	
	
	
	//Give the row number and this function will get the request key from the list of requests
	
	public String getRequestKeyWithRowNumber(int rowNumber) {
		//List<WebElement> keyList= driver.findElements(By.xpath("//td[@class='nav issuekey']//a"));
		
		
		Log.info("clicked on the row with key as "+searchrequestpagelocator.issueKeyList.get(rowNumber).getText());
		return searchrequestpagelocator.issueKeyList.get(rowNumber).getText();
		
	}
	
	//Verify Text area Present or not
	public boolean  isTextAreaPresent() {
		return isElementPresent(By.xpath("//textarea"));
	}
	
	

	//Type the comment in the text area which is present in in isTextAreaPresent --> function
	public void typeComment() {
		// WebElement commentElement=driver.findElement(By.xpath("//span[contains(text(),'Please enter the comments!')]//following-sibling::div//input//following-sibling::textarea"));
		 
		type(searchrequestpagelocator.commentBoxElement,"This is the comment before deleting");
		 
	}

	// Click on the Comment 
	public void clickOnOkComment() {
		
		//WebElement okElement=driver.findElement(By.xpath("//button[contains(text(),'OK')]"));
		click(searchrequestpagelocator.okButtonElement);
		
	}

	
	//Input--> Request Key and this function will check in the list of tables whether it is present or not
	public boolean isRequestKeyAvailable(String deletedRequestKey) {
		
		//List<WebElement> keyList= driver.findElements(By.xpath("//td[@class='nav issuekey']//a"));
		
		List<WebElement> keyList= searchrequestpagelocator.issueKeyList;
		
		for(WebElement element:keyList) {
			String currentKey=element.getText();
			if(currentKey.equals(deletedRequestKey)) {
				return true;
			}
		}
		return false;
		
	}
	
	//Return the First Request WebElement from the list in the table using issuekey
	public WebElement getFirstRequest() {
		//List<WebElement> keyList= driver.findElements(By.xpath("//td[@class='nav issuekey']//a"));
		
		List<WebElement> keyList= searchrequestpagelocator.issueKeyList;
		
		String currentKey=keyList.get(0).getText();
		Log.info(currentKey);
		return keyList.get(0);
	}

	
	//Opening the First Request
	public void openingFirstRequest() {
		click(getFirstRequest());
	}
	

	public void clickOnCreateButton() {
		//click(driver.findElement(By.xpath("//input[@type='submit' and @name='Create']")));
	
		click(searchrequestpagelocator.createButtonElement);
	}
	
	

	//Click on the DraftSubmitButton
	public void clickOnDraftSubmitButton() {
		//click(driver.findElement(By.xpath("//input[@id='createFromDraftButton']")));
		click(searchrequestpagelocator.createDraftButtonElement);
	}
	
	
	
	//After Copying we want to check the request key this function will get the Request Key
	public void displayRequestKeyAfterCopying() {
		Log.info("Request Key is : " +getRequestKey());
	}
	
	
	
	
	//========================================================================
	
	//functions from SaveAsDraft
	
	
	// check the availability of Save as Draft

		public  boolean isSaveAsDraftPresent() {

			return isElementPresent(By.id("saveAsDraftButton"));

		}

		
		
		
		// check availability of submit button
		public  boolean isSubmitPresent() {
			return isElementPresent(By.id("WorkOnSubmitButton"));

		}
	
	
		
		
		// check availability of Reset Button

		public  boolean isResetPresent() {
			return isElementPresent(By.id("cancelCreateButton"));

		}
		
		
		
		public  void clickOnSaveAsDraft() {

			/* click(driver.findElement(By.id("saveAsDraftButton"))); */

			click(searchrequestpagelocator.saveAsDraftButtonElement);
		}
		
		
		public  boolean isKeyPresent() {
			return isElementPresent(By.xpath("//b[contains(text(),'Key:')]//parent::td//following-sibling::b//a"));
		}
		
		
		
		
		public  String getStatus() {

			return getElementText(By.xpath("//b[contains(text(),'Status:')]//parent::td"));

		}
		
		
		// getApplicantName

		public  String getApplicantName() {

			return getElementText(By.xpath("//b[contains(text(),'Applicant:')]//parent::td"));
		}
		
		
		
		
		
		
		
		
		
		/*
		 * //Below function will take the values as Status: Draft like ApplicantName:
		 * Sandeep
		 * 
		 * It will split and give us the second values
		 */

		public  String getTrimmedValue(String inputString) {

			String splittedArray[] = inputString.split(":");

			for (int i = 0; i < splittedArray.length; i++) {
				splittedArray[i] = splittedArray[i].trim();
			}

			return splittedArray[1];

		}
		
		
		
		public  String getCreatedDate() {

			return getElementText(By.id("creationDate"));

		}

		// get Priority

		public  String getPriority() {

			return getElementText(By.xpath("//b[contains(text(),'Priority:')]//parent::td"));
		}

		public  String getCurrentDate() {
			LocalDate localdate = LocalDate.now();
			return localdate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));

		}
		
		
		
		
		
		
		
		
		
		public static boolean isDeleteDraftButtonPresent() {
			return isElementPresent(By.xpath("//a[contains(text(),'Delete Draft')]"));
		}

		public  void clickOnDeleteDraft() {
			click(searchrequestpagelocator.deleteDraftElement);
		}

		public static boolean isCopyButtonPresent() {
			return isElementPresent(By.xpath("//a[contains(text(),'Copy')]"));
		}

		public  void clickOnCopyButton() {
			click(searchrequestpagelocator.copyButtonElement);
		}
		
		

		
		public  void clickOnPrintButton() {
			click(searchrequestpagelocator.printButtonElement);
		}
		
		
		public void switchToPrintPage() throws InterruptedException {
			switchToThirdTab(driver);
		}
		
		
			
		//check the bosch logo is present as we click on the bosch print page
		
		public boolean isBoschLogoPresent() {
			return isElementPresent(By.xpath("//div[@class='boschlogo']//img"));
		}
		
		
		
		public boolean isSuspendButtonPresent() {
			
			return isElementPresent(By.xpath("//a[contains(text(),'Suspend')]"));
		}
	//End of Methods
	
		
		public void clickOnSuspendButton() {
			click(searchrequestpagelocator.suspendButtonElement);
		}
		
		
	
	
		
	/*
	 * 
	 * TODO: Implement the general functionality of workon search request page
	 */
	
	
	
	
	public void clickonSearchButton() {
		
	}
	
	
	public void clickSearchAndHideParameters() {
		
		
	}
	
	public void clickOnDownloadAllResultsToExcel() {
		
	}
	
	
	public void clickOnNext() {
		
		
	}
	
	
	public void clickDeleteFilter() {
		
		
	}
	
	
	public void clickResetFilter() {
		
	}
	
	public void clickShowHideMoreOptions() {
		
	}



	public void typeSuspendReason() {

		
		type(searchrequestpagelocator.suspendReasonTextareaElement,"Testing please ignore suspend reason");
		
	}



	public boolean isResumeButtonPresent() {
		return isElementPresent(By.xpath("//a[contains(text(),'Resume')]"));
	}



	public void clickOnResumeButton() {
		click(searchrequestpagelocator.resumeButtonElement);
		
	}



	public void typeResumeRequestReason() {
		type(searchrequestpagelocator.resumeReasonTextareaElement,"Resuming the request please ignore");
		
	}



	public boolean isForwardButtonPresent() {
		// TODO Auto-generated method stub
		return isElementPresent(By.xpath("//textarea[@id='comment']"));
	}



	public void clickOnForwardButton() {
		// TODO Auto-generated method stub
		click(searchrequestpagelocator.forwardButtonElement);
		
	}



	public boolean isCommentBoxPresent() {
		// TODO Auto-generated method stub
		return isElementPresent(By.xpath("//textarea[@id='comment']"));
	}



	public void typeCommentInForwardForm(String string) {
		type(searchrequestpagelocator.commentBoxAfterForward,string);
		
	}



	public void clickOnUserPicker() {
		// TODO Auto-generated method stub
		click(searchrequestpagelocator.userpicker);
		
	}


	
	
	




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
