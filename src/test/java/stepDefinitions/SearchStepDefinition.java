package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.HomePage;
import pages.LoginPage;

import static stepDefinitions.HomePageStepDefinition.driver;

public class SearchStepDefinition {

    HomePage homePage;

    @And("user enter name of item to search for")
    public void userEnterNameOfItemToSearchFor() {
        homePage = new HomePage(driver);
        homePage.search("laptop");
    }

    @And("user clicked on search button")
    public void userClickedOnSearchButton() {
        homePage.clickOnSearchBtn();
    }

    @Then("user should have products contains the searched word")
    public void userShouldHaveProductsContainsTheSearchedWord() {
    }
}
