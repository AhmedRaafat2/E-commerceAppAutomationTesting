package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.HomePage;
import static stepDefinitions.Hooks.driver;

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
        WebElement redCheckBox = driver.findElement(By.id("attribute-option-15"));
        Assert.assertTrue(redCheckBox.isSelected());
    }
}
