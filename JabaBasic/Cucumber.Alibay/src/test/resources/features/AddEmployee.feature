Feature: Add new Employee

Background:
Given  user is logged with valid admin credentials
And user navigates to AddEmployeePage

@smoke # or @inProgress
Scenario: Add Employee with first and lastname
Given user logins with valid admin credentials
And user navigates to AddEmployeePage
When user enters employees "John" and "Smith" # This enhanced method 
Then "John Smith" is added successfully # This enhanced method 

Scenario: Add Emplyee without employee id
Given user logins with valid admin credentials
And user navigates to AddEmployeePage
When user enters employees first name and last name
And user deletes employee id
And user clicks save button
Then employee is added successfully

Scenario: AddEmployee and create Login Credentials
Given user logins with valid admin credentials
And user navigates to AddEmployeePage
When user enters employees first name and last name
And user clicls on create login checkbox
And user enters login credentials
And user clicks save button
Then employee is added successfully

# To perform in cucumber we use Scenario Outline with Examples
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

# Adding multiple employees using Cucumber DataTable
@inProgress
Scenario: Adding multiple employees
When user enters employee details and click on save Then employee is added

|FirstName|MiddleName|LastName|
|John|J|Doe|
|Jane|J|Smith|

@Excel
Scenario: Adding multiple employees from excel
When user enters employee data from "EmployeeLoginCredentials" excel sheet then employee is added





