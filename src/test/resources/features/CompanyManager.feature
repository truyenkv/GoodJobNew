Feature: Company Manage account checks login on first time.

  Scenario: Admin authorise and add user successfully
    When Join Working Metrics screen via link is "http://goodjobs-dev.dynagility.us/onboarding?email=hl.tr.23@yopmail.com&token=NWRsb3RkMnJiZGo%3D"
    And Click on Create an account on Working Metrics screen.
    And Create password is "12345678xx@X".
    And Authorized company, update many drop down list value.
    And Add a new User account with First Name is "truyen", Last Name is "kieu", email is "truyen.linh.3@yopmail.com", role is user.
    And Next to Location screens.
    And Next to Report screen.
    Then The title is "Complete these steps to provide employee data" should show on Upload Employee Data screens.
