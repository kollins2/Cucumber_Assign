#
Feature: Techfios bank and cash New Account Functionality 

	@ScenarioA
  Scenario Outline: User should be able to login with valid credentials 
	and open a new account 
	Given user is on the techfios login page  
	When  User enters the username as "<username>" and password as "<password>" 
	And   User clicks on login 
	Then  User should land on Dashboard page 
	And  User clicks on bank and Cash 
	And  User clicks on new Account 
	And  User fills up the information by entering "<accountTitle>" and "<description>" and "<initialBalance>" and "<accountNumber>" and "<contactPerson>" "<phone>" and "<internetBankingURL>"             
	And   User will click on the submit button 
	Then   User should be able to validate account created successfully 
	Examples:
	|username|password|accountTitle|description|initialBalance|accountNumber|contactPerson|Phone|accountTitle|internetBankingURL| 
    |demo@techfios.com|abc123|JADDDY|NewAccont|20.00|1092344|PohK|2637373732|Currenty|https://www.google.com/|  
 