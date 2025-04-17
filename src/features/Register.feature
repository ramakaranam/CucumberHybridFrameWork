Feature: User Registeration Scenarios
Background:
Given User naviagate to Register Account page
@register @mandatoryfields @all @smoke @regression
Scenario: Register with mandatory fields
When  User enters firstname "Test" into the FirstName field
And Enters lastname "Lakshmi" into the LastName field
And Enters email "kLakshmi@gmail.com" into the email field
And Enters telephone 1234567892 into the telephone field
And Enters password 12345 into the pasword field
And Enters password 12345 into the pasword confrim field
And Select Privacy policy field
And Clicks on Continue button
Then Account should get successfully created.


@register @allfields @smoke @regression
Scenario: Register with All fields
When  User enters firstname "Test" into the FirstName field
And Enters lastname "Lakshmi" into the LastName field
And Enters email "kLakshmi@gmail.com" into the email field
And Enters telephone 1234567892 into the telephone field
And Enters password 12345 into the pasword field
And Enters password 12345 into the pasword confrim field
And Select Privacy policy field
And Select Yes for newsletter
And Clicks on Continue button
Then Account should get successfully created.

@register @nonfields @regression
Scenario: Register without any fields
When  User dont enter details into any fields
And Clicks on Continue button
Then Warining message should be displayed for all the mandatory 

@register @existingemaildid @smoke @regression
Scenario: Register with existing email id
When  User enters firstname "Test" into the FirstName field
And Enters lastname "Lakshmi" into the LastName field
And Enters email "kLakshmi@gmail.com" into the email field
And Enters telephone 1234567892 into the telephone field
And Enters password 12345 into the pasword field
And Enters password 12345 into the pasword confrim field
And Select Privacy policy field
And Select Yes for newsletter
And Clicks on Continue button
Then Warinig message that display the email is already exist


