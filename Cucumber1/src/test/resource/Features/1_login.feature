Feature: Login Feature
@set1
Scenario: Verify login is successfull with valid login credientials
Given login page is displayed
When user enters the valid user name
When user enters the valid password
When user clicks the login button
Then login has been done successfully


Scenario: Login with incorrect password  
  Given I open the login page  
  When I enter wrong user name
  And I enter wrong password 
  And I click the Login button  
  Then I should see an  error 



@set2
Scenario Outline:Login with valid and invalid crendentials
Given The login page is displayed
When User enters "<username>" and "<password>"
When User clicks on login button
Then The application should display the message"<message>"

Examples:

|username     |password     |message|
|standard_user|secret_sauce |Products|
|standard_user|secret_sauce1|Epic sadface:Username and password do not match any user in this service|
