package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;
import pages.RegistrationPage;

import static stepDefinitions.HomePageStepDefinition.driver;

public class LoginStepDefinition {

    HomePage homePage;
LoginPage loginPage;

    @And("user clicked on login link")
    public void userClickedOnLoginLink() {
        homePage = new HomePage(driver);
        homePage.loginClick();
    }

    @And("user entered email for login")
    public void userEnteredEmailForLogin() {
        loginPage = new LoginPage(driver);
        loginPage.enterEmail("Ahmed_AAA@gmail.com");
    }

    @And("user entered password for login")
    public void userEnteredPasswordForLogin() {
        loginPage.enterPassword("123");
    }

    @And("user clicked on login button")
    public void userClickedOnLoginButton() {
        loginPage.clickLogIn();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("user should have a success message for login")
    public void userShouldHaveASuccessMessageForLogin() {
    }
}
