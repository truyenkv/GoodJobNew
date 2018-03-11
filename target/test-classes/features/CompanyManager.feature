Feature: Company Manage account checks login on first time.

  Scenario: Authorise and add user successfully
    When Join Working Metrics screen via link is "http://goodjobs-dev.dynagility.us/onboarding?email=hl.tr.22@yopmail.com&token=YjhnZmthMzA5bmw%3D"
    And Click on Create an account on Working Metrics screen.
    And Create password is "12345678xx@X".
    And Authorized company, update many drop down list value.
    And Add a new User account with First Name is "truyen", Last Name is "kieu", email is "truyen.linh.2@yopmail.com", role is user.
    And Next to Location screens.
    And Next to Report screen.
    Then The title is "Complete these steps to provide employee data" should show on Upload Employee Data screens.
    
    
    