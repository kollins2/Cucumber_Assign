@DbFeature
Feature: login to techfios login page with data extracted from the database

@DBScenario1
Scenario: 1 User should be able to login with valid credentials 
	Given User is on the TechFios Login page 
	When  User enters "username" as from techfios database 
	When  User enters "password" as from techfios database 
	And   User clicks on signin button
	Then  User should land on dashboard page