Feature: User could log in
  Scenario: SC2- User could log in with valid email and password
    Given user open browser
    And user navigate to home page
    And user clicked on login link
    And user clicked on forgot password
    And user entered email for reset password
    And user clicked on recover button
    Then user should have a success message for recover
