$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/java/com/api/feature/GetEmployee.feature");
formatter.feature({
  "name": "Get emplotee details",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate the response code for get operation",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "set the base url",
  "keyword": "Given "
});
formatter.match({
  "location": "com.api.stepdifination.GetEmployeeResponse.set_the_base_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "hit the url",
  "keyword": "When "
});
formatter.match({
  "location": "com.api.stepdifination.GetEmployeeResponse.hit_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate the response code",
  "keyword": "Then "
});
formatter.match({
  "location": "com.api.stepdifination.GetEmployeeResponse.validate_the_response_code()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected:\u003c200\u003e but was:\u003c20\u003e\r\n\tat org.junit.Assert.fail(Assert.java:89)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:835)\r\n\tat org.junit.Assert.assertEquals(Assert.java:647)\r\n\tat org.junit.Assert.assertEquals(Assert.java:633)\r\n\tat com.api.pages.GetOperationEmployeeStatusCodeValidate.validateResponseStatus(GetOperationEmployeeStatusCodeValidate.java:36)\r\n\tat com.api.stepdifination.GetEmployeeResponse.validate_the_response_code(GetEmployeeResponse.java:28)\r\n\tat ✽.validate the response code(file:///C:/Users/bharathraj_s/Desktop/ING/Workspace/ING/src/main/java/com/api/feature/GetEmployee.feature:5)\r\n",
  "status": "failed"
});
});