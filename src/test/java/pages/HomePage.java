package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HomePage {

    @FindBy(linkText = "Register")
    WebElement registerBtn;
    @FindBy(linkText = "Log in")
    WebElement loginBtn;
    @FindBy(id = "small-searchterms")
    WebElement searchBox;
    @FindBy(xpath = "//button[contains(text(),'Search')]")
    WebElement searchButton;
    @FindBy(id = "customerCurrency")
    WebElement selectCurrency;
    //@FindBy(xpath = "//ul[@class=\"top-menu notmobile\"]//a[text()='Electronics ']")
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[2]/a[1]")
    //@FindBy(linkText = "Electronics ")
            WebElement electronicCat;
    //@FindBy(xpath = "//ul[@class=\"top-menu notmobile\"]//a[text()='Cell phones ']")
    //@FindBy(xpath = "Cell phones ")
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
    WebElement cellPhoneCat;


    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[3]/a[1]")
    WebElement apparelCat;
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]")
    WebElement shoesCat;
    @FindBy(id = "attribute-option-15")
    WebElement redColor;
    @FindBy(xpath = "//a[contains(text(),'Search')]")
    WebElement searchPage;






//    @FindBy(xpath = "//button[@class=\"button-2 product-box-add-to-cart-button\"]")
//    WebElement addToCard;
//    @FindBy(xpath = "//button[@class=\"button-2 add-to-wishlist-button\"]")
//    WebElement addToFav;
//    @FindBy(xpath = "//button[@class=\"button-2 add-to-compare-list-button\"]")
//    WebElement addToCompare;


    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        driver.manage().window().maximize();

//        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
//        //driver.wait(3000);

    }

    public void openHomePage() {
        driver.navigate().to("https://demo.nopcommerce.com/");
    }

    public void loginClick() {
        loginBtn.click();
    }

    public void registerClick() {
        registerBtn.click();
    }

    public void search(String item) {
        searchBox.sendKeys(item);
    }

    public void clickOnSearchBtn() {
        searchButton.click();
    }

    public void changeCurrencyFromUsdToEuro() {
        Select currency = new Select(selectCurrency);
        currency.selectByVisibleText("Euro");
    }

    public void hoverOnElectronicsCat() {
        Actions actions = new Actions(driver);
        actions.moveToElement(electronicCat).perform();
    }


    public void clickOnCellPhoneCat() {
        cellPhoneCat.click();
    }

    public void hoverOnapparelCat() {
        Actions actions = new Actions(driver);
        actions.moveToElement(apparelCat).perform();
    }

    public void clickOnShoesCat() {
        shoesCat.click();
    }

    public void selectRedColor() {
        redColor.click();
    }

    public void openSearchPage() {
        searchPage.click();
    }






}
