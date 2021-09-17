
Feature: Check login with multiple data

@smoke
Scenario Outline: Successful signin with valid data
Given I am on demowebshop login page
When I login with <email> and <password>
Then I should see the logout link

Examples: 
| email                 | password |
| rekhabr1@gmail.com    | rekhab   |
| jennifer1998@gmail.com| pass123$ |
