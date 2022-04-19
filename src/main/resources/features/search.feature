Feature: Logged User could search
  Background:
    Given user navigate to home page

  Scenario: SC4- Logged User could search for any product
    And user clicked on login link
    And user entered email for login
    And user entered password for login
    And user clicked on login button
    And user enter name of item to search for
    And user clicked on search button

    Then user should have products contains the searched word
