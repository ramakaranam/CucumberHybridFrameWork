Feature: Search Functionality
#The below statement demostrates the use of Background Gherkin keyword
Background:
Given  User open the application

@search @validproduct @smoke @regression
Scenario: Search for a valid product
When I enetr a valid product into search field
And I click on search button
Then Valid Product should be displayed in search result

@search @invalidproduct  @regression
Scenario: Search for non-existing product
When User enters non-existing product into search field
And user clicks on search button
Then Proper text informing the user about no product matching should be displayed

@search @noproduct  @regression
Scenario: Search without entering any product

When User dont enter any product into search field
And user clicks on search button
Then Proper text informing the user about no product matching should be displayed