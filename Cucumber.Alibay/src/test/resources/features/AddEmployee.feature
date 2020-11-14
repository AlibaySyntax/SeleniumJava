#Author: syntaxteam
@sprint6 @addEmployee
Feature: Add new Employee

Background:
Given  user is logged with valid admin credentials
And user navigates to AddEmployeePage
#--------------------------------------------------
@smoke # or @inProgress
# Given user logins with valid admin credentials
# And user navigates to AddEmployeePage
# "John" and "Smith"  #This enhanced method
Scenario: Add Employee with first and lastname
When user enters employees "John" and "Smith" 
And user clicks save button  
Then "John Smith" is added successfully  
#--------------------------------------------------
@regression
# Given user logins with valid admin credentials
Scenario: Add Emplyee without employee id
When user enters employees first name and last name
And user deletes employee id
And user clicks save button
Then employee is added successfully
#--------------------------------------------------
@smoke
# Given user logins with valid admin credentials
# And user navigates to AddEmployeePage
Scenario: AddEmployee and create Login Credentials
When user enters employees first name and last name
And user clicls on create login checkbox
And user enters login credentials
And user clicks save button
Then employee is added successfully
#--------------------------------------------------
# To perform DDT in cucumber we use Scenario Outline with Examples
@regression
Scenario Outline: Adding multiple employees
When User enters employee "<FirstName>","<MiddleName>" and "<LastName>"
And user clicks save button
Then "<FirstName>","<MiddleName>" and "<LastName>" is added succefully

Examples:
|FirstName|MiddleName|LastName|
|James|J|Smith|
|Faisal|F|Sakhi|
|Sohil|S|Instructor|
|Yunus|Emre|Yakut|
#---------------------------------------------------
# Adding multiple employees using Cucumber DataTable
@inProgress
Scenario: Adding multiple employees
When user enters employee details and click on save Then employee is added

|FirstName|MiddleName|LastName|
|John|J|Doe|
|Jane|J|Smith|
#---------------------------------------------------
@Excel
Scenario: Adding multiple employees from excel
When user enters employee data from "EmployeeLoginCredentials" excel sheet then employee is added





