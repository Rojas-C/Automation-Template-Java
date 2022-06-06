package utils;

import helpers.LoggerHelper;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.log4j.Logger;

import java.util.concurrent.TimeUnit;

public class SeleniumDriver {

    private static SeleniumDriver seleniumDriver;
    //initialize WebDriver
    private static WebDriver driver;
    //initialize Timeouts
    private static WebDriverWait waitDriver;
    public final static int TIMEOUT = 30;
    public final static int PAGE_LOAD_TIMEOUT = 50;
    //logger
    public static Logger log = LoggerHelper.getLogger(SeleniumDriver.class);

    /**
     *Setting Up the Browser Driver
     */
    public static void initConfiguration() {
        if(Constants.browser.equals("Firefox")){
            System.setProperty("webdriver.gecko.driver",Constants.firefoxDriverPath);
            FirefoxOptions options = new FirefoxOptions();
            driver = new FirefoxDriver(options);
            log.info("LaunchingFirefox");
        }else if (Constants.browser.equals("Chrome")){
            System.setProperty("webdriver.chrome.driver", Constants.chromeDriverPath);
            ChromeOptions options = new ChromeOptions();
            driver = new ChromeDriver(options);
            log.info("LaunchingChrome");
        }else if (Constants.browser.equals("Edge")){
            System.setProperty("webdriver.edge.driver",Constants.edgeDriverPath);
            EdgeOptions options = new EdgeOptions();
            driver = new EdgeDriver(options);
            log.info("LaunchingEdge");
        }
        driver.manage().window().maximize();
        waitDriver = new WebDriverWait(driver, TIMEOUT);
        driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        String window = driver.getWindowHandle();
        log.info("Window ->"+window);
    }

    /**
     * Get Chrome Driver
     * @return
     */
    public static WebDriver getDriver() {
        return driver;
    }

    /**
     * Open the webpage
     * @param url
     */
    public static void openPage(String url) {
        try{
            log.info("Accessing to the following site: "+url);
            log.info("Driver-> "+driver);
            driver.get(url);
        }catch (Exception e){
            e.printStackTrace();
            log.error("Error: "+e);
        }
    }

    /**
     * Close and then quit the browser when the test case is executed
     */
    public static void tearDown() {
        if (driver != null) {
            driver.close();
            driver.quit();
            log.info("Closing Browser");
        }
        seleniumDriver = null;
    }

    /**
     * Wait for the webpage is completely loaded
     */
    public static void waitForPageToLoad()
    {
        try {
            Thread.sleep(5000);
            log.info("Waiting for page to load");
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            log.error("Error, the web page is not completely loaded. "+e);
        }
    }

    /**
     * Refresh page
     */
    public void refreshBrowser() {
        getDriver().navigate().refresh();
    }

    /**
     * Move back to the last visited page in the Browser
     */
    public void backBrowser() {
        getDriver().navigate().back();
    }

    /**
     * Return the current page title
     * @return
     */
    public String getTitlePage() {
        String PageTitle = getDriver().getTitle();
        return PageTitle;
    }

    /**
     * Maximize current browser instance
     */
    public void maximizeBrowser() {
        getDriver().manage().window().maximize();
    }

    /**
     * Given a Web Element press Enter when that element is focused
     * @param we
     */
    public void sendEnter(WebElement we) {
        we.sendKeys(Keys.ENTER);
    }

    /**
     * Get a particular cookie content based on the cookie name
     * @param cookieName
     * @return
     */
    public Cookie getCookies(String cookieName) {
        return getDriver().manage().getCookieNamed(cookieName);
    }

    /**
     * Switch to different window handle (works only for 2 window handles)
     */
    public void switchHandle() {
        String currentHandle = getDriver().getWindowHandle();
        for (String windowHandle : getDriver().getWindowHandles()) {
            if (!currentHandle.contentEquals(windowHandle)) {
                getDriver().switchTo().window(windowHandle);
            }
        }
    }
}
