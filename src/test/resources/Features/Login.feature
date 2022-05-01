@release1
Feature: Login Functionality
Background:
Given user should navigate url "http://localhost:100"


@Valid @sprint1 @regression @sanity
Scenario: Valid Login

Then login page should be appear
When user enters valid userid and valid password
And click on login button
Then user should be navigated to home page
And can see logout link appear on top right corner

@Invalid
Scenario Outline: InValid Login

Then login page should be appear
When user enters invalid userid "<userid>" and invalid password "<password>"
And click on login button
#Then user should be navigated to home page
#And can see logout link appear on top right corner
Examples:
|userid|password|
|ad123|pwd123|
|ad124|pwd124|
|ad125|pwd126|
|ad126|pwd126|

@Invalid2
Scenario: InValid2 Login

Then login page should be appear
When user enters invalid userid "<userid>" and invalid password "<password>" and click login	
|userid|password|
|ad143 |pwd123  |
|ad144 |pwd124  |
|ad145 |pwd126  |
|ad146 |pwd126  |

#Then user should be navigated to home page
#And can see logout link appear on top right corner
