package com.workon.base;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Page {
	
	public static WebDriver driver=null;

	// initConfiguration
	public static void initConfiguration() {
		
		String baseURL=Constant.dashboardQUrl;
		int waitingTime=Constant.waitingTimeConstant;
		
		if(driver==null) {
			
			if(Constant.chromeBrowser.equals("chrome")) {
					
				//webdrivermanager
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
	
			}
		
		else if(Constant.firefoxBrowser.equals("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		
		}
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(waitingTime, TimeUnit.SECONDS);
			driver.get(baseURL);
	
	}

	}
	// quitBrowser
	public static void quitBrowser() {
		
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
