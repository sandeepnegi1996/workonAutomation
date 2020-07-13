package com.workon.pages.actions.rbubkpa;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.workon.base.Page;
import com.workon.pages.locators.rbubkpa.RBUBKPARequestCreationLocators;

public class RBUBKPA_RequestCreation extends Page {

	public RBUBKPARequestCreationLocators rbubkpa;

	public RBUBKPA_RequestCreation() {
		this.rbubkpa = new RBUBKPARequestCreationLocators();

		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 15);
		PageFactory.initElements(factory, this.rbubkpa);

	}

	/*
	 * This thing will only work in Q because of div selection and divs class in
	 * different in P and Q and D
	 */
	
	
	
	public void createRbubkpaRequest() throws InterruptedException {

		switchToSecondTab(driver);

		type(rbubkpa.subject, " Testing rbubkpa please ignore");

		type(rbubkpa.summary, "Summary of the RBUBKPA");

		// click the second check box

		click(rbubkpa.ResponsibleBuyer);

		type(rbubkpa.phoneNumber, "7973882172");

		type(rbubkpa.buyersCode, "123456");

		// select Group

		selectOption(rbubkpa.group, "org_cp_abx_pd_workon_ab1_admin_group");

		selectOption(rbubkpa.purchasingApprovaType, "Incoterm or Payment Term");

		type(rbubkpa.partNumber, "1234");

		type(rbubkpa.plantSpecificVendorCode, "123445");

	
		clickOnWorkflowTab();
		

		/* List<WebElement> deleteApprovalList=new ArrayList<WebElement>(); */

		wait = new WebDriverWait(driver, 15);

		/*
		 * List<WebElement> unselectableDiv = driver
		 * .findElements(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-6']"));
		 * 
		 * for (WebElement element : unselectableDiv) {
		 * 
		 * // System.out.println(
		 * "**** Checking the size of div "+unselectableDiv.size());
		 * 
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * 
		 * String scriptSetAttr =
		 * "arguments[0].setAttribute(arguments[1],arguments[2])";
		 * 
		 * js.executeScript(scriptSetAttr, element, "unselectable", "off");
		 * 
		 * System.out.println(" *****   check value of Div property " +
		 * element.getAttribute("unselectable"));
		 * 
		 * }
		 */

	
		
		  for (WebElement element : rbubkpa.deleteApprovalBtn) {

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

			

			click(rbubkpa.deleteApprovalBtn.get(0));

			System.out.println("DELETE BUTTON IS CLICKED");

			Thread.sleep(2000);

			// wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='ext-comp-1024']")));

			click(driver.findElement(By.xpath("//button[contains(text(),'Yes')]")));

			System.out.println(" ******   Deleting the existing Approvers in the list *******");

			//Thread.sleep(4000);

			//switchToSecondTab(driver);

		}

	

		WebElement firstAddApproverBtn = rbubkpa.approverBtn.get(0);

		click(firstAddApproverBtn);

		type(rbubkpa.enterNtid, "end1cob");
		action.sendKeys(Keys.chord(Keys.ENTER)).perform();

		click(rbubkpa.selectNtid);

		// click on the submit button
		click(rbubkpa.submitBtn);

		System.out.println("**** Submitted the request  ****");

		System.out.println(" ***  Printing the request key after the request is submitted  ***");

		displayRequestKey();

	}

}
