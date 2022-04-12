Feature: Logged user could select different Categories
  #SC6- Logged user could select different Categories
  Scenario: Logged user could select cellPhone Category

    Given user open browser
    And user navigate to home page
    And user clicked on login link
    And user entered email for login
    And user entered password for login
    And user clicked on login button
    And user hover on electronic category
    And user click on cellPhone category

    Then cell phones should appear to the user
