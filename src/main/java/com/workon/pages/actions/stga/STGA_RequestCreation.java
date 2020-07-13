package com.workon.pages.actions.stga;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.workon.base.Page;
import com.workon.pages.locators.stga.STGARequestCreationLocators;

public class STGA_RequestCreation extends Page {

	public STGARequestCreationLocators stga;

	public STGA_RequestCreation() {

		this.stga = new STGARequestCreationLocators();

		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 15);
		PageFactory.initElements(factory, this.stga);

	}

	public void createSTGARequest() throws InterruptedException {

		switchToSecondTab(driver);

		/* click(stga.requestDataElement); */

		type(stga.subjectElement, "Testing apga Request creation please ignore");

		type(stga.summary, "Testing apga Request Creation summary");

		selectOption(stga.process, "BT/PU");
		Thread.sleep(2000);

		selectOption(stga.subprocess, "Awarding approval");

		type(stga.topic, "This is the APGA Test Request");

		type(stga.description, "Description APGA");
		
		System.out.println("filled the desciption notes");
		

		for (WebElement element : stga.deleteAdditionalFieldsBtn) {

			// change the property to be unselectable off

			List<WebElement> unselectableDiv = driver
					.findElements(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-deleteColumn']"));

			JavascriptExecutor js = (JavascriptExecutor) driver;

			String scriptSetAttr = "arguments[0].setAttribute(arguments[1],arguments[2])";
			js.executeScript(scriptSetAttr, unselectableDiv.get(0), "unselectable", "off");

			System.out.println(
					" *****   check value of Div property " + unselectableDiv.get(0).getAttribute("unselectable"));

				
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	
			click(stga.deleteAdditionalFieldsBtn.get(0));

			
			
			System.out.println("Delete button is clicked");
			
			
			click(driver.findElement(By.xpath("//button[contains(text(),'Yes')]")));

			System.out.println(" ******   Deleting the  additional fields in the list *******");

		
			

		}
		
		
		clickOnWorkflowTab();
		
		
		
		
		
		 for (WebElement element : stga.deleteApprovalBtn) {

				// System.out.println(" ************ SIZE " + rbubkpa.deleteApprovalBtn.size());
				System.out.println(" ***********   insinde for loop");

				// div[@class='x-grid3-cell-inner x-grid3-col-6']
				// unselectable="on"

				List<WebElement> unselectableDiv2 = driver
						.findElements(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-6']"));

				JavascriptExecutor js = (JavascriptExecutor) driver;

				String scriptSetAttr = "arguments[0].setAttribute(arguments[1],arguments[2])";

				js.executeScript(scriptSetAttr, unselectableDiv2.get(0), "unselectable", "off");

				System.out.println(
						" *****   check value of Div property " + unselectableDiv2.get(0).getAttribute("unselectable"));

				

				click(stga.deleteApprovalBtn.get(0));

				System.out.println("DELETE BUTTON IS CLICKED");

				Thread.sleep(2000);

				// wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='ext-comp-1024']")));

				click(driver.findElement(By.xpath("//button[contains(text(),'Yes')]")));

				System.out.println(" ******   Deleting the existing Approvers in the list *******");

				//Thread.sleep(4000);

				//switchToSecondTab(driver);

			}

		

			WebElement firstAddApproverBtn = stga.approverBtn.get(0);

			click(firstAddApproverBtn);

			type(stga.enterNtid, "end1cob");
			action.sendKeys(Keys.chord(Keys.ENTER)).perform();

			click(stga.selectNtid);

			// click on the submit button
			click(stga.submitBtn);

			System.out.println("**** Submitted the request  ****");

			System.out.println(" ***  Printing the request key after the request is submitted  ***");
			
			
			
		displayRequestKey();
		
		
		
		
		
		
		

	}

}
