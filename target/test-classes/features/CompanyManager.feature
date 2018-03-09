Feature: Company Manage account checks login on first time.

  Scenario: Create Admin Account successfully
    When Join Working Metrics screen via link is "http://goodjobs-dev.dynagility.us/onboarding?email=hl.tr.03@yopmail.com&token=YmFkMjc4czY2aWg%3D"
    And Click on Create an account on Working Metrics screen.
    And Create password is "12345678xx@X".
    And Authorized company, update many drop down list value.
    And Add a new User account with First Name is "first name", Last Name is "last name", email is "truyen.linh.1@yopmail.com", role is user.
    #And Next to Location screens.
    #And Next to Report screen.
    #Then The title is "Complete these steps to provide employee data" should show on on Report screens.
    
    
    