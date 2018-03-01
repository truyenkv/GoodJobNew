Feature: Create User Account

  Background: 
    Given The user login "http://goodjobs-dev.dynagility.us/login" by "hl.01@yopmail.com" and "Cdbently2408!" successfully
    

  #Scenario: Create Admin Account successfully
  	#When Click on Manage menu.
    #And Click on Manage Administrators menu.
    #And Click on Add User button.
    #And Input First Name is "aaTruyen", Last Name is "Kieu" and Email is "aatruyen.kieu.15@yopmail.com"
    #And Click on Save button on Manage User Profile screen
    #Then System should navigate to "Manage System Administrators" screen.
    #And "aatruyen.kieu.15@yopmail.com" should be shown on screen.
    #And "aaTruyen Kieu" Shows correctly be shown on screen.

#	Scenario: Create Admin-Archived account
		#When Click on Manage menu.
    #And Click on Manage Administrators menu.
    #And Click on Add User button.
    #And Input First Name is "cccTruyen", Last Name is "Kieu" and Email is "aatruyen.kieu.16@yopmail.com"
    #And Click on Save button on Manage User Profile screen
    #Then Click on Enable button on Confirmation popup
    #And System should navigate to "Manage System Administrators" screen.
    #And "aatruyen.kieu.15@yopmail.com" should be shown on screen.
    #And "cccTruyen Kieu" Shows correctly be shown on screen.
    
    
    #
  #Scenario: Create Admin-Duplicate account
  	#When Click on Manage menu.
    #And Click on Manage Administrators menu.
    #And Click on Add User button.
    #And Input First Name is "cccTruyen", Last Name is "Kieu" and Email is "aatruyen.kieu.01@yopmail.com"
    #And Click on Save button on Manage User Profile screen
    #Then The "Email aatruyen.kieu.01@yopmail.com is already in use" was shown on screen.
    
    
  #Scenario: Update User Profile
#		When Click User menu
#	  And Click User profile link
#	  And Update First Name is "Truyen", Last Name is "Kieu"
#	  And Click on Save button on Manage User Profile screen
#	  Then System should navigate to "Manage System Administrators" screen.
#	  And "hl.01@yopmail.com" should be shown on screen.
#	  And "Truyen Kieu" Shows correctly be shown on screen.
	  
  Scenario: Create Company account
  	When Click on Manage menu.
    And Click on Add Company button on Manage Companies menu.
    And Input required field are Company Name: "tr.company4", Company Identifier: "11-11111111".
    And Select required drop down are Sector / Industry, Sub-sector and Percentage of temporary workers.
    And Input Street Address is "123 new orl land", City is "newyork", State is "US", Zip is "11111".
    And Click on Save button on Manage Company screen.
    And Add user with Fist Name is "company1 fName", Last Name is "company2 lName", and Email is "truyen.company1@yopmail.com"
    And Click on Save button on Manage Company screen.
    Then System should navigate to Manage Companies screen and "Manage Companies" should shown.
    And "tr.company4" Shows correctly be shown on Manage Companies screen.
    
    
  
  #Scenario: Create Partner account
    #And Click on Manage Partner menu.
    #And Click on Add Partner button and create Partner is "Truyen32"
    #And Let create user has firstName, lastName, email, role successfully.
      #| firstName | lastName | email                | role    |
      #| Truyen54  | Kieu54   | kvt.hl54@yopmail.com | User    |
      #| Truyen55  | Kieu55   | kvt.hl55@yopmail.com | Manager |
    #And Click on Save button on Manage Partner Profile screen.
