package pages.shoppage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.Page;

public class ProductPage extends ShopPage {

    public ProductPage(WebDriver webDriver) {
        super(webDriver);
    }


    @FindBy(xpath = ".//div[@class='summary entry-summary']/p/span/bdi")
    WebElement price;



    public String getPrice(){

        String resulte = price.getText().substring(1);
        return  resulte;
    }
}
