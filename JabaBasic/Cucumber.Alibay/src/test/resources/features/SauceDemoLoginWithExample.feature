#Author: Albay Aitov raihan@raihan.com
Feature: Sauce Demo Login

Description: US-3421 The purpose of this feature file is
         to automate sauce demo app ligin feature with valid and invalid credential
Acceptance Criteria: I want to automate sauce demo login functionality 
         
Scenario Outline: invalid login

Given user is on login page
When user enter invalid username as "<username>"
And user enter invalid password as "<password>"
And click on login button
Then user should see the error message


Examples:

|username||password   |
|Admin   ||admin123   |
|Sarmed  ||sarmed@123 |
|Sarmed  ||sarmed@1222|
|Sarmed1 ||sarmed@133 |
|Sarmed2 ||sarmed@1444|

Scenario: invalid login

Given user is on login page
When user enter invalid usernam 
"""
Each day has a promise to brighten up the day but
first you must allow the sun to come your way
"""

And user enter invalid password as 
And click on login button
Then user should see the error message
