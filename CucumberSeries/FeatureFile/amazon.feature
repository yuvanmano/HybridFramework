Feature: Test login functionality of Orange HRM
Scenario: Test login functionality with valid username with valid password

Given as a user we launch the particular url "https://opensource-demo.orangehrmlive.com/"
When as a user we send the username "Admin" and password "admin123"
And as a user we click the login button
Then as a user we verifies title and url of the orange HRM