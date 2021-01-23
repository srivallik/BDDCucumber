Feature: Facebook Login fetaure

Scenario: Login validation

Given User is on Login page
When Title of the page is Facebook
Then enter username and password
And user click on Login button
Then Home page should be displayed

