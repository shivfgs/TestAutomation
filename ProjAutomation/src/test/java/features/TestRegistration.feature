Feature: Test User registartion process at My Store application	
	@SmokeTest
	Scenario: User Registration with valid email address
	GIVEN User Opens <browser>
	AND User starts MyStore application
	WHEN User clicks Sign in link
	AND User enters <valid-email> address
	AND User clicks on Create an account button
	AND User enters all the other required information
	AND User clicks Create an account button
	THEN User verifies that user registration is successful
	AND User verifies the FirstName and LastName at My Account page
	Examples:
	|browser|valid-email|
	|firefox|sks@sks.com|
	
	@SmokeTest
	Scenario: User Registration with valid email address
	GIVEN User Opens <browser>
	AND User starts MyStore application
	WHEN User clicks Sign in link
	AND User enters <invalid-email> address
	AND User clicks on Create an account button
	THEN User verifies the registration error message.
	Examples:
	|browser|invalid-email|
	|firefox|sks@sks.com|
