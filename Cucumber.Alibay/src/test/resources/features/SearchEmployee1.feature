@searchEmployeen @sprint13
Feature: Employee Search for EmploeeSearchStep
Background:
Given  user is logged with valid admin credentials
And user navigate to employee list page

@temp
Scenario: Search employee by id
#### Given user is navigated to HRMS
When user enters valid employee id "10079"
And click on search button
Then user see employee information is displayed

@regression
Scenario: Search employee by name
When user is enters valid employee "John" and "Smith"
And click on search button
Then  user see employee information is displayed

# Given user is navigated to HRMS // --> No need use when have Background
# And user is logged with valid admin credentials
# And user is navigate to employee list page 
