Feature: Login first time
	Login first time and verify new role

@tag1
Scenario Outline: Login first time and verify role
Given Open browser with <token>
When User clicks on Create an account button
And User creates password is <password>
Then the user should see <dashboad> shows correctly
And <role> is shown <page>

Examples:
    |token	|password	|role							|dashboard	|page	|
    |				|					|Admin  					|						|			|
    | 			|					|Partner					|						|			|
		|				|					|Company-report  	|						|			|
    | 			|					|Partner					|						|			|