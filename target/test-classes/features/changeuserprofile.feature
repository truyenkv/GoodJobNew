Feature: Create Admin user
	Create new admin user

	Scenario: Create user normally
	Given The user login site by "truyen.kieu12@yopmail.com" and "Cdbently2408^" successfully
	When Click on Manage menu.
  And Click on Manage Administrators menu.
  And Click on Add User button.
  And Input First Name is "Truyen", Last Name is "Kieu" and Email is "truyen.kieu.14@yopmail.com".
  And Click on Save button
  Then System should navigate to "Manage System Administrators" screen.
  And "truyen.kieu.14@yopmail.com" should be shown on screen.
  And "Truyen Kieu1" Shows correctly be shown on screen.

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	

