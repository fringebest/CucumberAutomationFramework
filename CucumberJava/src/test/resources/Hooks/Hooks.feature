Feature: Check login functionality

  @smoke
  Scenario: Test scenario 1
    Given user is on login page
    When user enters valid username and password
    And click on login button
    Then user is navigated to the home page


  Scenario: Test scenario 2
    Given user is on login page
    When user enters valid username and password
    And click on login button
    Then user is navigated to the home page