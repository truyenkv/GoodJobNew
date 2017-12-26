Feature: Create user
	Update my admin profile

	Scenario: Create user normally
	Given The user login site by "admin@yopmail.com" and "Voyen!1412" successfully
	When Click on Manage menu.
  And Click on Manage Administrators menu.
  And Click on Add User button.
  And Input First Name is "Truyen", Last Name is "Kieu" and Email is "truyen.kieu.02@yopmail.com".
  And Click on Save button
  Then System should navigate to "Manage System Administrators" screen.
  And "truyen.kieu.02@yopmail.com" should be shown on screen.
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
#
#	Scenario Outline: Create user
#	Given The user login site by "admin@yopmail.com" and "1" successfully
#	When User go to Manage page
#	And User open manage system administrator screen.
#	And User open Manage User Profile screen
#	And Creating new account with '<Fist Name>', '<Last Name>' and '<Email>'
  #Then System should navigate to "Manage System Administrators" screen.
#
  #Examples: User List
  #|Fist Name|Last Name|Email|
  #|Mamy			|Tom			|maxmy@yopmail.com|
  #|Cruite		|Max			|Cruite@dynagility.com|


	
	

