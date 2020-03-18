Feature: Login Feature
Scenario: Login to gavlop and validate the authorization
Given Hit the Auth url
When get the auth token
Then validate the token