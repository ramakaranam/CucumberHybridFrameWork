
@all
Feature: Login Scenarios
Background: 
Given User Navigate to the Login Page
@login @validcredentials  @smoke @regression
Scenario Outline: Login with valid credentials
When User enters valid email address <email>
And Enters valid password <password>
And Click on Login button
Then User should be able to successfully login
Examples:
|email             |password|
|Sony123@gmail.com |12345   |
|Sony@gmail.com |123456   |
|Sony123@gmail.com |123456   |
|Sony@gmail.com |123456   |

@login @invalidcredentials  @smoke @regression
Scenario: Login with Invalid credentilas
When User enters invalid email address "sony@gmail.com"
And Enters invalid password "12223223"
And Click on Login button
Then Get a proper warning message

@login @validemaildandinvalidpassword  @regression
Scenario: Login with valid username and  invalid password
When User enters valid email address "Sony123@gmail.com"
And Enters invalid password "12223223"
And Clciks on Login button
Then Get a proper warning message


@login @invalidemaildandvalidpassword  @regression
Scenario: Login with invalid username and valid password
When User enters invalid email address "sony@gmail.com"
And Enters valid password "12345"
And Clciks on Login button
Then Get a proper warning message 


@login @nocredentials  @regression
Scenario: Login without providing any credentials
When User dont enter any credentials
And Clciks on Login button
Then Get a proper warning message
