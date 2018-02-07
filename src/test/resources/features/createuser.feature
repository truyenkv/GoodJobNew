Feature: Create User Account

  Background: 
    Given The user login "http://goodjobs-dev.dynagility.us/login" by "hl.01@yopmail.com" and "Cdbently2408!" successfully
    When Click on Manage menu.

  Scenario: Create Admin Account
    And Click on Manage Administrators menu.
    And Click on Add User button.
    And Input First Name is "Truyen", Last Name is "Kieu" and Email is "truyen.kieu.001@yopmail.com".
    And Click on Save button on Manage Administrators screen
    Then System should navigate to "Manage System Administrators" screen.
    And "truyen.kieu.001@yopmail.com" should be shown on screen.
    And "Truyen Kieu" Shows correctly be shown on screen.

  Scenario: Create Partner account
    And Click on Manage Partner menu.
    And Click on Add Partner button and create Partner is "Truyen30"
    And Let create user has firstName, lastName, email, role successfully.
      | firstName | lastName | email                | role |
      | Truyen50  | Kieu50   | kvt.hl50@yopmail.com | User |
      | Truyen51  | Kieu51   | kvt.hl51@yopmail.com | User |
    And Click on Save button on Manage Partner Profile screen.
