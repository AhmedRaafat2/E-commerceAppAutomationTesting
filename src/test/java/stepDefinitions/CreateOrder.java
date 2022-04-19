package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.ShoppingCart;
import static stepDefinitions.Hooks.driver;

public class CreateOrder {
    ShoppingCart shoppingCart;

    @And("user complete order")
    public void userCompleteOrder() {
        shoppingCart = new ShoppingCart(driver);
        shoppingCart.completeOrder();
    }

    @Then("order placed successfully")
    public void orderPlacedSuccessfully() {
        WebElement orderTitle = driver.findElement(By.xpath("//h1"));
        Assert.assertEquals(orderTitle.getText(), "Thank you");

        String url = "https://demo.nopcommerce.com/checkout/completed";
        Assert.assertEquals(driver.getCurrentUrl(),url);
    }
}
