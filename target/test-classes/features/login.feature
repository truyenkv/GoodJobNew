Feature: Login to GoodJob
  I want to login site a

  Scenario: Login by Admin account
    Given the user is on the GoodJob login page.
    When the user input email is "admin@yopmail.com"
    And the user input password is "1"
    And the user click on Login button
    Then the user should see company list title "Authorized Companies"
    
    

  