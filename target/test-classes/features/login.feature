Feature: Login to GoodJob
  Login site with many users'role

  Scenario Outline: Login and verify on home page
    Given the user is in Login page
    When the user input email is <email>
    And the user input password is <password>
    And the user click on Login button
    Then the user should see <dashboad> shows correctly
    And <role> is shown <page>
    
   
  Examples:
  	|role				|email											|password			|dashboad				|page																					|
  	|Admin 			|truyen.kieu.10@yopmail.com	|Cdbently2408^|Welcome Admin	|Companies1																		|
  	|Company		|company.tr.02@yopmail.com	|Cdbently2408^|Welcome Company|Upload Employee Data													|
  	|Partner		|partner.tr.01@yopmail.com	|Cdbently2408^|Welcome Partner|Dashboard																		|
  
    

  