package actions;

import helpers.ButtonHelper;
import helpers.TextBoxHelper;
import locators.CartPageLocators;
import org.openqa.selenium.support.PageFactory;
import utils.SeleniumDriver;

import java.util.Random;

public class CartPageActions {

    CartPageLocators cartPageLocators=null;
    TextBoxHelper textBoxHelper = new TextBoxHelper();
    ButtonHelper buttonHelper = new ButtonHelper();

    //Constructor
    public CartPageActions()
    {
        this.cartPageLocators = new CartPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), cartPageLocators);
    }

    //Actions

    /**
     * Clicking action on check out button
     */
    public void clickOnCheckoutButton()
    {
        //cartPageLocators.checkOutButton.click();
        buttonHelper.click(cartPageLocators.checkOutButton, "Check_out_button");
    }

    /**
     * Getting a random string
     * @return a random string with max 20 characters long.
     */
    public String getARandomString()
    {
        char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        StringBuilder sb = new StringBuilder(20);
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }
        String output = sb.toString();
        return output;
    }

    /**
     * Getting a random postal code
     * @return random number as string, between 1 to 10.0000, will be used as test postal code.
     */
    public String getARandomPostalCode()
    {
        int number = (int) (Math.random() * 100000 + 1);
        return String.valueOf(number);
    }

    /**
     * Action to type in the first name field, using getARandomString()
     */
    public void typeTheFirstName()
    {
        //cartPageLocators.firstNameField.sendKeys(getARandomString());
        textBoxHelper.type(cartPageLocators.firstNameField,getARandomString(), "First_name_field" );
    }

    /**
     * Action to type in the last name field, using getARandomString()
     */
    public void typeTheLastName()
    {
        //cartPageLocators.lastNameField.sendKeys(getARandomString());
        textBoxHelper.type(cartPageLocators.lastNameField,getARandomString(), "Last_name_field" );
    }

    /**
     * Action to type in the postal code field, using getARandomPostalCode()
     */
    public void typeThePostalCode()
    {
        //cartPageLocators.postalCodeField.sendKeys(getARandomPostalCode());
        textBoxHelper.type(cartPageLocators.postalCodeField,getARandomPostalCode(), "Postal_Code_field" );
    }

    /**
     * Clicking action on continue button
     */
    public void clickOnContinueButton()
    {
        //cartPageLocators.continueButton.click();
        buttonHelper.click(cartPageLocators.continueButton, "Continue_button" );
    }

    /**
     * Clicking action on finish button
     */
    public void clickOnFinishButton()
    {
        //cartPageLocators.finishButton.click();
        buttonHelper.click(cartPageLocators.finishButton, "Finish_button" );
    }

    /**
     * Getting the respond order when buying process is finished
     * @return the respond order label
     */
    public String getRespondOrder()
    {
        return cartPageLocators.responseOrderLabel.getText();
    }

}
