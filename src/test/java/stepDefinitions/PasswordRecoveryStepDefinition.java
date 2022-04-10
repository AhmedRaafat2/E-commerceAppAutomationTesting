package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.HomePage;
import pages.LoginPage;
import pages.PasswordRecoveryPage;

import static stepDefinitions.HomePageStepDefinition.driver;

public class PasswordRecoveryStepDefinition {

    LoginPage loginPage;
    PasswordRecoveryPage passwordRecoveryPage;


    @And("user clicked on forgot password")
    public void userClickedOnForgotPassword() {
        loginPage = new LoginPage(driver);
        loginPage.clickForgetPassword();
    }

    @And("user entered email for reset password")
    public void userEnteredEmailForResetPassword() {
        passwordRecoveryPage = new PasswordRecoveryPage(driver);
        passwordRecoveryPage.enterEmail("aaaaa@aaaa.aaaa");
    }

    @And("user clicked on recover button")
    public void userClickedOnRecoverButton() {
        passwordRecoveryPage.clickOnRecoverBtn();
    }

    @Then("user should have a success message for recover")
    public void userShouldHaveASuccessMessageForRecover() {
    }
}
