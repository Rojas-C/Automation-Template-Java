package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {

    //locators
    @FindBy(className = "form_input")
    public WebElement userNameField;

    @FindBy(id = "password")
    public WebElement passwordField;

    @FindBy(className = "btn_action")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"login_button_container\"]/div/form/h3")
    public WebElement loginErrorMessage;
}
