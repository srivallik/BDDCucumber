$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/Features/Amazon.feature");
formatter.feature({
  "line": 1,
  "name": "Test Background Feature",
  "description": "Description: The purpose of this feature is to test the Background keyword",
  "id": "test-background-feature",
  "keyword": "Feature"
});
formatter.background({
  "line": 4,
  "name": "User is Amazon Home Page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is in Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of the Home page is Amazon",
  "keyword": "When "
});
formatter.match({
  "location": "Background_Steps.user_is_in_Home_page()"
});
formatter.result({
  "duration": 22706295400,
  "status": "passed"
});
formatter.match({
  "location": "Background_Steps.title_of_the_Home_page_is_Amazon()"
});
formatter.result({
  "duration": 52138000,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Validate Tabs in the header",
  "description": "",
  "id": "test-background-feature;validate-tabs-in-the-header",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "Click on Mobile Tab",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "mobile page opened with electronics tab",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "electronics page opened",
  "keyword": "Then "
});
formatter.match({
  "location": "Background_Steps.click_on_Mobile_Tab()"
});
formatter.result({
  "duration": 6152106700,
  "status": "passed"
});
formatter.match({
  "location": "Background_Steps.mobile_page_opened_with_electronics_tab()"
});
formatter.result({
  "duration": 1916529300,
  "status": "passed"
});
formatter.match({
  "location": "Background_Steps.electronics_page_opened()"
});
formatter.result({
  "duration": 2793606100,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "User is Amazon Home Page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is in Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of the Home page is Amazon",
  "keyword": "When "
});
formatter.match({
  "location": "Background_Steps.user_is_in_Home_page()"
});
formatter.result({
  "duration": 21761012700,
  "status": "passed"
});
formatter.match({
  "location": "Background_Steps.title_of_the_Home_page_is_Amazon()"
});
formatter.result({
  "duration": 57646700,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Validate Computer Tab in the header",
  "description": "",
  "id": "test-background-feature;validate-computer-tab-in-the-header",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "Click on Computers Tab",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "validate the header ComputersAndAccessories",
  "keyword": "When "
});
formatter.match({
  "location": "Background_Steps.click_on_Computers_Tab()"
});
formatter.result({
  "duration": 6602601400,
  "status": "passed"
});
formatter.match({
  "location": "Background_Steps.validate_the_header_ComputersAndAccessories()"
});
formatter.result({
  "duration": 537502500,
  "status": "passed"
});
});