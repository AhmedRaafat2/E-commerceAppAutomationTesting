package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.BooksPage;
import pages.HomePage;
import pages.LoginPage;
import pages.SearchPage;

import static stepDefinitions.HomePageStepDefinition.driver;

public class AddToShoppingCart {


    LoginPage loginPage;
    BooksPage booksPage;

    @And("user navigate to books pages")
    public void userNavigateToBooksPages() {
        loginPage = new LoginPage(driver);
        loginPage.clickOnBooksCat();
    }

    @And("user add items to shopping cart")
    public void userAddItemsToShoppingCart() {
        booksPage = new BooksPage(driver);
        booksPage.addItemsToCart();
    }

    @And("user navigate to shoping cart")
    public void userNavigateToShopingCart() {
        booksPage.openShoppingCartPage();

    }

    @Then("added items should appear at shopping cart")
    public void addedItemsShouldAppearAtShoppingCart() {
    }

}
