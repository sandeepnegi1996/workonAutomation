package com.workon.base;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/*import io.github.bonigarcia.wdm.WebDriverManager;*/

public class Page {

	public static WebDriver driver = null;
	public static Actions action = null;
	public static WebDriverWait wait=null;

	// initConfiguration
	public static void initConfiguration() {

		// currently we are passing the base url as the dashboard url for the Q

		String baseURL = Constant.dashboardQUrl;

		if (driver == null) {

			if (Constant.browser.equals("chrome")) {

				 
				/*
				 * ChromeOptions chromeoptions=new ChromeOptions();
				 * //chromeoptions.addArguments("--headless");
				 * chromeoptions.addArguments("start-maximized");
				 * 
				 * chromeoptions.addArguments("disable-extensions");
				 * 
				 * chromeoptions.addArguments("--disable-popup-blocking");
				 * 
				 * chromeoptions.addArguments("--diable-infobars");
				 */
				
				
				System.out.println(System.getProperty("user.dir"));
				
				
				
				String chromedriverPath=System.getProperty("user.dir")+"\\src\\test\\resources\\executable\\chromedriver.exe";
				
				System.setProperty("webdriver.chrome.driver",chromedriverPath);
				

					
				/* WebDriverManager.chromedriver().setup(); */
				
				
					 driver = new ChromeDriver(); 
				
					 
					/* WebDriverManager.firefoxdriver().setup(); */

				// WebDriverManager.chromedriver().proxy("rb-proxy-apac.bosch.com").proxyUser("end1cob").proxyPass("S@ndep123456").setup();

				/*WebDriverManager.chromedriver().arch64().proxy("rb-proxy-apac.bosch.com:8080").proxyUser("end1cob")
						.proxyPass("S%40ndeep123456").setup();*/

				/*WebDriverManager.chromedriver().driverVersion("83.0.4103.39").setup();
				driver = new ChromeDriver();*/

				
				/*
				 * WebDriverManager.chromedriver().proxy(
				 * "end1cob:S%40ndeep123456@rb-proxy-apac.bosch.com:8080").setup();
				 */
				/* driver = new ChromeDriver(); */
				/*
				 * driver=new FirefoxDriver();
				 */
				 
				/*
				 * System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") +
				 * "\\src\\main\\resources\\executables\\geckodriver.exe");
				 * 
				 * driver = new FirefoxDriver();
				 */

				
			}

			else if (Constant.browser.equals("firefox")) {

				/*
				 * WebDriverManager.firefoxdriver().setup(); driver = new FirefoxDriver();
				 */
				
				
				  System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") +
				  "\\src\\main\\resources\\executables\\geckodriver.exe");
				  
				  driver = new FirefoxDriver();
				 
			}

			driver.manage().window().maximize();
			driver.get(baseURL);
			action = new Actions(driver);
			System.out.println("webdriver object is initialized");

		}

	}
	
	
	
	
	

	// quitBrowser
	public static void quitBrowser() {

		if (driver != null) {

			driver.quit();
			driver = null;

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
		Set<String> windowID = driver.getWindowHandles();
		Iterator<String> itr = windowID.iterator();
		String firstWindow = itr.next();
		String secondWindow = itr.next();
		driver.switchTo().window(secondWindow);

	}

	public void selectOption(WebElement element, String value) {
		// here we are selecting by value

		Select select = new Select(element);
		select.selectByValue(value);

	}

}
