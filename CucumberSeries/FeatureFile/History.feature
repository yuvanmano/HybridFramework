@History @Ten
Feature: Testing order history

@Smoke
Scenario: Filter month history
Given I launch the url
When I verify the month history

@Regression @Smoke @Sanity
Scenario: Filter product history
Given I launch the url
When I verify the product history