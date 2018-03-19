Feature: Company User account checks login on first time.

  Scenario: User login in first time
    When Join Working Metrics screen via link is "http://goodjobs-dev.dynagility.us/onboarding?email=truyen.linh.3@yopmail.com&token=M2ZuNjlhbDllamlu"
    And Click on Create an account on Working Metrics screen.
    And Create password is "12345678xx@X".
