$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/com/simplegooglearning/simplelearning.feature");
formatter.feature({
  "name": "Checking the functionality of google searchbutton",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Checking the Functionality of google Search button",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User has to enter the Googel url",
  "keyword": "Given "
});
formatter.step({
  "name": "User navigates to Google homepage",
  "keyword": "When "
});
formatter.step({
  "name": "User has to enter valid input \"\u003cinput\u003e\" in search option",
  "keyword": "And "
});
formatter.step({
  "name": "User Has to Click on search button.",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "input"
      ]
    },
    {
      "cells": [
        "selenium"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Checking the Functionality of google Search button",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User has to enter the Googel url",
  "keyword": "Given "
});
formatter.match({
  "location": "com.simplegoogle.stepdefinition.StepDefinition.user_has_to_enter_the_googel_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to Google homepage",
  "keyword": "When "
});
formatter.match({
  "location": "com.simplegoogle.stepdefinition.StepDefinition.user_navigates_to_google_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to enter valid input \"selenium\" in search option",
  "keyword": "And "
});
formatter.match({
  "location": "com.simplegoogle.stepdefinition.StepDefinition.user_has_to_enter_valid_input_in_search_option(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Has to Click on search button.",
  "keyword": "Then "
});
formatter.match({
  "location": "com.simplegoogle.stepdefinition.StepDefinition.user_has_to_click_on_search_button()"
});
formatter.result({
  "status": "passed"
});
});