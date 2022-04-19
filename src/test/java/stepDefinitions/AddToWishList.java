package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.BooksPage;
import java.util.List;
import static stepDefinitions.Hooks.driver;

public class AddToWishList {
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
        List<WebElement> itemsName = driver.findElements(By.xpath("//a[@class=\"product-name\"]"));
        Assert.assertEquals(itemsName.get(0).getText(),"Fahrenheit 451 by Ray Bradbury");
        Assert.assertEquals(itemsName.get(1).getText(),"First Prize Pies");
        Assert.assertEquals(itemsName.get(2).getText(),"Pride and Prejudice");

        List<WebElement> itemsQty = driver.findElements(By.xpath("//input[@class=\"qty-input\"]"));
        int qty = 0;
        for (WebElement qtyElement : itemsQty){
            qty += Integer.getInteger(qtyElement.getAttribute("value"));
        }
        System.out.println("qty : "+qty);
        Assert.assertEquals(qty,3);

        WebElement whishListTitle = driver.findElement(By.xpath("//h1"));
        Assert.assertEquals(whishListTitle.getText(), "Wishlist");
    }
}
