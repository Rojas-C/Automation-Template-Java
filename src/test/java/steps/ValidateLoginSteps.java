package steps;


import ExcelReader.ReadExcelFile;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import actions.LoginPageActions;
import actions.ProductsPageActions;
import org.testng.Assert;
import utils.SeleniumDriver;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ValidateLoginSteps {

    LoginPageActions loginPageActions= new LoginPageActions();
    ProductsPageActions productsPageActions = new ProductsPageActions();

    @Given("^the user visits the login page \"([^\"]*)\" of the application website$")
    public void theUserVisitsTheLoginPageOfTheApplicationWebsite(String webSiteURL){
        SeleniumDriver.openPage(webSiteURL);
    }

    @When("^the user add the user name \"([^\"]*)\"$")
    public void theUserAddTheUserName(String user){
        SeleniumDriver.waitForPageToLoad();
        loginPageActions.typeInUserField(user);
    }

    @And("^the user add the password \"([^\"]*)\"$")
    public void theUserAddThePassword(String pass){
        loginPageActions.typePasswordField(pass);
    }

    @And("^the user press Login button$")
    public void theUserPressLoginButton() {
        loginPageActions.clickInLoginButton();
    }

    @Then("^the user can accessing to the products page$")
    public void theUserCanAccessingToTheProductsPage() {
        SeleniumDriver.waitForPageToLoad();
        Assert.assertEquals("Products", productsPageActions.getProductsPageTitle());

    }

    @Then("^a error message is shown$")
    public void aErrorMessageIsShown() {
        Assert.assertEquals("Epic sadface: Username and password do not match any user in this service",
                loginPageActions.getLoginMessageError());
    }

    @Given("^the user is logged in with the user \"([^\"]*)\"$")
    public void theUserIsLoggedInWithTheUser(String user){
        loginPageActions.typeInUserField(user);
        loginPageActions.typePasswordField("secret_sauce");
        loginPageActions.clickInLoginButton();
    }

    @When("^the user enter the following for login$")
    public void theUserEnterTheFollowingForLogin(DataTable dt) {
        List<Map<String, String>> list = dt.asMaps(String.class, String.class);
        for(int i=0; i<list.size(); i++){
            String un = list.get(i).get("Username");
            String pw = list.get(i).get("Password");
            loginPageActions.typeInUserField(un);
            loginPageActions.typePasswordField(pw);

        }
    }

    @When("^the user enter the ([^\"]*) and ([^\"]*)$")
    public void theUserEnterTheUsernameAndPassword(String userName, String password) {
        loginPageActions.typeInUserField(userName);
        loginPageActions.typePasswordField(password);
    }

    @When("^User enters mandatory details of \"([^\"]*)\"$")
    public void userEntersMandatoryDetailsOf(String p) throws IOException {
        ReadExcelFile.ReadTestData();
        loginPageActions.typeInUserField(ReadExcelFile.hm1.get(p).get("UserName"));
        loginPageActions.typePasswordField(ReadExcelFile.hm1.get(p).get("Password"));
    }
}
