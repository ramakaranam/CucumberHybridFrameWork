Feature: Search Functionality
#The below statement demostrates the use of Background Gherkin keyword
Background:
Given  User open the application

@search @validproduct @smoke @regression
Scenario: Search for a valid product
When User enetr a valid product "HP" into search field     
And User clicks on search button
Then Valid Product should be displayed in search result

@search @invalidproduct  @regression @ignore
Scenario: Search for non-existing product
When User enters non-existing product "Honda" into search field 
And User clicks on search button
Then Proper text informing the user about no product matching should be displayed

@search @noproduct  @regression
Scenario: Search without entering any product

When User dont enter any product into search field
And User clicks on search button
Then Proper text informing the user about no product matching should be displayed