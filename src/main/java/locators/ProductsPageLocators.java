package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPageLocators {

    //Locators
    @FindBy(className = "product_label")
    public WebElement pageName;

    @FindBy(className = "inventory_list")
    public WebElement productsList;

    @FindBy(className = "btn_primary btn_inventory")
    public WebElement addToCartButton;

    @FindBy(xpath = "/html/body/div/div[2]/div[1]/div[2]/a")
    public WebElement cartButton;

}
