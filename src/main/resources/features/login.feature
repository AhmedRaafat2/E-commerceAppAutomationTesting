Feature: User could log in
  Background:
    Given user navigate to home page

  Scenario: SC2- User could log in with valid email and password
    And user clicked on login link
    And user entered email for login
    And user entered password for login
    And user clicked on login button
    Then user should have a success message for login
