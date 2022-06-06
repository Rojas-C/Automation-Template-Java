package helpers;

import org.openqa.selenium.WebElement;
import utils.SeleniumDriver;

public class TextBoxHelper {

    /**
     * Type action on any text box
     * @param element WebElement to be used
     * @param value Text that will be entered in the field
     * @param elementName Any element name
     */
    public static void type(WebElement element, String value, String elementName){
        element.sendKeys(value);
        SeleniumDriver.log.info("Typing in an Element: " + elementName + " entered value as: "+value);
    }

    /**
     * NO YET IMPLEMENTED
     * @param element
     */
    public static void clear(WebElement element){

    }
}
