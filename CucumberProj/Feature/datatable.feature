Feature: datatable demo

Scenario: Successful login with valid entries

Given user is on demowebshop login page
When user signs in with email and password
|jennifer1998@gmail.com |pass123$|
Then user should view logout
