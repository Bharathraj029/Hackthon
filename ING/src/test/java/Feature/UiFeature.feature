Feature: Login to ING

@sanity
Scenario: Login to ING and fill the form details
Given Login to ing.com.au
When Enter the username and Password
|username|password|
|admin|test123|
|bhar|tes1234|
And Fill the form details 
Then validate the fields entered


