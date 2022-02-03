$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/addCustomer.feature");
formatter.feature({
  "name": "Techfios bank and cash New Account Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "User should be able to login with valid credentials",
  "description": "\tand open a new account ",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ScenarioC"
    }
  ]
});
formatter.step({
  "name": "user is on the techfios login page",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters the username as \"\u003cusername\u003e\" and password as \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User clicks on login",
  "keyword": "And "
});
formatter.step({
  "name": "User should land on Dashboard page",
  "keyword": "Then "
});
formatter.step({
  "name": "User clicks on bank and Cash",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on new Account",
  "keyword": "And "
});
formatter.step({
  "name": "User fills up the information by entering \"\u003caccountTitle\u003e\" and \"\u003cdescription\u003e\" and \"\u003cinitialBalance\u003e\" and \"\u003caccountNumber\u003e\" and \"\u003ccontactPerson\u003e\" \"\u003cphone\u003e\" and \"\u003cinternetBankingURL\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User will click on the submit button",
  "keyword": "And "
});
formatter.step({
  "name": "User should be able to validate account created successfully",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
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
      ]
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
      ]
    }
  ]
});
formatter.scenario({
  "name": "User should be able to login with valid credentials",
  "description": "\tand open a new account ",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ScenarioC"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "addcustomerDefination.user_is_on_the_techfios_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the username as \"demo@techfios.com\" and password as \"abc123\"",
  "keyword": "When "
});
formatter.match({
  "location": "addcustomerDefination.user_enters_the_username_as_and_password_as(String,String)"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat steps.addcustomerDefination.user_enters_the_username_as_and_password_as(addcustomerDefination.java:37)\r\n\tat ✽.User enters the username as \"demo@techfios.com\" and password as \"abc123\"(classpath:features/addCustomer.feature:8)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User clicks on login",
  "keyword": "And "
});
formatter.match({
  "location": "addcustomerDefination.user_clicks_on_login()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should land on Dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "addcustomerDefination.user_should_land_on_Dashboard_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on bank and Cash",
  "keyword": "And "
});
formatter.match({
  "location": "addcustomerDefination.user_clicks_on_bank_and_Cash()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on new Account",
  "keyword": "And "
});
formatter.match({
  "location": "addcustomerDefination.user_clicks_on_new_Account()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User fills up the information by entering \"JADDDY\" and \"NewAccont\" and \"20.00\" and \"1092344\" and \"PohK\" \"\u003cphone\u003e\" and \"https://www.google.com/\"",
  "keyword": "And "
});
formatter.match({
  "location": "addcustomerDefination.user_fills_up_the_information_by_entering_and_and_and_and_and(String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User will click on the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "addcustomerDefination.user_will_click_on_the_submit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should be able to validate account created successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "addcustomerDefination.user_should_be_able_to_validate_account_created_successfully()"
});
formatter.result({
  "status": "skipped"
});
});