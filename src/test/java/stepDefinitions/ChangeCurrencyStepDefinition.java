package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.HomePage;
import pages.LoginPage;

import static stepDefinitions.HomePageStepDefinition.driver;

public class ChangeCurrencyStepDefinition {

    HomePage homePage;

    @And("user change currency from usd to euro")
    public void userChangeCurrencyFromUsdToEuro() {
        homePage = new HomePage(driver);
        homePage.changeCurrencyFromUsdToEuro();
    }

    @Then("all products shown are in euro")
    public void allProductsShownAreInEuro() {
    }
}
