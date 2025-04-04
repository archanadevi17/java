
Feature: Login Feature



  Scenario Outline: Login with valid and invalid login credentials
 Given Login page is displayed
 When User enters "<username>" and "<password>"
 Then User Session should be available

    Examples: 
      | username     | password    | message  |
      |standard_user |secret_sauce | Products |
     