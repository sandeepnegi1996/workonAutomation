package com.workon.base;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.workon.utilities.loggers.*;

public class Page {

	public static WebDriver driver = null;
	public static Actions action = null;
	public static WebDriverWait wait = null;
	public static ChromeOptions chromeoptions = null;

	public static void initConfiguration() {

		String baseURL = Constant.DASHBOARD_Q_URL;

		if (driver == null) {

			if (Constant.BROWSER_NAME.equals("chrome")) {

				setChromeDriverPath();
				ChromeOptions chromeoptions = setChromeOptions();
				driver = new ChromeDriver(chromeoptions);

			}

			else if (Constant.BROWSER_NAME.equals("firefox")) {
				driver = new FirefoxDriver();

			}
			driver.manage().window().maximize();
			driver.get(baseURL);
			action = new Actions(driver);
			wait = new WebDriverWait(driver, 10);
			Log.info("webdriver is created");

		}

	}

	// quitBrowser
	public static void quitBrowser() {

		if (driver != null) {

			driver.quit();
			driver = null;

		}
	}

	// a function to set the chromedriverpath and thechromeoptions

	public static void setChromeDriverPath() {
		String chromedriverPath = System.getProperty("user.dir")
				+ "\\src\\test\\resources\\executable\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", chromedriverPath);

	}

	public static void setFirefoxDriverPath() {
		String firefoxdriverpath = System.getProperty("user.dir")
				+ "\\src\\test\\resources\\executable\\geckodriver.exe";

		System.setProperty("webdriver.gecko.driver", firefoxdriverpath);

	}

	public static ChromeOptions setChromeOptions() {
		chromeoptions = new ChromeOptions();
		chromeoptions.addArguments("start-maximized");

		chromeoptions.addArguments("disable-extensions");

		chromeoptions.addArguments("--disable-popup-blocking");

		chromeoptions.addArguments("--diable-infobars");

		return chromeoptions;
	}

	// click

	public static void click(WebElement element) {
		element.click();
		Log.info("Clicked on the element:  " + element.toString());

	}

	// type

	public void type(WebElement element, String inputString) {
		element.sendKeys(inputString);
		Log.info("Typed on the element :  " + element.toString());
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

	/*
	 * TODO 1. Refactor the above code means comment them 2. Call the switchToAnyTab
	 * whereever I am calling the switchToSecondTab and switchToThirdTab run the
	 * tests again and check whether it is working or not
	 * 
	 */

	// any child class can use this function to switch to the new tab
	public void switchToAnyTab(WebDriver driver, int tabNumber) {

		System.out.println("******  Switching to Second Tab  ************");
		Set<String> windowID = driver.getWindowHandles();
		Iterator<String> itr = windowID.iterator();

		// i want to traverse the number of times the value is passed in the argument
		// so if two times i should traverse two times
		String currentTab = "";
		for (int i = 1; i <= tabNumber; i++) {
			currentTab = itr.next();
		}

		driver.switchTo().window(currentTab);

	}

	// use to select an element by value
	// this will be used if there is a dropdown
	public void selectOption(WebElement element, String value) {

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

		Log.info("=====================================");
		Log.info(getRequestKey());
		Log.info("======================================");
	}

	// This function is redundant i will remove it later
	// this will get the request key from the workon page
	public String getRequestKey() {
		return driver.findElement(By.xpath("//b[contains(text(),'Key:')]//following-sibling::b//a")).getText();

	}

	// click on submit button
	public void clickOnSubmitButton() {

		boolean isSubmitButtonPresent = isElementPresent(By.cssSelector("#WorkOnSubmitButton"));

		if (isSubmitButtonPresent) {
			driver.findElement(By.cssSelector("#WorkOnSubmitButton")).click();
			Log.info("Request is Submitted");
		}

	}

	// Is Element Present here I am using fluentWait to wait for sometime
	//

	public static boolean isElementPresent(final By by) {

		FluentWait<WebDriver> fluentwait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofMillis(200)).ignoring(NoSuchElementException.class);

		WebElement element = fluentwait.until(new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver t) {

				return driver.findElement(by);
			}

		});

		if (element != null) {
			Log.info("Element is present :  " + by.toString());
			return true;
		}

		return false;

	}

	/*
	 * 
	 * Get Element Text will check that the element is present or not and if the
	 * element is present it will get the text for the element
	 */

	public static String getElementText(By by) {

		boolean isStatus = isElementPresent(by);

		if (isStatus) {
			return driver.findElement(by).getText();
		}

		return "";
	}

}
