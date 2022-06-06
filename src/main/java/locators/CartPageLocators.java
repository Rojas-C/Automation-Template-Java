package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPageLocators {

    @FindBy(xpath = "//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]")
    public WebElement checkOutButton;

    @FindBy(id = "first-name")
    public WebElement firstNameField;

    @FindBy(id = "last-name")
    public WebElement lastNameField;

    @FindBy(id = "postal-code")
    public WebElement postalCodeField;

    @FindBy(xpath = "/html/body/div/div[2]/div[3]/div/form/div[2]/input")
    public WebElement continueButton;

    @FindBy(xpath = "/html/body/div/div[2]/div[3]/div/div[2]/div[8]/a[2]")
    public WebElement finishButton;

    @FindBy(className = "complete-header")
    public WebElement responseOrderLabel;
}
