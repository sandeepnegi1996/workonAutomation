package com.workon.base;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Page {

	public static WebDriver driver = null;
	public static Actions action=null;

	// initConfiguration
	public static void initConfiguration() {

		//currently we are passing the base url as the dashboard url for the Q
		
		
		String baseURL = Constant.dashboardPUrl;

		if (driver == null) {

			if (Constant.chromeBrowser.equals("chrome")) {

				// webdrivermanager
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();

			}

			else if (Constant.firefoxBrowser.equals("firefox")) {

				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();

			}

			driver.manage().window().maximize();
			driver.get(baseURL);
			action=new Actions(driver);
			System.out.println("webdriver object is initialized");

		}

	}

	// quitBrowser
	public static void quitBrowser() {

		if (driver != null) {
			
			driver.quit();
			driver=null;
			
		}
	}

	// click

	public void click(WebElement element) {
		element.click();
		
		
	}

	// type

	public void type(WebElement element, String inputString) {
		element.sendKeys(inputString);
	}
	

	// any child class can use this function to switch to the new tab
	public void switchToSecondTab(WebDriver driver) {
		
		System.out.println("******  generating all the windows id ************");
		Set<String> windowID=driver.getWindowHandles();
		Iterator<String> itr= windowID.iterator();
		String firstWindow= itr.next();
		String secondWindow=itr.next();		
		driver.switchTo().window(secondWindow);
		
	}
	
	public void selectOption(WebElement element,String value) {
		//here we are selecting by value
		
		Select select =new Select(element);
		select.selectByValue(value);
		
		
	}
	
	

}
