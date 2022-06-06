package actions;

import helpers.ButtonHelper;
import helpers.TextBoxHelper;
import locators.LoginPageLocators;
import org.openqa.selenium.support.PageFactory;
import utils.SeleniumDriver;

public class LoginPageActions {

    LoginPageLocators loginPageLocators=null;
    TextBoxHelper textBoxHelper = new TextBoxHelper();
    ButtonHelper buttonHelper = new ButtonHelper();

    //Constructor
    public LoginPageActions()
    {
        this.loginPageLocators=new LoginPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(),loginPageLocators);
    }

    //Actions

    /**
     * Action to type userName in the user field
     * @param value
     */
    public void typeInUserField(String value)
    {
        //loginPageLocators.userNameField.sendKeys(value);
        textBoxHelper.type(loginPageLocators.userNameField, value, "User_Field");
    }

    /**
     * Action to type Password in the password field
     * @param value
     */
    public void typePasswordField(String value)
    {
        //loginPageLocators.passwordField.sendKeys(value);
        textBoxHelper.type(loginPageLocators.passwordField, value, "Password_Field");
    }

    /**
     * Clicking action on Login button
     */
    public void clickInLoginButton()
    {
        //loginPageLocators.loginButton.click();
        buttonHelper.click(loginPageLocators.loginButton, "Login_Button");
    }

    /**
     *
     * @return Message error when the login is unsuccessful
     */
    public String getLoginMessageError()
    {
        return loginPageLocators.loginErrorMessage.getText();
    }

}
