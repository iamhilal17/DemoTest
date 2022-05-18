package StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonSteps {

	@Given("I have to search on Amazon Page")
	public void i_have_to_search_on_amazon_page() {
		System.out.println("Step 1:Amazon pge open");
	}

	@When("I search a product with name {string} and price {int}")
	public void i_search_a_product_with_name_and_price(String productName, Integer price) {
		System.out.println("Step 2: Search a product with name " + productName + "and the price is " + price);

	}

	@Then("product name {string} should be displayed")
	public void product_name_should_be_displayed(String ProductName) {
		System.out.println("Step 3: product name displayed " + ProductName);

	}

}
