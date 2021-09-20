$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("backgrounddemo.feature");
formatter.feature({
  "line": 1,
  "name": "check title",
  "description": "",
  "id": "check-title",
  "keyword": "Feature"
});
formatter.background({
  "line": 4,
  "name": "driver installed",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Iam on the home page of demowebshop",
  "keyword": "Given "
});
formatter.match({
  "location": "BackgroundDemo.iam_on_the_home_page_of_demowebshop()"
});
formatter.result({
  "duration": 4815321100,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Verify title of demowebshop",
  "description": "",
  "id": "check-title;verify-title-of-demowebshop",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I should see that title contain \"shop\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "shop",
      "offset": 33
    }
  ],
  "location": "BackgroundDemo.i_should_see_that_title_contain(String)"
});
formatter.result({
  "duration": 106014200,
  "status": "passed"
});
formatter.uri("scenariooutline.feature");
formatter.feature({
  "line": 2,
  "name": "Check login with multiple data",
  "description": "",
  "id": "check-login-with-multiple-data",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Successful signin with valid data",
  "description": "",
  "id": "check-login-with-multiple-data;successful-signin-with-valid-data",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on demowebshop login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I login with \u003cemail\u003e and \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should see the logout link",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "check-login-with-multiple-data;successful-signin-with-valid-data;",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
      "line": 11,
      "id": "check-login-with-multiple-data;successful-signin-with-valid-data;;1"
    },
    {
      "cells": [
        "rekhabr1@gmail.com",
        "rekhab"
      ],
      "line": 12,
      "id": "check-login-with-multiple-data;successful-signin-with-valid-data;;2"
    },
    {
      "cells": [
        "jennifer1998@gmail.com",
        "pass123$"
      ],
      "line": 13,
      "id": "check-login-with-multiple-data;successful-signin-with-valid-data;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Successful signin with valid data",
  "description": "",
  "id": "check-login-with-multiple-data;successful-signin-with-valid-data;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on demowebshop login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I login with rekhabr1@gmail.com and rekhab",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should see the logout link",
  "keyword": "Then "
});
formatter.match({
  "location": "ScenarioOutlineDemo.i_am_on_demowebshop_login_page()"
});
formatter.result({
  "duration": 2716256600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rekhabr1@gmail.com",
      "offset": 13
    },
    {
      "val": "rekhab",
      "offset": 36
    }
  ],
  "location": "ScenarioOutlineDemo.i_login_with_email_and_password(String,String)"
});
formatter.result({
  "duration": 2386079900,
  "status": "passed"
});
formatter.match({
  "location": "ScenarioOutlineDemo.i_should_see_the_logout_link()"
});
formatter.result({
  "duration": 820526900,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Successful signin with valid data",
  "description": "",
  "id": "check-login-with-multiple-data;successful-signin-with-valid-data;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on demowebshop login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I login with jennifer1998@gmail.com and pass123$",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should see the logout link",
  "keyword": "Then "
});
formatter.match({
  "location": "ScenarioOutlineDemo.i_am_on_demowebshop_login_page()"
});
formatter.result({
  "duration": 2605240500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jennifer1998@gmail.com",
      "offset": 13
    },
    {
      "val": "pass123$",
      "offset": 40
    }
  ],
  "location": "ScenarioOutlineDemo.i_login_with_email_and_password(String,String)"
});
formatter.result({
  "duration": 2477441100,
  "status": "passed"
});
formatter.match({
  "location": "ScenarioOutlineDemo.i_should_see_the_logout_link()"
});
formatter.result({
  "duration": 827213800,
  "status": "passed"
});
});