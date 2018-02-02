Feature: Login first time
	Login first time and verify new role

@tag1
Scenario Outline: Login first time and verify role
Given open page with url is <token>
When User clicks on Create an account button
And User creates password is <password>
Then the user should see <dashboard> shows correctly
And <role> is shown <page>

Examples:
    |token																																														|password			|role						|dashboard				|page																					|
   #|http://goodjobs-dev.dynagility.us/onboarding?email=hl.02@yopmail.com&token=ZDY2cXJmMmNvMzQ%3D		|Cdbently2408!|Admin					|Welcome hoai linh|Companies																		|
   #|http://goodjobs-dev.dynagility.us/onboarding?email=hl.05@yopmail.com&token=bWtsaDUzZTVtOWk%3D		|Cdbently2408!|Partner				|Welcome hoai linh|Dashboard																		|
   #|http://goodjobs-dev.dynagility.us/onboarding?email=yenvo.03@yopmail.com&token=ODBxbmEwNTJmbjI%3D	|Cdbently2408!|Company Manager|Welcome yen			|Complete these steps to provide employee data|
    |http://goodjobs-dev.dynagility.us/onboarding?email=pinky.02@yopmail.com&token=MjUzYzBqamI3NW9s		|Cdbently2408!|Company User		|Welcome truyen		|Show Report																	|
    
  