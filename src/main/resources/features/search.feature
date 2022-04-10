Feature: Logged User could search
  Scenario: SC4- Logged User could search for any product
    Given user open browser
    And user navigate to home page
    And user clicked on login link
    And user entered email for login
    And user entered password for login
    And user clicked on login button
    And user enter name of item to search for
    And user clicked on search button

    Then user should have products contains the searched word
