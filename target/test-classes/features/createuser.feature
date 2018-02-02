Feature: Create User Account
	#Create account

#	Scenario: Create Admin Account
#	Given The user login site by "truyen.kieu.10@yopmail.com" and "Cdbently2408^" successfully
#	When Click on Manage menu.
#	And Click on Manage Administrators menu.
  #And Click on Add User button.
  #And Input First Name is "Truyen", Last Name is "Kieu" and Email is "truyen.kieu.15@yopmail.com".
  #And Click on Save button
  #Then System should navigate to "Manage System Administrators" screen.
  #And "truyen.kieu.15@yopmail.com" should be shown on screen.
  #And "Truyen Kieu" Shows correctly be shown on screen.
  
  
  Scenario: Create Partner account
  Given The user login "http://goodjobs-dev.dynagility.us/login" by "hl.01@yopmail.com" and "Cdbently2408!" successfully
	When Click on Manage menu.
  And Click on Manage Partner menu.
  And Click on Add Partner button and create Partner is "Truyen"
  And Let create user has "Truyen", "Kieu", "kvt.hl01@yopmail.com", "Manage" successfully.
  And Let create user has "Truyen1", "Kieu1", "kvt.hl02@yopmail.com", "User" successfully.
  And Click on Save button on Manage Partner screen.
  
  
  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	

