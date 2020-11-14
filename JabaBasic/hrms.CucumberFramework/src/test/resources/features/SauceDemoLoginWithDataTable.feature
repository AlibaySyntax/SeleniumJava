#Author: Albay Aitov raihan@raihan.com
Feature: Sauce Demo Login


Scenario: invalid login

Given user is on login page
When user enter invalid username as below 

|username|
|admin|
|regular|

And user enter invalid password
And click on login button
Then user chould see the error message
