Feature: Change User Profile
	I want to use this template for my feature file

	Scenario: Change User Profile
	Given The user login site by "admin.role.01@yopmail.com" and "Tru@123456" successfully
	When Click on User Profile in user's action menu
	And Choose User Profile action 
	And Update First Name is "Truyen First Name", Last Name is "Kieu Last Name" and click Save button.
	Then System should navigate to "Manage System Administrators" screen.	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
#	@update=list
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


	
	

