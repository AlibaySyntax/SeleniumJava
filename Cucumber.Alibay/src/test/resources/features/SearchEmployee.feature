Feature: search Employee

#Author: your.email@your.domain.com
#keywords Summary:
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,WhenThen steps
#Scenario OutLine: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
# (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template


#@tag
I want to use this template for my feature file
@tag1
Scenario: Title of your scensrio
Given I want to write a step with precondition
And some other preconditon
When I complete action
And some other action
And yet another action
Then I validate the outcomes
And check more outcomes

@tag2
Scenario Outline: Title of your scenario outline
Given I want to write a step with <name>
When I checkfor the <value> in step
Then I verify the <status> in step


