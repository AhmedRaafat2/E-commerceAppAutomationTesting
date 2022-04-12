Feature: SC8- Logged user could select different tags
  Scenario: Logged user could select awesome tag

    Given user open browser
    And user navigate to home page
    And user clicked on login link
    And user entered email for login
    And user entered password for login
    And user clicked on login button

    And user open search page
    And user choose awesome tag

    Then awesome product should appear to the user
