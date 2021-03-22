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
Feature: login to the feature

Scenario: Login to the Application
Given Enter the value for Login Username
When Enter the value for password
Then Click on the Login button

Scenario: Search the product
Given Search a product with "Apple Pro" and "IPhone"
When Price of the laptop is 150000 and 70000
Then Display the searched product "Apple Pro" and "IPhone" with price 150000 and 70000.
