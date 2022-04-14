package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.BooksPage;
import pages.LoginPage;

import static stepDefinitions.HomePageStepDefinition.driver;

public class AddToCompare {


    LoginPage loginPage;
    BooksPage booksPage;


    @And("user add items to compare list")
    public void userAddItemsToCompareList() {
        booksPage = new BooksPage(driver);
        booksPage.addItemsToCompare();
    }

    @And("user navigate to compare list")
    public void userNavigateToCompareList() {
        booksPage.openComparePage();
    }

    @Then("added items should appear at compare list")
    public void addedItemsShouldAppearAtCompareList() {
    }
}
