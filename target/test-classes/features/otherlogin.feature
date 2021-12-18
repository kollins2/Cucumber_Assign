@otherlogin@Regression
Feature: other Techfios Login funtionality validation

@otherscenario1 
Scenario Outline: 1 user should be able to login with valid credentials 
	Given User is on the TechFios Login page  
	When  User enters username as "demo@techfios.com" 
	When  User enters password as "abc123" 
	And   User clicks on signin button
	Then  User should land on dashboard page
  
  Examples:
  |username | password |
  |demo@techfios.com | abc123 |
  |demo@techfios.com | abc124 |
  |demo2@techfios.com | abc123 |
  |demo2@techfios.com | abc124 |
  
  #@otherscenario2
#Scenario: 2 user should not be able to login with valid password
#	Given User is on the TechFios Login page  
#	When  User enters username as "demo@techfios.com" 
#	When  User enters password as "abc124" 
#	And   User clicks on signin button
#	Then  User should land on dashboard page
#	
#@otherscenario3 
#	Scenario: 3 user should not be able to login with valid username
#	Given User is on the TechFios Login page  
#	When  User enters username as "demo2@techfios.com" 
#	When  User enters password as "abc123" 
#	And   User clicks on signin button
#	Then  User should land on dashboard page
#	
#	#@otherscenario3 
#	Scenario: 3 user should not be able to login with valid username and password
#	Given User is on the TechFios Login page  
#	When  User enters username as "demo2@techfios.com" 
#	When  User enters password as "abc123" 
#	And   User clicks on signin button
#	Then  User should land on dashboard page
#	