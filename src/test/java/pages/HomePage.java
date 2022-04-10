package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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


}
