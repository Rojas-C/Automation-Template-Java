package helpers;

import cucumber.api.Scenario;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.SeleniumDriver;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GenericHelper {

    /**
    public static WebElement isElementVisible(WebElement element){
        //Explicit wait
        WebDriverWait wait = new WebDriverWait(SeleniumDriver.getDriver(),5);
        WebElement elementVisible = wait.until(ExpectedConditions.visibilityOf(element));
        SeleniumDriver.log.info("Validation id element is present: "+element);
        return elementVisible;
    }
     **/

    /**
     * Getting a time stamp to set a unique number in some cases
     * @return
     */
    public String getUniqueTimestamp(){
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy_hhmmss");
        Date curDate = new Date();
        return sdf.format(curDate);
    }

    /**
     * Taking screenshot
     * @param scenario
     */
    public void takeScreenshot(Scenario scenario){
        WebDriver driver = SeleniumDriver.getDriver();
        byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshotBytes, "image/png");//Embeds data into the report
    }

}
