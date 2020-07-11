package com.workon.pages.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.workon.base.Page;
import com.workon.pages.actions.amlactglibmae.AMLACTGLIBMAERequestCreation;
import com.workon.pages.actions.apmaze.APMAZERequestCreation;
import com.workon.pages.actions.emeaavg.EMEAAVGRequestCreation;
import com.workon.pages.actions.rbga.RBGARequestCreation;
import com.workon.pages.actions.rbubkpa.RBUBKPA_RequestCreation;
import com.workon.pages.actions.stga.STGA_RequestCreation;
import com.workon.pages.locators.SearchPageLocators;

public class SearchPage extends Page {

	public SearchPageLocators searchpage;

	public SearchPage() {
		this.searchpage = new SearchPageLocators();

		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 15);

		PageFactory.initElements(factory, this.searchpage);

	}

	public RBGARequestCreation gotoRBGA() throws InterruptedException {
		type(searchpage.searchInput, "RBGA");

		System.out.println("searching rbga in the search bar");

		// this will press enter after searching
		action.moveToElement(searchpage.searchInput).sendKeys(Keys.ENTER).build().perform();

		// click on the new request of the RBGA
	
		click(searchpage.rbgaNewRequest);
		
		
		
		//Thread.sleep(3000);
		
		//returning the object of RBGARequestCreation page
		
		return new RBGARequestCreation();
		

	}

	public APMAZERequestCreation gotoAPMAZE() throws InterruptedException {

		type(searchpage.searchInput, "APMAZE");
		System.out.println("APMAZE being searched");
		action.moveToElement(searchpage.searchInput).sendKeys(Keys.ENTER).build().perform();

		//after searching click on the new Request
		
		click(searchpage.apmazeNewRequest);
		
		//Thread.sleep(3000);
		
		return new APMAZERequestCreation();

	}

	public void gotoTRAVEL() throws InterruptedException {

		type(searchpage.searchInput, "TRAVEL");
		System.out.println("TRAVEL being searched");
		action.moveToElement(searchpage.searchInput).sendKeys(Keys.ENTER).build().perform();

		
		//click on the new Request
		Thread.sleep(3000);

	}

	public RBUBKPA_RequestCreation gotoRBUBKPA() throws InterruptedException {

		type(searchpage.searchInput, "RBUBKPA");
		System.out.println("RBUBKPA being searched");
		
		action.moveToElement(searchpage.searchInput).sendKeys(Keys.ENTER).build().perform();

		click(searchpage.rbubkpaNewRequest);
	
		return  new RBUBKPA_RequestCreation();
	}

	public STGA_RequestCreation gotoSTGA() throws InterruptedException {

		type(searchpage.searchInput, "STGA");
		System.out.println("STGA being searched");
		action.moveToElement(searchpage.searchInput).sendKeys(Keys.ENTER).build().perform();

		click(searchpage.stgaNewRequest);
		
		return new STGA_RequestCreation();

	}
	
	
	public EMEAAVGRequestCreation gotoEMEAAVG() throws InterruptedException {

		type(searchpage.searchInput, "EMEAAVG");
		System.out.println("EMEAAVG being searched");
		action.moveToElement(searchpage.searchInput).sendKeys(Keys.ENTER).build().perform();

		click(searchpage.emeaavgNewRequest);
		
		return new EMEAAVGRequestCreation();

	}
	public void gotoAPGA() throws InterruptedException {

		type(searchpage.searchInput, "APGA");
		System.out.println("APGA being searched");
		action.moveToElement(searchpage.searchInput).sendKeys(Keys.ENTER).build().perform();
		
		
		


		

	}
	
	public AMLACTGLIBMAERequestCreation gotoAMLACTGLIBMAE() throws InterruptedException {

		type(searchpage.searchInput, "AMLACTGLIBMAE");
		System.out.println("AMLACTGLIBMAE being searched");
		action.moveToElement(searchpage.searchInput).sendKeys(Keys.ENTER).build().perform();

		//clicking on the new Request for AMLACTGLIBMAE
		click(searchpage.amlactglibmaeNewRequest);
		
		return new AMLACTGLIBMAERequestCreation();
	

	}
	
	
	
	
	

}
