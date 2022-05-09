Feature: Test login functionality

  Scenario Outline: : Check if login is successful with valid credentials

    Given browser is open
    And user landed on login page
    When user enters valid <username> and <password>
    And user clicks on login
    Then user is navigated to the home page


    Examples:
      | username | password |
      | Marian   | 12345    |
      | Luca     | 12345    |