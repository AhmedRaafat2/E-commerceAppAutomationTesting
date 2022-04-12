package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.RegistrationPage;

import static stepDefinitions.HomePageStepDefinition.driver;

public class RegistrationStepDefinition {

    HomePage homePage;
    RegistrationPage registrationPage;

    @And("user clicked on register link")
    public void clickOnRegisterButton() {
        homePage = new HomePage(driver);
        homePage.registerClick();
    }

    @When("user selected gender")
    public void selectGender(){
        registrationPage = new RegistrationPage(driver);
        registrationPage.setGender("male");
    }

    @And("user entered first name")
    public void enterFirstName(){
        registrationPage.setFirstName("Ahmed");
    }
    @And("user entered last name")
    public void enterLastName(){
        registrationPage.setLastName("Ali");
    }

    @And("user selected birth of date")
    public void enterBirthOfDate(){
        registrationPage.setDayOfBirth(1);
        registrationPage.setMonthOfBirth("January");
        registrationPage.setYearOfBirth(1990);
    }

    @And("user entered email for registration")
    public void enterEmail(){
        registrationPage.setEmail("Ahmed@service.com");
    }
    @And("user entered company name")
    public void enterCompanyName(){
        registrationPage.setCompanyName("Alex");
    }
    @And("user entered password for registration")
    public void enterPassword(){
        registrationPage.setPassword("123456");
    }
    @And("user confirmed password for registration")
    public void confirmPassword(){
        registrationPage.confirmPassword("123456");
    }

    @And("user clicked on register button")
    public void userClickedOnRegisterButton() {
    }

}
