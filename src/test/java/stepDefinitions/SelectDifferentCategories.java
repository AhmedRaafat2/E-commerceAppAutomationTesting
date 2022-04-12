package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.HomePage;
import pages.LoginPage;

import static stepDefinitions.HomePageStepDefinition.driver;

public class SelectDifferentCategories {

    HomePage homePage;

    @And("user hover on electronic category")
    public void userHoverOnElectronicCategory() {
        homePage = new HomePage(driver);
        homePage.hoverOnElectronicsCat();
    }

    @And("user click on cellPhone category")
    public void userClickOnCellPhoneCategory() {
        homePage.clickOnCellPhoneCat();
    }

    @Then("cell phones should appear to the user")
    public void cellPhonesShouldAppearToTheUser() {
    }
}
