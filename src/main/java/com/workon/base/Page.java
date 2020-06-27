package com.workon.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Page {
	
	public static WebDriver driver=null;

	// initConfiguration
	public  void initConfiguration() {
		
		if(driver==null) {
			
			//webdrivermanager
			WebDriverManager.chromedriver().setup();
			//webdriver
			
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	}


	// quitBrowser
	public void quitBrowser() {
		
		if(driver!=null) {
			driver.quit();
		}
	}
	

	// click

	public static void click(WebElement element) {
		element.click();
		System.out.println("Element is clicked "+element.getText());
	}

	// type

	
	  public static void type(WebElement element,String inputString) {
		  element.sendKeys(inputString);
		  
		  System.out.println("String is entered in the element"+element.getText());
	  }
	 
}
