#Author:  asel@syntaxtechs.com
Feature: Login

#@smoke
@mvn
Scenario: valid admin login
#Given user is navigated to HRMS 
#When user enter valid admin username and password
When user enter "<Username>" and "<password>"
And user click on login button
#Then admin user is successfully logged in
Then "<FirstName>" is successfully logged in

#Examples:

|Username|Password    |FirstName |
|Mahady  |Mahady123!! |John      |
|add77   |Syntax123!  |Abdullah  |

@smoke
Scenario: valid ess login
#Given user is navigated to HRMS
When user enter valid "<Username>" and "<Password>"
And user click on login button
Then "<Username>" is successfully logged in

@reporting
Scenario Outline: Error message validation while invalid login
#Given user is navigated to HRMS
When User enter "<username>" and "<password>"
And user click on login button
Then User see "<ErrorMessage>"

Examples:

|Username|password  |ErrorMessage            |
|Admin   |Admin123  |Invalid Credentials     |
|Hello   |Syntax123!|Invalid Credentials     |
|Admin   |          |Password cannot be empty|
|        |Syntax123!|Username cannot be empty|

