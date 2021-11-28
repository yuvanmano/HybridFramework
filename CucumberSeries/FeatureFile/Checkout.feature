@Checkout @Six
Feature: Testing on checkout

@Regression @Sanity
Scenario: Testing	Checkout details
Given I launch the url
When checking shipping details
And checking payment details 
Then checking number of products