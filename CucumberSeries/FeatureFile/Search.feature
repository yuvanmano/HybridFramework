@Search @Four
Feature: Testing search funtionality

@Regression
Scenario: Test Mobile page
Given I launch the url
When I Check the Mobile count

@Regression @Sanity
Scenario: Test Shoes page
Given I launch the url
When I Check the Shoes count

@Smoke
Scenario: Test Cloths page
Given I launch the url
When I Check the Cloths count

Scenario: Test Electronics  page
Given I launch the url
When I Check the Electronics count

