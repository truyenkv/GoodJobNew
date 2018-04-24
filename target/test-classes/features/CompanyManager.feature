Feature: Company Manage account checks login on first time.

  Scenario: Admin authorise and add user successfully
    When Join Working Metrics screen via link is "http://goodjobs-dev.dynagility.us/onboarding?email=truyen.linh.7@yopmail.com&token=N3BqZG9zczZjMGQ%3D"
    And Click on Create an account on Working Metrics screen.
    And Create password is "12345678xx@X".
    And Authorized company, update many drop down list value.
    And Add a new User account with First Name is "truyen", Last Name is "kieu", email is "truyen.linh.7@yopmail.com", role is user.
    And Next to Location screens.
    And Add another location, Address is "345 Ho Chi Minh", city is "Ho chi minh", State is "VN" and Zip is "11111"
    And Next to Report screen.
    Then The title is "Complete these steps to provide employee data" should show on Upload Employee Data screens.
