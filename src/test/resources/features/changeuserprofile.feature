
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
	Scenario Outline: Update all user
	Given The user login site by "admin@yopmail.com" and "1" successfully
	When User go to Manage page
	And User open manage system administrator screen.
	Then User open <user> detail and update is <lastname>
	
	Examples: 
	|user						|lastname|
	|admin a				|tr001|
	|admin a1				|tr002|
	|admin Testing A|tr003|
	|Admin FPT_123	|tr003|

	
	

