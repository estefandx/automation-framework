package cucumber.stepdefs;


import io.cucumber.java.en.Given;
import pages.Page;

import widgets.SearchResults;

public class BaseStepDefs {

	protected String productName;
	protected String category;
	protected Page currentPage;
	protected SearchResults searchResults;

	public BaseStepDefs() {
		currentPage = new Page(Hooks.driver);
	}

	@Given("^there is a product named (.*)$")
	public void setProduct(String productName) {
		this.productName = productName;
	}
}
