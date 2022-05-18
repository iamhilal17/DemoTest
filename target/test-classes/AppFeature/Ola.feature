Feature: ola Booking


Background:
	Then driver and passenger meets
	Then passenger pays the 6500 INR
	
Scenario: Book a car
Given User wants to select a car "verna" from the app
When User selects a car "verna" and ask the driver for contact numner
And passenger use that "verna"



Scenario: Buying Product
Given User wants to select a car "Thar" from the app
When User selects a car "Thar" and ask the driver for contact numner
And passenger use that "Thar"



Scenario: Buying Product
Given User wants to select a car "volvo" from the app
When User selects a car "volvo" and ask the driver for contact numner
And passenger use that "volvo"
