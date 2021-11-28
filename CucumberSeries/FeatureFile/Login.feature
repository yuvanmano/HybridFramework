@Login @Two
Feature: Testing Login page

@Regression
Scenario: Test login by passing right credentials
Given I launch the url
When I send the right username and password
And I click the login button

@Regression
Scenario: Test login by passing wrong credentials
Given I launch the url
When I send the wrong username and password
And I click the login button	 	