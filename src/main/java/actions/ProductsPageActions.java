package actions;

import helpers.ButtonHelper;
import helpers.TextBoxHelper;
import locators.ProductsPageLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.SeleniumDriver;

import java.util.List;

public class ProductsPageActions {

    ProductsPageLocators productsPageLocators = null;
    ButtonHelper buttonHelper = new ButtonHelper();

    //Constructor
    public ProductsPageActions()
    {
        this.productsPageLocators=new ProductsPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), productsPageLocators);
    }

    //Actions

    /**
     * Getting products page title
     * @return page title label "Products"
     */
    public String getProductsPageTitle()
    {
        return productsPageLocators.pageName.getText();
    }

    /**
     * Getting products cards
     * @param Locator WebElement
     * @return List of products
     */
    public static List<WebElement> GetProducts(By Locator)
    {
        return SeleniumDriver.getDriver().findElements(Locator);
    }

    /**
     * Getting number of products from the products list
     * @return list size
     */
    public int getNumberOfProducts()
    {
        //The following list gets all card products that the div inventory_list has, these divs has, by class name: inventory_item
        List<WebElement> products = GetProducts(By.xpath(".//div[@class='inventory_item']"));
        return products.size();
    }

    /**
     * Getting a random product from the list
     * @return a number from 1 to list size
     */
    public int getARandomProduct()
    {
        int card = getNumberOfProducts();
        System.out.println("The number of products are: "+card);
        return (int) (Math.random() * card + 1);
    }

    /**
     * Clicking action on any "Add to Cart" button
     * @param index taken from a random product
     */
    public void clickOnAnyAddToCartButton(int index)
    {
        System.out.println("The card selected is the number: "+index);
        //SeleniumDriver.getDriver().findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div/div["+index+"]/div[3]/button")).click();
        buttonHelper.click(SeleniumDriver.getDriver().findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div/div["+index+"]/div[3]/button")),"Add_To_Cart_button");
    }

    /**
     * Clicking action on cart icon
     */
    public void clickOnCart()
    {
        //productsPageLocators.cartButton.click();
        buttonHelper.click(productsPageLocators.cartButton, "Cart_Button");
    }
}
