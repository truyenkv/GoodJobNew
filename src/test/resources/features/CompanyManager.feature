Feature: Company Manage account checks login on first time.

  #Scenario: Admin authorise and add user successfully
    #When Join Working Metrics screen via link is "http://goodjobs-dev.dynagility.us/onboarding?email=truyen.linh.7@yopmail.com&token=N3BqZG9zczZjMGQ%3D"
    #And Click on Create an account on Working Metrics screen.
    #And Create password is "12345678xx@X".
    #And Authorized company, update many drop down list value.
    #And Add a new User account with First Name is "truyen", Last Name is "kieu", email is "truyen.linh.7@yopmail.com", role is user.
    #And Next to Location screens.
    #And Add another location, Address is "345 Ho Chi Minh", city is "Ho chi minh", State is "VN" and Zip is "11111"
    #And Next to Report screen.
    #Then The title is "Complete these steps to provide employee data" should show on Upload Employee Data screens.
    
    
    
    
  #Scenario: Upload file date for get report
   #Given The user login "http://goodjobs-dev.dynagility.us/login" by "bently.c2@yopmail.com" and "12345678xx@X" successfully
   #When Open the Upload Employee Data screen
   #And Click on Upload button
   #And Next to Provide employee data tab.
   #And Select the Quater and upload file "D:\UploadTemplate_Q4_2016.xlsx"
   #And Next to Provide baseline employee data tab.
   #And Upload file "D:\UploadTemplate_Q4_2013.xlsx"
   #And Next to Review employee data tab
   #And Click on Upload button
   #Then The system should be navigated to "Benefits Questionnaire" screen
   
   
   #Scenario: Upload file wrong format.
   #Given The user login "http://goodjobs-dev.dynagility.us/login" by "bently.c2@yopmail.com" and "12345678xx@X" successfully
   #When Open the Upload Employee Data screen
   #And Click on Upload button
   #And Next to Provide employee data tab.
   #And Select the Quater and upload file "D:\WrongUploadTemplate.xlsx"
   #And Next to Provide baseline employee data tab.
   #And Upload file "D:\UploadTemplate_Q4_2013.xlsx"
   #And Next to Review employee data tab
   #Then The message "There were 9 errors in the employee data files. Correct these issues and provide a new file or files as needed. See below for details"
   
   
   Scenario: Upload file base on Year - Period.
   Given The user login "http://goodjobs-dev.dynagility.us/login" by "bently.c2@yopmail.com" and "12345678xx@X" successfully
   When Open the Upload Employee Data screen
   And Upload file to year is "2016" and Period is "2nd Quarter"
   And Next to Provide employee data tab.
   And Upload file "D:\UploadTemplate_Q4_2013.xlsx"
   And Next to Review employee data tab
   And Click on Upload button
   Then The system should be navigated to "Benefits Questionnaire" screen
   
   