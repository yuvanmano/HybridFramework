@Cart @Five
Feature: Testing cart page

@Smoke 
Scenario: Add Mobiles to the cart page
Given I launch the url
When Checking cart

@Sanity 
Scenario: Add Shoes to the cart page
Given I launch the url
When Checking cart

@Regression
Scenario: Add Cloths to the cart page
Given I launch the url
When Checking cart

Scenario: Add Electronics to the cart page
Given I launch the url
When Checking cart