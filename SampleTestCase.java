-2
Closed. This question needs debugging details. It is not currently accepting answers.

Want to improve this question? Update the question so it's on-topic for Stack Overflow.

Closed 2 years ago.
Improve this question

Sequential tests pass but parallel fails when run multiple times across different browsers. What am I doing wrong here ???

I tried with threadlocal but it didn't work for me. I checked with driver object hashcode and all tests have unique thread id and driver object hashcode till driver.get(url) and when page object methods starts all goes haywire. I tried with maven threadpoolsize to run in parallel but same results.

I am stuck. Any help is appreciated. Can't find a single blog which clearly explains parallel execution with page factory pattern. Simple scripts with all selenium actions written in test method itself work fine but not when you have to use page factory for code re-usability and maintenance.

Assume multiple test classes and multiple pages as in real scenario

    public class WebDriverManager {

        private static HashMap<Long, WebDriver> map = new HashMap<>();

        public static WebDriver getDriverInstance() {
            return map.get(Thread.currentThread().getId());
        }

        public static void startDriver(String OS_Browser) throws Exception {
            WebDriver driver;

            if (OS_Browser.equalsIgnoreCase("Win7_Chrome"))
                ChromeDriverManager.getInstance().version("2.31").setup();
                driver = new ChromeDriver();
                map.put(Thread.currentThread().getId(), driver);
        }

        public static void stopDriver() {
            WebDriver driver = map.get(Thread.currentThread().getId());
            if (null != driver) {
                driver.quit();
                driver = null;
            }
        }
    }

<!-- language: java -->

public class Login extends TestBase {

    @Parameters({"OS_Browser"})
    @BeforeMethod(alwaysRun = true)
    protected void oneTimeSetup(@Optional("Win7_Chrome") String OS_Browser) throws Exception {
        WebDriverManager.startDriver(OS_Browser);
    }

    @AfterMethod(alwaysRun = true)
    protected void oneTimeTeardown() {
        WebDriverManager.stopDriver();
    }


    @Test()
    public void Test_Error_Messages_For_Blank_Invalid_Incorrect_login_Credentials() throws Exception {
        WebDriver driver = WebDriverManager.getDriverInstance();
        driver.get(url);

        Login_Page LoginPage = new Login_Page(driver);

        LoginPage.wait_For_Login_PageLoad()
                // UI Validation
                .verify_Color_On_Links()
                .verify_Texts_On_Login_Page()
                .verify_Header_Logos()
                // Check error messages for blank email and password
                .click_SignIn()
                .wait_For_Blank_Credentials_Error_Message()
                // Check error messages for invalid email and password
                .login("admin", "admin")
                .wait_For_Invalid_Credentials_Error_Message()
                // Check error messages for incorrect email and password
                .login("admin@xyz.com", "admin")
                .wait_For_Incorrect_Credentials_Error_Message();
    }
}

public class Login_Page {

    private final WebDriver driver;

    @FindBy(css = "input#email")
    private WebElement login_username;
    @FindBy(css = "input#password")
    private WebElement login_password;
    @FindBy(css = "button#signin")
    private WebElement button_signIn;

    @FindBy(css = "a[ng-click*='terms']")
    private WebElement terms_of_use;
    @FindBy(css = "a[ng-click*='privacy']")
    private WebElement privacy_policy;
    @FindBy(css = "a[ng-click*='trademarks']")
    private WebElement trademarks;
    @FindBy(css = "a[ng-click*='ContactUs']")
    private WebElement contactus;

    @FindBy(css = "fieldset > div:nth-of-type(1) > p")
    private WebElement signin_text;
    @FindBy(css = ".container.ng-scope>img")
    private WebElement header_logo;

    @FindBy(css = "p[ng-show*='error.email'][aria-hidden='false']")
    private WebElement enter_valid_email_address_error_message;
    @FindBy(css = "p[ng-show*='loginform.emailaddress.$error.required'][aria-hidden='false']")
    private WebElement email_required_error_message;
    @FindBy(css = "p[ng-show*='loginform.password.$error.required'][aria-hidden='false']")
    private WebElement password_required_error_message;
    @FindBy(css = "span[translate='sign_error_msg']")
    private WebElement enter_correct_credentials;

    @FindBy(css = "img[src='img/common/ajax_progress.gif']")
    private WebElement pleaseWait;

    // Constructor takes a reference to the driver
    public Login_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public Login_Page click_SignIn() {
        button_signIn.click();
        return this;
    }

    public Login_Page login(String username, String password) {
        login_username.clear();
        login_username.sendKeys(username);

        login_password.clear();
        login_password.sendKeys(password);

        button_signIn.click();

        (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.invisibilityOf(pleaseWait));
        return this;
    }

    public Login_Page wait_For_Blank_Credentials_Error_Message() throws InterruptedException {
        (new WebDriverWait(driver, 10)).until(ExpectedConditions.and(
                ExpectedConditions.visibilityOf(password_required_error_message),
                ExpectedConditions.visibilityOf(email_required_error_message)));

        String emailRequiredErrorMessage = email_required_error_message.getText().trim();
        Assert.assertEquals(emailRequiredErrorMessage, "Your email address is required to proceed.");

        String passwordRequiredErrorMessage = password_required_error_message.getText().trim();
        Assert.assertEquals(passwordRequiredErrorMessage, "Your password is required to proceed.");

        return this;
    }

    public Login_Page wait_For_Invalid_Credentials_Error_Message() throws InterruptedException {
        (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.visibilityOf(enter_valid_email_address_error_message));

        String ErrorMessage = enter_valid_email_address_error_message.getText().trim();
        Assert.assertEquals(ErrorMessage, "Please enter the email address in a valid format.");

        return this;
    }

    public void wait_For_Incorrect_Credentials_Error_Message() {
        (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.visibilityOf(enter_correct_credentials));
        String ErrorMessage = enter_correct_credentials.getText().trim();
        Assert.assertEquals(ErrorMessage, "Sign-in credentials did not match. If you have not created an account with your email address and a password, you will need to do so before signing in.");
    }

    public Login_Page verify_Color_On_Links() {
        String blue_Link_Color = "#026091";
        List<WebElement> allLinks = driver.findElements(By.cssSelector("body a[href='#']"));
        for (WebElement ele : allLinks) {
            String color = ele.getCssValue("color");
            String colorInHex = Color.fromString(color).asHex();
            assertEquals(colorInHex, blue_Link_Color);
        }
        return this;
    }

    public Login_Page verify_Texts_On_Login_Page() {
        String actual1 = signin_text.getText().trim();
        String expected1 = "Please enter your email address and password in order to proceed.";
        Assert.assertTrue(actual1.contains(expected1));
        return this;
    }

    public Login_Page verify_Header_Logos() {
        int headerLogoWidth = header_logo.getSize().getWidth();
        int headerLogoHeight = header_logo.getSize().getHeight();
        Assert.assertEquals(headerLogoWidth, 480);
        Assert.assertEquals(headerLogoHeight, 100);
        return this;
    }

    public Login_Page wait_For_Login_PageLoad() {
        JSWaiter.waitJQueryAngular();
        (new WebDriverWait(driver, 15)).until(ExpectedConditions.and(
                ExpectedConditions.visibilityOf(login_username),
                ExpectedConditions.visibilityOf(login_password),
                ExpectedConditions.visibilityOf(button_signIn)));
        return this;
    }

}