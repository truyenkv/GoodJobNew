Feature: Create User Account
	Create account

	Scenario: Create Admin uer
	Given The user login site by "truyen.kieu.10@yopmail.com" and "Cdbently2408^" successfully
	When Click on Manage menu.
  And Click on Manage Administrators menu.
  And Click on Add User button.
  And Input First Name is "Truyen", Last Name is "Kieu" and Email is "truyen.kieu.15@yopmail.com".
  And Click on Save button
  Then System should navigate to "Manage System Administrators" screen.
  And "truyen.kieu.15@yopmail.com" should be shown on screen.
  And "Truyen Kieu" Shows correctly be shown on screen.
  And Open email to confirm password.
  And Create an account
  And Update new Password is "Cdbently!"
  And Should show usermenu is "Welcome truyen"
  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	

