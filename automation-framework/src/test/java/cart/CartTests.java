package cart;

import cucumber.stepdefs.Hooks;
import org.junit.Assert;
import org.junit.Test;

import pages.CartPage;
import services.CartServices;


public class CartTests extends Hooks {

	@Test
	public void testIncreaseQuantity(){
		String productName = "Apple TV";
		CartServices.addProductToCart(productName, Hooks.driver);


	}
}
