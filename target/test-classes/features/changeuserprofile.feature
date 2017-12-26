Feature: Create user
	Update my admin profile

<<<<<<< HEAD
	Scenario: Create user normally
	Given The user login site by "admin@yopmail.com" and "Voyen!1412" successfully
	When Click on Manage menu.
  And Click on Manage Administrators menu.
  And Click on Add User button.
  And Input First Name is "Truyen", Last Name is "Kieu" and Email is "truyen.kieu.02@yopmail.com".
  And Click on Save button
  Then System should navigate to "Manage System Administrators" screen.
  And "truyen.kieu.02@yopmail.com" should be shown on screen.
=======
	Scenario: Change User Profile
	Given The user login site by "admin.role.01@yopmail.com" and "Tru@123456" successfully
	When Click on User Profile in user's action menu
	And Choose User Profile action 
	And Update First Name is "Truyen First Name", Last Name is "Kieu Last Name" and click Save button.
	Then System should navigate to "Manage System Administrators" screen.	
>>>>>>> e14688759f789da30d4a24dfed1f9633f492ab51
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
<<<<<<< HEAD
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
#
=======
#	@update=list
>>>>>>> e14688759f789da30d4a24dfed1f9633f492ab51
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


	
	

