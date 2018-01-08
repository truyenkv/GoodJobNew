Feature: Login to GoodJob
  Login site with many users'role

  Scenario Outline: Login and verify on home page
    Given the user is on the GoodJob login page.
    When the user input email is <email>
    And the user input password is <password>
    And the user click on Login button
    Then the user should see <welcome> shows correctly
    And <item> is shown on screen
    
   
  Examples:
  	|Role				|email											|password			|welcome				|item																					|
  	|Admin 			|truyen.kieu.10@yopmail.com	|Cdbently2408^|Welcome Admin	|Companies																		|
  	|Company		|company.tr.02@yopmail.com	|Cdbently2408^|Welcome Company|Complete these steps to provide employee data|
  	|Partner		|partner.tr.01@yopmail.com	|Cdbently2408^|Welcome Partner1|Dashboard																		|
  
    

  