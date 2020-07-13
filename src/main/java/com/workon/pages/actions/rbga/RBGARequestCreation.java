package com.workon.pages.actions.rbga;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.workon.base.Page;
import com.workon.pages.locators.rbga.RBGARequestCreationLocators;

public class RBGARequestCreation extends Page {

	public RBGARequestCreationLocators rbgaRequestLocator;

	public RBGARequestCreation() {

		this.rbgaRequestLocator = new RBGARequestCreationLocators();

		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 15);

		PageFactory.initElements(factory, this.rbgaRequestLocator);

	}

	public void rbgaRequestCreation() throws InterruptedException {

		switchToSecondTab(driver);

		// clicking the tick mark

		click(rbgaRequestLocator.tickMark);

		// Fill the subject

		type(rbgaRequestLocator.subject, "This is sample test Request Please ignore");

		// Fill the description
		type(rbgaRequestLocator.description, "This is the description for the request RBGA");


		clickOnWorkflowTab();
		
		// fill the approver details
		WebElement firstApproverBtn = rbgaRequestLocator.approverBtn.get(0);

		click(firstApproverBtn);

		// enter the ntid
		type(rbgaRequestLocator.enterNtid, "end1cob");
		action.sendKeys(Keys.chord(Keys.ENTER)).perform();

		click(rbgaRequestLocator.selectNtid);

		// click on the submit button
		click(rbgaRequestLocator.submitBtn);
		
		System.out.println("**** Submitted the request  ****");
		
		System.out.println(" ***  Printing the request key after the request is submitted  ***");
		
	
		
		
		displayRequestKey();
	}
	


	public void gotoCloseFeedbackform() throws InterruptedException {

		switchToSecondTab(driver);

		// clicking the tick mark

		click(rbgaRequestLocator.tickMark);

		boolean isActive = true;
		try {
			driver.findElement(By.xpath("//div[@title='Close Feedback']//input[@value='x']"));
		} catch (NoSuchElementException e) {
			System.out.println(e);
			System.out.println("=====   X is not present    =======");
			isActive = false;

		}

		if (isActive) {
			//click(driver.findElement(By.xpath("//div[@title='Close Feedback']//input[@value='x']")));
			
			//if we have "X" then go inside and check inside also 
			//whether "X" is present or not
			
			//open the feedback form
			
			click(rbgaRequestLocator.feedbackbtn);
			System.out.println("======   Clicked on the feedback form =======");
			
			System.out.println("======    Waiting for some time ========");
			Thread.sleep(3000);
			
			click(driver.findElement(By.xpath("//div[@id='closeFeedbackForm']//input[@value='x']")));
			
			System.out.println("====== Closing feedback form =======");
		}

		
	}
	
	public void findFeedbackformPresence() throws InterruptedException {
		
		//this function will go and check the property for the "X"
		//wher the element is present or not
		
		//how we will use this in our test case is like this
		//open feedbackform close feedback form
		//
		
		click(rbgaRequestLocator.feedbackCloseBtn);
		
		String checkingDisplayAttribute=rbgaRequestLocator.feedbackCloseBtn.getCssValue("display");
		
		if(checkingDisplayAttribute.equals("none")) {
			System.out.println("======   form is closed properly   ========");
		}
		
	
		if(checkingDisplayAttribute.equals("block")) {
			System.out.println("=======  form not closed    =============");
		}
		
		Thread.sleep(3000);
		
	}

}
