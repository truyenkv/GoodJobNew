Feature: Update User Profile
	Update current user's profile

	Scenario: Update User Profile
	Given The user login site by "truyen.kieu.10@yopmail.com" and "Cdbently2408^" successfully
	When Click User menu
  And Click User profile link
  And Update First Name is "Truyen", Last Name is "Kieu Last"
  And Click on Save button
  Then System should navigate to "Manage System Administrators" screen.
  And "truyen.kieu.10@yopmail.com" should be shown on screen.
  And "Truyen Kieu Last" Shows correctly be shown on screen.