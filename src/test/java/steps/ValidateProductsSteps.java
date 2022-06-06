package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import actions.CartPageActions;
import actions.ProductsPageActions;
import org.testng.Assert;
import utils.SeleniumDriver;

public class ValidateProductsSteps {

    ProductsPageActions productsPageActions = new ProductsPageActions();
    CartPageActions cartPageActions = new CartPageActions();

    @When("^the user clicks to add cart button from any product$")
    public void theUserClicksToAddCartButtonFromAnyProduct() {
        SeleniumDriver.waitForPageToLoad();
        productsPageActions.clickOnAnyAddToCartButton(productsPageActions.getARandomProduct());
    }

    @And("^the user go to cart$")
    public void theUserGoToCart() {
        productsPageActions.clickOnCart();
    }

    @And("^the user clicks on checkout button$")
    public void theUserClicksOnCheckoutButton() {
        SeleniumDriver.waitForPageToLoad();
        cartPageActions.clickOnCheckoutButton();
    }

    @And("^the user enter its personal information$")
    public void theUserEnterItsPersonalInformation() {
        SeleniumDriver.waitForPageToLoad();
        cartPageActions.typeTheFirstName();
        cartPageActions.typeTheLastName();
        cartPageActions.typeThePostalCode();
        cartPageActions.clickOnContinueButton();
    }

    @And("^the user clicks on finish button$")
    public void theUserClicksOnFinishButton() {
        cartPageActions.clickOnFinishButton();
    }

    @Then("^the order is processed$")
    public void theOrderIsProcessed() {
        SeleniumDriver.waitForPageToLoad();
        Assert.assertEquals("THANK YOU FOR YOUR ORDER", cartPageActions.getRespondOrder());
    }
}
