Feature: Login Application feature

#Scenario: Login Application scenario
#
#    Given User is on Application Home Page
#    When Title of the Home page is FREE CRM
#    Then user enters username and password
#    And user clicks on Login button
#    When User naviagte to user Profile page

   
Scenario Outline: Verify Duplicate Registration
     
     Given User is on App Home Page
     Then user clicks on sign up button
     Then user fills the "<UserName>" details in the form
     And user clicks on Submit button
     Then display already registered message
     
     Examples: 
     |UserName|
     |srivallikodavati@gmail.com|
     |srivallikodavati@gmail.com|
     
     

     




