Feature: Test Background Feature 
Description: The purpose of this feature is to test the Background keyword
 
Background: User is Amazon Home Page
 Given User is in Home page
 When title of the Home page is Amazon
 
 
Scenario: Validate Tabs in the header
 Given Click on Mobile Tab
 Then mobile page opened with electronics tab
 Then electronics page opened
 
 Scenario: Validate Computer Tab in the header
 Given Click on Computers Tab
 When validate the header ComputersAndAccessories
 	