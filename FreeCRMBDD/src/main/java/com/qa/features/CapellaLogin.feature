Feature: Capella University Login Test

Scenario: Validate Login into CU Site

	Given user Launches Browser
	Then user is on Login Page
	Then user Logins in using Username and Password
	Then Validate Homepage Title
	
	