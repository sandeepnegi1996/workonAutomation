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

	/*
	 * RBGA REQUEST CREATION PROCESS
	 * 1. switch to the new tab after clicking on the new request
	 * 2. click on the checkbox element
	 * 3. Fill the brief description since it is mandatory
	 * 4. Fill the full description since it is mandatory
	 * 5. Click on the workflow tab
	 * 6. find the button for add approver since there are multiple I am trying to find the first one
	 * 7. Add the approver by entering the ntid
	 * 8. Click on the submit button
	 * 9. Display Request Key
	 * 
	 */
	
	public void switchToRbgaRequestCreation() throws InterruptedException {
		switchToSecondTab(driver);
	}


	public void clickCheckBoxElement() {
		click(rbgaRequestLocator.checkboxElement);

	}


	public void typeBriefDescription() {
		type(rbgaRequestLocator.briefDescriptionElement, "This is sample test Request Please ignore");

	}



	public void typeFullDescription() {
		type(rbgaRequestLocator.descriptionElement, "This is the description for the request RBGA");

	}

	public WebElement findFirstAddApproverBtn() {
		return rbgaRequestLocator.approverBtn.get(0);

	}

	public void clickfirstApproverButton() {
		click(findFirstAddApproverBtn());

	}

	public RBGARequestCreation addApprover() {

		type(rbgaRequestLocator.enterNtid, "end1cob");
		action.sendKeys(Keys.chord(Keys.ENTER)).perform();
		click(rbgaRequestLocator.selectNtid);

		return this;
	}

	
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
