Feature: Verify Login
  I want to use this template for my feature file


@valid
Scenario: Successsful login with valid credentials
  Given user in on login page
  When user enters email and password and click login button
  Then user should see logout link
  
@invalid
Scenario: Unsuccesssful login with valid credentials
  Given user in on webshoplogin page
  When user types email and password and clicks login button
  Then user should get error message as Invalid Credentials
    

  