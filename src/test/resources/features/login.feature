Feature: Login to GoodJob
  Login site with many users'role

  Scenario Outline: Login and verify on home page
    Given the user is on the GoodJob login page.
    When the user input email is <email>
    And the user input password is <password>
    And the user click on Login button
    Then the user should see <welcome> shows correctly
    And <role> is shown <item>
    
   
  Examples:
  	|role				|email											|password			|welcome				|item																					|
  	|Admin 			|truyen.kieu.10@yopmail.com	|Cdbently2408^|Welcome Admin	|Companies																		|
  	|Company		|company.tr.02@yopmail.com	|Cdbently2408^|Welcome Company|Upload Employee Data|
  	|Partner		|partner.tr.01@yopmail.com	|Cdbently2408^|Welcome Partner1|Dashboard																		|
  
    

  