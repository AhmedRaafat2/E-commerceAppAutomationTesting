package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.RegistrationPage;

public class HomePageStepDefinition {
    static WebDriver driver = null;
    HomePage homePage;
    RegistrationPage registrationPage;

    @Given("user open browser")
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
    }

    @And("user navigate to home page")
    public void openHomePage() {
        homePage.openHomePage();
    }


}
