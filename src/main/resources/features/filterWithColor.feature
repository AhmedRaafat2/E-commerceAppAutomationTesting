Feature: Logged user could filter with color
  #SC7- Logged user could filter with color
  Scenario: Logged user could filter with red color

    Given user open browser
    And user navigate to home page
    And user clicked on login link
    And user entered email for login
    And user entered password for login
    And user clicked on login button
    And user hover on apparel category
    And user click on shoes category
    And user change color to red

    Then shoes with red color only should appear to the user
