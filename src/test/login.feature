Feature: feature to test login functionality
  I want to use this template to check my login functionality

  Scenario: Check Login is successfull with login credentials
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to homepage