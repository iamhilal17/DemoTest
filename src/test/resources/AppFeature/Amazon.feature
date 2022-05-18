
Feature: Amazon Search

  Scenario: Search a Product
    Given I have to search on Amazon Page
    When I search a product with name "Lenovo Ideapad 330" and price 40000
    Then product name "Lenovo Ideapad 330" should be displayed
      