Feature: User Registeration Scenarios
Background:
Given User naviagate to Register Account page
@register @mandatoryfields @all @smoke @regression
Scenario: Register with mandatory fields
When User enters below details into fields
|firstname|lakshmi|
|lastname|Test|
|telephone|7878232323322|
|password|L@kshmi|

And Select Privacy policy field
And Clicks on Continue button
Then Account should get successfully created.


@register @allfields @smoke @regression
Scenario: Register with All fields
When User enters below details into fields
|firstname|lakshmi|
|lastname|Test|
|telephone|7878232323322|
|password|L@kshmi|

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
When User enters below details into fields with duplicate emailid
|firstname|lakshmi|
|lastname|Test|
|email|Sony213@gmail.com|
|telephone|7878232323322|
|password|L@kshmi|

And Select Privacy policy field
And Select Yes for newsletter
And Clicks on Continue button
Then Warinig message that display the email is already exist


