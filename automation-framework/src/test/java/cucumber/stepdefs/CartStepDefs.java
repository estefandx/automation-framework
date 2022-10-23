package cucumber.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


import pages.CartPage;
import services.CartServices;


public class CartStepDefs {
	BaseStepDefs stepData;
	CartPage cartPage;

	public CartStepDefs(BaseStepDefs stepData) {
		this.stepData = stepData;
	}

	@Given("^product (.*) is in the cart$")
	public void addProductToCartViaService(String productName){
		stepData.productName = productName;
		CartServices.addProductToCart(productName, Hooks.driver);
		cartPage = stepData.currentPage.clickCart();

		Assert.assertTrue(productName + " added to cart", cartPage.isProductInCart(productName));
	}

	@When("^I update its quantity to (\\d+)$")
	public void updateQuantity(int quantity){
		cartPage = cartPage.updateQuantity(stepData.productName, quantity);
	}

	@Then("^its price should be (.*)$")
	public void verifyPrice(String price){
		Assert.assertEquals(stepData.productName + "'s price", price, cartPage.getPrice(stepData.productName));
	}

	@Then("^its total should be (.*)$")
	public void verifyTotal(String total){
		Assert.assertEquals(stepData.productName + "'s total", total, cartPage.getTotal(stepData.productName));
	}

	@Then("^the product should be in the cart$")
	public void verifyProductInCart(){
		CartPage cartPage = new CartPage(Hooks.driver);
		Assert.assertTrue(stepData.productName + " is in cart", cartPage.isProductInCart(stepData.productName));
		Assert.assertEquals("Number of items in cart", 1, cartPage.getNumberOfProducts());
	}
}
