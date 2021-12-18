$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/addCustomer.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#"
    }
  ],
  "line": 2,
  "name": "Techfios bank and cash New Account Functionality",
  "description": "",
  "id": "techfios-bank-and-cash-new-account-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "User should be able to login with valid credentials",
  "description": "and open a new account",
  "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@ScenarioA"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user is on the techfios login page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User enters the username as \"\u003cusername\u003e\" and password as \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User clicks on login",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User should land on Dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User clicks on bank and Cash",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User clicks on new Account",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User fills up the information by entering \"\u003caccountTitle\u003e\" and \"\u003cdescription\u003e\" and \"\u003cinitialBalance\u003e\" and \"\u003caccountNumber\u003e\" and \"\u003ccontactPerson\u003e\" \"\u003cphone\u003e\" and \"\u003cinternetBankingURL\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User will click on the submit button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User should be able to validate account created successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "accountTitle",
        "description",
        "initialBalance",
        "accountNumber",
        "contactPerson",
        "Phone",
        "accountTitle",
        "internetBankingURL"
      ],
      "line": 17,
      "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials;;1"
    },
    {
      "cells": [
        "demo@techfios.com",
        "abc123",
        "JADDDY",
        "NewAccont",
        "20.00",
        "1092344",
        "PohK",
        "2637373732",
        "Currenty",
        "https://www.google.com/"
      ],
      "line": 18,
      "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2724089400,
  "status": "passed"
});
formatter.before({
  "duration": 1811070500,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "User should be able to login with valid credentials",
  "description": "and open a new account",
  "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@ScenarioA"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user is on the techfios login page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User enters the username as \"demo@techfios.com\" and password as \"abc123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User clicks on login",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User should land on Dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User clicks on bank and Cash",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User clicks on new Account",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User fills up the information by entering \"JADDDY\" and \"NewAccont\" and \"20.00\" and \"1092344\" and \"PohK\" \"\u003cphone\u003e\" and \"https://www.google.com/\"",
  "matchedColumns": [
    2,
    3,
    4,
    5,
    6,
    9
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User will click on the submit button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User should be able to validate account created successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "addcustomerDefination.user_is_on_the_techfios_login_page()"
});
formatter.result({
  "duration": 1355903600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 29
    },
    {
      "val": "abc123",
      "offset": 65
    }
  ],
  "location": "addcustomerDefination.user_enters_the_username_as_and_password_as(String,String)"
});
formatter.result({
  "duration": 2231009300,
  "status": "passed"
});
formatter.match({
  "location": "addcustomerDefination.user_clicks_on_login()"
});
formatter.result({
  "duration": 3618580000,
  "status": "passed"
});
formatter.match({
  "location": "addcustomerDefination.user_should_land_on_Dashboard_page()"
});
formatter.result({
  "duration": 2011980800,
  "status": "passed"
});
formatter.match({
  "location": "addcustomerDefination.user_clicks_on_bank_and_Cash()"
});
formatter.result({
  "duration": 2080831200,
  "status": "passed"
});
formatter.match({
  "location": "addcustomerDefination.user_clicks_on_new_Account()"
});
formatter.result({
  "duration": 2822106700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "JADDDY",
      "offset": 43
    },
    {
      "val": "NewAccont",
      "offset": 56
    },
    {
      "val": "20.00",
      "offset": 72
    },
    {
      "val": "1092344",
      "offset": 84
    },
    {
      "val": "PohK",
      "offset": 98
    },
    {
      "val": "\u003cphone\u003e",
      "offset": 105
    },
    {
      "val": "https://www.google.com/",
      "offset": 119
    }
  ],
  "location": "addcustomerDefination.user_fills_up_the_information_by_entering_and_and_and_and_and(String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 507889800,
  "status": "passed"
});
formatter.match({
  "location": "addcustomerDefination.user_will_click_on_the_submit_button()"
});
formatter.result({
  "duration": 1646844600,
  "status": "passed"
});
formatter.match({
  "location": "addcustomerDefination.user_should_be_able_to_validate_account_created_successfully()"
});
formatter.result({
  "duration": 4170872500,
  "status": "passed"
});
formatter.after({
  "duration": 722896300,
  "status": "passed"
});
});