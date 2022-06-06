package helpers;

import org.openqa.selenium.WebElement;
import utils.SeleniumDriver;

public class ButtonHelper {

    /**
     * Click action on any button
     * @param element
     * @param elementName
     */
    public static void click(WebElement element, String elementName){
        //GenericHelper.isElementVisible(element);
        element.click();
        SeleniumDriver.log.info("Clicking on an Element: "+elementName);
    }

    /**
     * NO YET IMPLEMENTED
     * @param element
     * @return
     */
    public static boolean isButtonEnabled(WebElement element){
        return true;
    }

    /**
     * NO YET IMPLEMENTED
     * @param element
     * @return
     */
    public static String getButtonLabel(WebElement element){
        return null;
    }
}
