Feature: Login feature

@set1
Scenario: Verify login successful with valid login credentials
Given Login page is displayed
When enter the user name
When enter the password
When click the login button
Then product page will display
 
 @set2
Scenario: Verify login unsuccessful with invalid login credentials
Given Login page is displayed
When enter the wrong user name
When enter the password
When click the login button
Then error message will display
 
 @set3
Scenario Outline: Verify login
Given Login page is displayed
When enter username "<name>"
When enter password "<password>"
When click the login button
Then display the message "<message>"
 
Examples:
 
|name         |  password  | message|
|standard_user|secret_sauce|Products|
|standard_user|secret_sauce1|Epic sadface: Username and password do not match any user in this service|
 