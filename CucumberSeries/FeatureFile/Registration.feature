@Registration @One
Feature: Resgistration page

@Smoke @Regression
Scenario: Test this page by passing valid email
Given I launch the url
When I Send the valid email id

@Sanity @Regression
Scenario: Test this page by passing invalid email
Given I launch the url
When I send the invalid email id

@Regression
Scenario: Test this page by passing Facebook registration
Given I launch the url
When I send the Facebook registration