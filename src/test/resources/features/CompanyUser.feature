Feature: Company User account checks login on first time.

  Scenario: User login in first time
    When Join Working Metrics screen via link is "http://goodjobs-dev.dynagility.us/onboarding?email=truyen.linh.7@yopmail.com&token=N3BqZG9zczZjMGQ%3D"
    And Click on Create an account on Working Metrics screen.
    And Create password is "12345678xx@X".
