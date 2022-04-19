package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.HomePage;
import pages.SearchPage;

import static stepDefinitions.Hooks.driver;

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

    @Then("awesome products page should appear to the user")
    public void awesomeProductAppear() {
        String awesomeUrl = "https://demo.nopcommerce.com/awesome";
        Assert.assertEquals(driver.getCurrentUrl(), awesomeUrl);
    }
}
