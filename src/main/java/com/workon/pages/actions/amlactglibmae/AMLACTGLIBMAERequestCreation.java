package com.workon.pages.actions.amlactglibmae;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.workon.base.Page;
import com.workon.pages.locators.amlactglibmae.AMLACTGLIBMAERequestCreationLocators;

public class AMLACTGLIBMAERequestCreation extends Page {

	public AMLACTGLIBMAERequestCreationLocators amlact;

	public AMLACTGLIBMAERequestCreation() {
		this.amlact = new AMLACTGLIBMAERequestCreationLocators();

		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 20);

		PageFactory.initElements(factory, this.amlact);
	}

	public void createNewRequest() throws InterruptedException {
		// TODO Auto-generated method stub

		switchToSecondTab(driver);

		System.out.println("inside the amlact request creation");

		click(amlact.informationElement);

		selectOption(amlact.firstDropdown, "CB - LAB EP");

		selectOption(amlact.plantDropdownElement, "CaP1");

		selectOption(amlact.divisionDropdownElement, "ArP/ADM");

		type(amlact.sectorElement, "BSW section");

		type(amlact.RamalElement, "BSW section");

		type(amlact.productElement, "This is the product car tyres");

		type(amlact.EmitnenttElement, "Eminnent Element is created");

		type(amlact.DescriciaElement, "This is the description of all the elements");

		type(amlact.firstDateInput, "2021-08-10");

		type(amlact.secondDateInput, "2021-08-10");

		type(amlact.textareaElement, "this is the text areas");

		// wait for some time after the form filling

		Thread.sleep(4000);

		clickOnWorkflowTab();

		for (WebElement element : amlact.deleteApprovalBtn) {

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

			click(amlact.deleteApprovalBtn.get(0));

			System.out.println("DELETE BUTTON IS CLICKED");

			Thread.sleep(2000);

			// wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='ext-comp-1024']")));

			click(driver.findElement(By.xpath("//button[contains(text(),'Sim')]")));

			System.out.println(" ******   Deleting the existing Approvers in the list *******");

		}

		click(amlact.approverBtn.get(0));

		type(amlact.enterNtid, "end1cob");
		action.sendKeys(Keys.chord(Keys.ENTER)).perform();

		click(amlact.selectNtid);

		// click on the submit button
		click(amlact.submitBtn);

		System.out.println("**** Submitted the request  ****");

		System.out.println(" ***  Printing the request key after the request is submitted  ***");

		displayRequestKey();
		

	}

}
