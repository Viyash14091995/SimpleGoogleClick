Feature: Checking the functionality of google searchbutton

Scenario Outline: Checking the Functionality of google Search button

Given User has to enter the Googel url
When User navigates to Google homepage
And  User has to enter valid input "<input>" in search option
Then User Has to Click on search button.

Examples:
         |input|
         |selenium|






