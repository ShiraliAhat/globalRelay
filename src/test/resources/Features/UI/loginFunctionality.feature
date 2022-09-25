  Feature: Login Functionality
  @smoke@regression
  Scenario: As a user I should be able to click on Login button
    Given user on globalRelay home page
    When user click on Login button
    Then user should be able to move to login page and see Login ID input box

