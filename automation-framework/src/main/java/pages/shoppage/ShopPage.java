package pages.shoppage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ShopPage {

    protected  WebDriver webDriver;

    public  ShopPage(WebDriver driver){
        webDriver = driver;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(linkText = "My Wishlist" )
    WebElement myWishlist;

    @FindBy(linkText = "My Account")
    WebElement myAccount;

    @FindBy(linkText = "Checkout")
    WebElement checkout;

    @FindBy(xpath = "//div[@class='navbar navbar-default']/a[@class='noo-search']")
    WebElement search;

    @FindBy(xpath = "//input[@type='search']")
    WebElement txtsearch;


    public  void searchProduct(String product){
        WebDriverWait wait = new WebDriverWait(webDriver,5);
        wait.until(ExpectedConditions.elementToBeClickable(search));
        search.click();
        txtsearch.sendKeys(product);
        txtsearch.sendKeys(Keys.ENTER);

    }

    public void pageStatus() {
        String getActual = webDriver.getCurrentUrl();
        new WebDriverWait(webDriver, 6).until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));

    }







}
