Feature: Create User Account

  Background: 
    Given The user login "http://goodjobs-dev.dynagility.us/login" by "hl.01@yopmail.com" and "Cdbently2408!" successfully
    When Click on Manage menu.

  #Scenario: Create Admin Account successfully
    #And Click on Manage Administrators menu.
    #And Click on Add User button.
    #And Input First Name is "aaTruyen", Last Name is "Kieu" and Email is "aatruyen.kieu.15@yopmail.com"
    #And Click on Save button on Manage Administrators screen
    #Then System should navigate to "Manage System Administrators" screen.
    #And "aatruyen.kieu.15@yopmail.com" should be shown on screen.
    #And "aaTruyen Kieu" Shows correctly be shown on screen.

#	Scenario: Create Admin-Archived account
    #And Click on Manage Administrators menu.
    #And Click on Add User button.
    #And Input First Name is "cccTruyen", Last Name is "Kieu" and Email is "aatruyen.kieu.16@yopmail.com"
    #And Click on Save button on Manage Administrators screen
    #Then Click on Enable button on Confirmation popup
    #And System should navigate to "Manage System Administrators" screen.
    #And "aatruyen.kieu.15@yopmail.com" should be shown on screen.
    #And "cccTruyen Kieu" Shows correctly be shown on screen.
    
    
    
  Scenario: Create Admin-Duplicate account
    And Click on Manage Administrators menu.
    And Click on Add User button.
    And Input First Name is "cccTruyen", Last Name is "Kieu" and Email is "aatruyen.kieu.01@yopmail.com"
    And Click on Save button on Manage Administrators screen
    Then The "Email aatruyen.kieu.01@yopmail.com is already in use" was shown on screen.
    
    
  #Scenario: Create Partner account
    #And Click on Manage Partner menu.
    #And Click on Add Partner button and create Partner is "Truyen32"
    #And Let create user has firstName, lastName, email, role successfully.
      #| firstName | lastName | email                | role    |
      #| Truyen54  | Kieu54   | kvt.hl54@yopmail.com | User    |
      #| Truyen55  | Kieu55   | kvt.hl55@yopmail.com | Manager |
    #And Click on Save button on Manage Partner Profile screen.
