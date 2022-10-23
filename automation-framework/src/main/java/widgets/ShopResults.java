package widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.shoppage.ShopPage;

import java.util.List;

public class ShopResults  extends ShopPage {


    public ShopResults(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//div[@class='products noo-row']//div/div[@class='noo-product-inner']")
    WebElement productsRow;


    By productName = By.xpath("//h3/a") ;

    List<WebElement> listProduct;


    public void listProductResult(){
      List<WebElement> listProduct =  productsRow.findElements(productName);
      for (WebElement product : listProduct){
          System.out.println(product.getText());
      }
    }

    public int totalProducts(){
       return   productsRow.findElements(productName).size();
    }

    public void  clickFirstProduct() throws Exception {
       listProduct =  productsRow.findElements(productName);
        if(listProduct.size() > 0){
             listProduct.get(0).click();
        }else{
            throw new Exception("elemento no encontrado");
        }
    }





}
