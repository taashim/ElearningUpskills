@Signup
Feature: Signup and Email Validation Features
This feature includes scenario that would validate the following features.
1. Signup to Elearning upskills

Background: 
Given I am able to naviagte onto the Sign up page


Scenario Outline: Signup and Email Validation Features
When I click on the Signup button
And I Enter the First Name as "<fname>" 
And I Enter the Last Name as "<lname>"
And I Enter the Email as "<email>" 
And I Enter the Username as "<username>" 
And I Enter the Password as "<password>" 
And I Enter the Confirm Password as "<cpwd>"  
And I click on the Register button
Then I should see the message as "Registration"
And I should see the mailid as "<email>"
And I should see the text as "Compose message" 
And I Enter the SendTo as "Taashi17" 
And I Enter the Subject as "Hi for Testing" 
And I Enter Message as "Hello Ms. Tanu" 
And I click on the Send Message button
#And I should see the confirmation as "The message has been sent to " 

Examples:
|fname |lname |email									 |username|password|cpwd  |
|Tanu |Malhotra |malhotratanu@gmail.com|Taashi33|123456  |123456|
