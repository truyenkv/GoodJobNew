Feature: Login to GoodJob
  Login site with many users'role

  Scenario Outline: Login and verify on home page
    Given open page with url is "http://goodjobs-dev.dynagility.us/login"
    When the user input email is <email>
    And the user input password is <password>
    And the user click on Login button
    Then the user should see <dashboad> shows correctly
    And <role> is shown <page>
    
   
  Examples:
  	|role				|email											|password			|dashboad				|page									|
  	|Admin 			|cd.001@yopmail.com					|11111111xx@X |Welcome Truyen	|Companies						|

    

  