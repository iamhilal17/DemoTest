package StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OlaSteps {
	
	@Given("User wants to select a car {string} from the app")
	public void user_wants_to_select_a_car_from_the_app(String SelectedCar) {
		System.out.println("Step 1: " + SelectedCar);
	}

	@When("User selects a car {string} and ask the driver for contact numner")
	public void user_selects_a_car_and_ask_the_driver_for_contact_numner(String Product) {
		System.out.println("Step 2: " + Product);
	}
	
	@Then("driver and passenger meets")
	public void driver_and_passenger_meets() {
		System.out.println("Step 3: ");
	}

	@Then("passenger use that {string}")
	public void passenger_use_that(String CarType) {
		System.out.println("Step 4:" + CarType);
	}
	
	@Then("passenger pays the {int} INR")
	public void passenger_pays_the_inr(Integer Price) {
		System.out.println("Step 5: " + Price);
	}
}
