package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.HomePage;
import pages.LoginPage;
import pages.SearchPage;

import static stepDefinitions.HomePageStepDefinition.driver;

public class SelectDifferentTags {

    HomePage homePage;
SearchPage searchPage;

    @And("user open search page")
    public void userOpenSearchPage() {
        homePage = new HomePage(driver);
        homePage.openSearchPage();
    }

    @And("user choose awesome tag")
    public void userChooseAwesomeTag() {
        searchPage = new SearchPage(driver);
        searchPage.selectAwesomeTag();

    }

    @Then("awesome product should appear to the user")
    public void awesomeProductShouldAppearToTheUser() {
    }


}
