
@all
Feature: Login Scenarios
Background: 
Given User Navigate to the Login Page
@login @validcredentials   @regression

Scenario Outline: Login with valid credentials
When User enters valid email address Sony213@gmail.com
And Enters valid password Sony@12345
And Click on Login button
Then User should be able to successfully login
Examples:
|email             |password|
|Sony213@gmail.com |Sony@12345  |
|Sony@gmail.com    |123456   |
|Sony123@gmail.com |123456   |
|Sony@gmail.com    |123456   |

@login @invalidcredentials  @smoke @regression
Scenario: Login with Invalid credentilas
When User enters invalid email address Sony2@gmail.com
And Enters invalid password 12223223
And Click on Login button
Then Get a proper warning message

@login @validemaildandinvalidpassword  @regression @dev
Scenario: Login with valid username and  invalid password
When User enters valid email address Sony213@gmail.com
And Enters invalid password 12223223
And Click on Login button
Then Get a proper warning message


@login @invalidemaildandvalidpassword  @regression
Scenario: Login with invalid username and valid password
When User enters invalid email address Sony@gmail.com
And Enters valid password Sony@12345
And Click on Login button
Then Get a proper warning message 


@login @nocredentials  @regression @wip
Scenario: Login without providing any credentials
When User dont enter any credentials
And Click on Login button
Then Get a proper warning message
