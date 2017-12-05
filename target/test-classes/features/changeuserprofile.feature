Feature: Change User Profile
	I want to use this template for my feature file

#	@update=single
#	Scenario: Change Last Name
#	Given The user login site by "admin@yopmail.com" and "1" successfully
#	When User show Company menu
#	And Open User Profile
#	And Update First Name is "Admin Role" and click Save button.
#	Then System should navigate to "Manage System Administrators" screen.
	
	
#	@update=list
	Scenario Outline: Create user
	Given The user login site by "admin@yopmail.com" and "1" successfully
	When User go to Manage page
	And User open manage system administrator screen.
	And User open Manage User Profile screen
	And Creating new account with '<Fist Name>', '<Last Name>' and '<Email>'


  Examples: User List
  |Fist Name|Last Name|Email|
  |David		|Joiny		|david@yopmail.com|
  |Sam			|Frand		|sam@dynagility.com|




	
	

