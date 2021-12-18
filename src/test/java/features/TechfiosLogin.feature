@LoginFeature @Regression
Feature: TechFios login functionality validation 

@scenario1 @smoke
Scenario: 1 User should be able to login with valid credentials 
	Given User is on the TechFios Login page  
	When  User enters username as "demo@techfios.com" 
	When  User enters password as "abc123" 
	And   User clicks on signin button
	Then  User should land on dashboard page
@scenario2
Scenario: 2 User should not be able to login with valid password
	Given User is on the TechFios Login page  
	When  User enters username as "demo@techfios.com" 
	When  User enters password as "abc124" 
	And   User clicks on signin button
	Then  User should land on dashboard page
	
@scenario3 @smoke
	Scenario: 3 User should not be able to login with valid username
	Given User is on the TechFios Login page  
	When  User enters username as "demo2@techfios.com" 
	When  User enters password as "abc123" 
	And   User clicks on signin button
	Then  User should land on dashboard page
	
	