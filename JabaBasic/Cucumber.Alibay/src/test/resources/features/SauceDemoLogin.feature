#Author: Albay Aitov raihan@raihan.com
Feature: Sauce Demo Login

Description: US-3421 The purpose of this feature file is
         to automate sauce demo app ligin feature with valid and invalid credential
Acceptance Criteria: I want to automate sauce demo login functionality 
         
Scenario: invalid login

Given user is on login page
When user enter invalid username
And user enter invalid password
And click on login button
Then user chould see the error message

Scenario: invalid login

Given user is on login page
When user enter invalid username as "admin"
And user enter invalid password as "admin123"
And click on login button
Then user should see the error message