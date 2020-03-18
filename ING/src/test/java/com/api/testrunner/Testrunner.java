package com.api.testrunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/java/com/api/feature/GetEmployee.feature"
,glue={"com.api.stepdifination"},
plugin = {"pretty" ,"html:target/Cucumber-reprots"})
public class Testrunner {

}
