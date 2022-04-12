package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.HomePage;
import pages.LoginPage;

import static stepDefinitions.HomePageStepDefinition.driver;

public class ChangeColorFilter {

    HomePage homePage;

    @And("user hover on apparel category")
    public void userHoverOnAppearlCategory() {
        homePage = new HomePage(driver);
        homePage.hoverOnapparelCat();
    }

    @And("user click on shoes category")
    public void userClickOnShoesCategory() {
        homePage.clickOnShoesCat();
    }

    @And("user change color to red")
    public void userChangeColorToRed() {
        homePage.selectRedColor();
    }

    @Then("shoes with red color only should appear to the user")
    public void shoesWithRedColorOnlyShouldAppearToTheUser() {
    }
}
