Feature: SC9- Logged user could add different products to Shopping cart

  Scenario: Logged user could add different products to Shopping cart

    Given user open browser
    And user navigate to home page
    And user clicked on login link
    And user entered email for login
    And user entered password for login
    And user clicked on login button

    And user navigate to books pages

    And user add items to whish list
    And user navigate to whish list

    Then added items should appear at whish list
