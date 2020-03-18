Feature: Multiple Test Data

Scenario Outline: Login to Ing application
Given Launch the Browser
When Enter the "<username>" and "<password>"
Then Validate login page

Examples:
|username|password|
|admin|test123|
|bharath|test13654|