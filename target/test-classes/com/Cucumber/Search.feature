#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Title of your feature
 

  @tag1
  Scenario: Title of your scenario
    Given I want to write a step with precondition
    
  @tag2
  Scenario: Title of your second scenario
    Given I want to write a step with newcondition
    
  @tag3
  Scenario: Title of your third scenario
    Given I want to write a step with previouscondition
    

 
