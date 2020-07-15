package com.workon.base;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/*import io.github.bonigarcia.wdm.WebDriverManager;*/

public class Page {

	public static WebDriver driver = null;
	public static Actions action = null;
	public static WebDriverWait wait = null;

	// initConfiguration
	public static void initConfiguration() throws InterruptedException {

		// currently we are passing the base url as the dashboard url for the Q

		String baseURL = Constant.dashboardQUrl;

		if (driver == null) {

			if (Constant.browser.equals("chrome")) {

				/* WebDriverManager.chromedriver().setup(); */

				// WebDriverManager.chromedriver().proxy("rb-proxy-apac.bosch.com").proxyUser("end1cob").proxyPass("S@ndep123456").setup();

				String chromedriverPath = System.getProperty("user.dir")
						+ "\\src\\test\\resources\\executable\\chromedriver.exe";

				System.setProperty("webdriver.chrome.driver", chromedriverPath);
				
				ChromeOptions chromeoptions = new ChromeOptions();

				// chromeoptions.addArguments("--headless");
				chromeoptions.addArguments("start-maximized");

				chromeoptions.addArguments("disable-extensions");

				chromeoptions.addArguments("--disable-popup-blocking");

				chromeoptions.addArguments("--diable-infobars");

				driver = new ChromeDriver(chromeoptions);

			}

			else if (Constant.browser.equals("firefox")) {

				System.out.println(System.getProperty("user.dir"));

				String firefoxdriverpath = System.getProperty("user.dir")
						+ "\\src\\test\\resources\\executable\\geckodriver.exe";

				System.setProperty("webdriver.gecko.driver", firefoxdriverpath);

				driver = new FirefoxDriver();

			}

			driver.manage().window().maximize();
			driver.get(baseURL);
			action = new Actions(driver);
			System.out.println(" webdriver object is initialized");

		}

	}

	/*
	 * // clear cache
	 * 
	 * public static void clearCache() throws InterruptedException {
	 * 
	 * String chromedriverPath = System.getProperty("user.dir") +
	 * "\\src\\test\\resources\\executable\\chromedriver.exe";
	 * 
	 * System.setProperty("webdriver.chrome.driver", chromedriverPath);
	 * ChromeOptions chromeoptions = new ChromeOptions();
	 * 
	 * 
	 * // chromeoptions.addArguments("--headless");
	 * chromeoptions.addArguments("start-maximized");
	 * 
	 * chromeoptions.addArguments("disable-extensions");
	 * 
	 * chromeoptions.addArguments("--disable-popup-blocking");
	 * 
	 * chromeoptions.addArguments("--diable-infobars");
	 * 
	 * driver = new ChromeDriver(chromeoptions);
	 * 
	 * driver.get("chrome://settings/clearBrowserData"); Thread.sleep(5000);
	 * 
	 * driver.switchTo().activeElement();
	 * 
	 * driver.findElement(By.cssSelector("* /deep/ #clearBrowsingDataConfirm")).
	 * click();
	 * 
	 * Thread.sleep(5000);
	 * 
	 * }
	 * 
	 * 
	 * 
	 * //launch with cache disabled
	 * 
	 * @SuppressWarnings("deprecation") public static void launchWithoutCache() {
	 * 
	 * 
	 * String chromedriverPath = System.getProperty("user.dir") +
	 * "\\src\\test\\resources\\executable\\chromedriver.exe";
	 * 
	 * System.setProperty("webdriver.chrome.driver", chromedriverPath);
	 * DesiredCapabilities cap=DesiredCapabilities.chrome();
	 * cap.setCapability("applicationCacheEsnabled", false); driver=new
	 * ChromeDriver(cap);
	 * 
	 * }
	 * 
	 */

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

		System.out.println("******  Switching to Second Tab  ************");
		Set<String> windowID = driver.getWindowHandles();
		Iterator<String> itr = windowID.iterator();
		String firstWindow = itr.next();
		String secondWindow = itr.next();
		driver.switchTo().window(secondWindow);

	}

	// use this function to switch to the third tab

	public void switchToThirdTab(WebDriver driver) {

		System.out.println("******  Swtiching to third tab ************");
		Set<String> windowID = driver.getWindowHandles();
		Iterator<String> itr = windowID.iterator();
		String firstWindow = itr.next();
		String secondWindow = itr.next();
		String thirdWindowId = itr.next();
		driver.switchTo().window(thirdWindowId);

	}

	// use to select an element by value
	public void selectOption(WebElement element, String value) {
		// here we are selecting by value

		Select select = new Select(element);
		select.selectByValue(value);

	}

	// clickOnWorkflowTab

	public void clickOnWorkflowTab() {
		driver.findElement(By.xpath("//a[contains(text(),'Workflow')]")).click();
	}

	// display Request Key
	// instead of display request key it should be getRequestKey
	public void displayRequestKey() {

		System.out.println();
		System.out.println("  ================  " + getRequestKey() + "  =================");
		System.out.println();

	}

	// This function is redundant i will remove it later
	// this will get the request key from the workon page
	public String getRequestKey() {
		return driver.findElement(By.xpath("//b[contains(text(),'Key:')]//parent::td//following-sibling::b//a"))
				.getText();

	}

	// click on submit button
	public void clickOnSubmitButton() {
		driver.findElement(By.cssSelector("#WorkOnSubmitButton")).click();
		System.out.println("submitting the request");
	}

}
