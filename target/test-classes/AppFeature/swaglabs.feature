
Feature: Swag labs

  
  Scenario: login into swag labs
    Given i have to login on swag labs
    Then Enter the username and password 
    And click on the login button
    And login successfully
    
  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
