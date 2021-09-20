Feature: check title


Background: driver installed
Given Iam on the home page of demowebshop

@smoke
Scenario: Verify title of demowebshop
Then I should see that title contain "shop"

Scenario: Check the source of demowebshop
Then I should see that source contains "shop"