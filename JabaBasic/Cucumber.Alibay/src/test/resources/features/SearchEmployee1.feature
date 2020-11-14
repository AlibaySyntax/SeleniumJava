Feature: Employee Search emplemented with EmploeeSearchStep

Background:
Given  user is logged with valid admin credentials
And user navigate to employee list page

@smoke
Scenario: Search employee by id
#Given user is navigated to HRMS

When user enters valid employee id
And click on search button
Then user see employee information is displayed

@regression
Scenario: Search employee by name
#Given user is navigated to HRMS // --> No need use when have Background
#And user is logged with valid admin credentials
#And user is navigate to employee list page 

When user is enters valid employee name and last name 
And click on search button
Then  user see employee information is displayed


