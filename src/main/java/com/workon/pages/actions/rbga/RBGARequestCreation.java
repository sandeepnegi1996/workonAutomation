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

	public void switchToRbgaRequestCreation() throws InterruptedException {
		switchToSecondTab(driver);
	}

	// click checkbox Element

	public void clickCheckBoxElement() {
		click(rbgaRequestLocator.checkboxElement);

	}

	// type brief Description

	public void typeBriefDescription() {
		type(rbgaRequestLocator.briefDescriptionElement, "This is sample test Request Please ignore");

	}

	// Type Full Description

	public void typeFullDescription() {
		type(rbgaRequestLocator.descriptionElement, "This is the description for the request RBGA");

	}

	// click workflow
	// from Page

	// return firstApproverButton

	public WebElement findFirstAddApproverBtn() {
		return rbgaRequestLocator.approverBtn.get(0);

	}

	// click first Approver Button
	public void clickfirstApproverButton() {
		click(findFirstAddApproverBtn());

	}

	// Add an Approver
	// addApprover
	public RBGARequestCreation addApprover() {

		type(rbgaRequestLocator.enterNtid, "end1cob");
		action.sendKeys(Keys.chord(Keys.ENTER)).perform();
		click(rbgaRequestLocator.selectNtid);

		return this;
	}

	
	// click on submit button

	// display request
	
	
	
	
	
	
	
	
	//Below Code is for Feedback
	//need to put this code in Some Common class
	
	

	public void gotoCloseFeedbackform() throws InterruptedException {

		switchToSecondTab(driver);

		// clicking the tick mark

		click(rbgaRequestLocator.checkboxElement);

		boolean isActive = true;
		try {
			driver.findElement(By.xpath("//div[@title='Close Feedback']//input[@value='x']"));
		} catch (NoSuchElementException e) {
			System.out.println(e);
			System.out.println("=====   X is not present    =======");
			isActive = false;

		}

		if (isActive) {
			// click(driver.findElement(By.xpath("//div[@title='Close
			// Feedback']//input[@value='x']")));

			// if we have "X" then go inside and check inside also
			// whether "X" is present or not

			// open the feedback form

			click(rbgaRequestLocator.feedbackbtn);
			System.out.println("======   Clicked on the feedback form =======");

			System.out.println("======    Waiting for some time ========");
			Thread.sleep(3000);

			click(driver.findElement(By.xpath("//div[@id='closeFeedbackForm']//input[@value='x']")));

			System.out.println("====== Closing feedback form =======");
		}

	}

	public void findFeedbackformPresence() throws InterruptedException {

		// this function will go and check the property for the "X"
		// wher the element is present or not

		// how we will use this in our test case is like this
		// open feedbackform close feedback form
		//

		click(rbgaRequestLocator.feedbackCloseBtn);

		String checkingDisplayAttribute = rbgaRequestLocator.feedbackCloseBtn.getCssValue("display");

		if (checkingDisplayAttribute.equals("none")) {
			System.out.println("======   form is closed properly   ========");
		}

		if (checkingDisplayAttribute.equals("block")) {
			System.out.println("=======  form not closed    =============");
		}

		Thread.sleep(3000);

	}

}
