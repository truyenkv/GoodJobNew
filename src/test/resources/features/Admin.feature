Feature: Create User Account

  Background: 
    Given The user login "http://goodjobs-dev.dynagility.us/login" by "cd.001@yopmail.com" and "11111111xx@X" successfully

  Scenario: Create Admin Account successfully
    When Click on Manage menu.
    And Click on Manage Administrators menu.
    And Click on Add User button.
    And Input First Name is "Tuong", Last Name is "Kieu" and Email is "bently.06@yopmail.com"
    And Click on Save button on Manage User Profile screen
    Then System should navigate to "Manage System Administrators" screen.
    And "bently.07@yopmail.com" should be shown on screen.
    And "Tuong Kieu" Shows correctly be shown on screen.

  #Scenario: Create Admin-Archived account
    #When Click on Manage menu.
    #And Click on Manage Administrators menu.
    #And Click on Add User button.
    #And Input First Name is "Truyen", Last Name is "Kieu" and Email is "cd.0023@yopmail.com"
    #And Click on Save button on Manage User Profile screen
    #Then Confirmation popup should shows "cd.0023@yopmail.com was previously used and deleted from the system. Do you want to re-enable this account?"
#
  #Scenario: Create Admin-Duplicate account
    #When Click on Manage menu.
    #And Click on Manage Administrators menu.
    #And Click on Add User button.
    #And Input First Name is "Truyen", Last Name is "Kieu" and Email is "bently.01@yopmail.com"
    #And Click on Save button on Manage User Profile screen
    #Then The "Email bently.03@yopmail.com is already in use" was shown on screen.
#
#
  #Scenario: Update User Profile
    #When Click User menu
    #And Click User profile link
    #And Update First Name is "Truyen", Last Name is "Kieu"
    #And Click on Save button on Manage User Profile screen
    #Then System should navigate to "Manage System Administrators" screen.
    #And "cd.001@yopmail.com" should be shown on screen.
    #And "Truyen Kieu" Shows correctly be shown on screen.
#
  #Scenario: Create Company account
    #When Click on Manage menu.
    #And Click on Add Company button on Manage Companies menu.
    #And Input required field are Company Name: "Bently c06", Company Identifier: "11-1111111" and select required drop down box.
    #And Input Street Address is "123 new orl land", City is "newyork", State is "US", Zip is "11111".
    #And Click on Save button on Manage Company screen.
    #And Add user with Fist Name is "user2 fName", Last Name is "user2 lName", and Email is "bently.c9@yopmail.com"
    #And Click on Save button on Manage Company screen.
    #Then System should navigate to Manage Companies screen and "Manage Companies" should shown.
    #And "Bently c07" Shows correctly be shown on Manage Companies screen.
    
    
    	
    
  #Scenario: Create Partner account
    #And Click on Manage Partner menu.
    #And Click on Add Partner button and create Partner is "Truyen32"
    #And Let create user has firstName, lastName, email, role successfully.
      #| firstName | lastName | email                | role    |
      #| Truyen54  | Kieu54   | kvt.hl54@yopmail.com | User    |
      #| Truyen55  | Kieu55   | kvt.hl55@yopmail.com | Manager |
    #And Click on Save button on Manage Partner Profile screen.
