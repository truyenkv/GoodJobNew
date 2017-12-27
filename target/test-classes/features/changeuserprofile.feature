Feature: Create user
	Update my admin profile

	Scenario: Create user normally
	Given The user login site by "admin@yopmail.com" and "Voyen!1412" successfully
	When Click on Manage menu.
  And Click on Manage Administrators menu.
  And Click on Add User button.
  And Input First Name is "Truyen", Last Name is "Kieu" and Email is "truyen.kieu.03@yopmail.com".
  And Click on Save button
  Then System should navigate to "Manage System Administrators" screen.
  And "truyen.kieu.03@yopmail.com" and User Name is "Truyen Kieu" should be shown on screen.

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	

