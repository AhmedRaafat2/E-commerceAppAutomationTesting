package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.BooksPage;
import pages.LoginPage;

import static stepDefinitions.HomePageStepDefinition.driver;

public class AddToWishList {


    LoginPage loginPage;
    BooksPage booksPage;

    @And("user add items to whish list")
    public void userAddItemsToWhishList() {
        booksPage = new BooksPage(driver);
        booksPage.addItemsToFav();
    }

    @And("user navigate to whish list")
    public void userNavigateToWhishList() {
        booksPage.openWhishListPage();
    }

    @Then("added items should appear at whish list")
    public void addedItemsShouldAppearAtWhishList() {
    }


}
