package cucumber.stepdefs;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.shoppage.ProductPage;
import pages.shoppage.ShopPage;

import widgets.ShopResults;

public class ShopStepDefs {

     WebDriver driver;

     ShopPage shopPage = new ShopPage(Hooks.driver);
     ShopResults shopResults = new ShopResults(Hooks.driver);

     ProductPage productPage = new ProductPage(Hooks.driver);
     String producName;

     public  ShopStepDefs(){
         driver = Hooks.driver;
     }

    @Given("^there is a product with  color (.*) in the shop$")
    public void thereIsAProductWithNamedPINKDROPSHOULDEROVERSIZEDTSHIRT(String product) {
        this.producName = product;
         System.out.println("test");

    }

    @And("^I search for the product in the shop$")
    public void iSearchForTheProductInTheShop() {
        shopPage.searchProduct(this.producName);
    }

    @When("^I click in the first product in the shop$")
    public void iClickTheProductInTheShop() throws Exception {
         shopResults.listProductResult();
         shopResults.clickFirstProduct();
    }

    @Then("^I should be price to the product of (.*)$")
    public void iShouldBeTakenToTheProductPageInTheShop(String price) {
        Assert.assertEquals(price,productPage.getPrice());
    }

    @Given("there is a product {string} in the shop")
    public void there_is_a_product_in_the_shop(String product) {
        this.producName = product;

    }

    @Then("I should see more of {int}")
    public void iShouldSeeMoreOfNumber_products(int numberProducts) {
        Assert.assertTrue("the number of product greater than: " + numberProducts + "result: " + shopResults.totalProducts(),shopResults.totalProducts() > numberProducts);
    }


}
