$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/Feature/MultipleTestdata.feature");
formatter.feature({
  "name": "Multiple Test Data",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login to Ing application",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Launch the Browser",
  "keyword": "Given "
});
formatter.step({
  "name": "Enter the \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "Validate login page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "admin",
        "test123"
      ]
    },
    {
      "cells": [
        "bharath",
        "test13654"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login to Ing application",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Launch the Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.MultipleTestData.launch_the_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the admin and test123",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Validate login page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.MultipleTestData.validate_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Login to Ing application",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Launch the Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.MultipleTestData.launch_the_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the bharath and test13654",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Validate login page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.MultipleTestData.validate_login_page()"
});
formatter.result({
  "status": "skipped"
});
});