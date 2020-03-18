package TestRunner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Feature/MultipleTestdata.feature",glue={"StepDefinition"},
plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
		 "junit:target/cucumber-reports/Cucumber.xml",
		 /*"html:target/cucumber-reports","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"*/})
public class TestRunner {
	
	/*
	@AfterClass
	public static void setup()
	{
	Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
	//Reporter.setSystemInfo("Test User", System.getProperty("user.name"));
	Reporter.setSystemInfo("User Name", "Raj");
	Reporter.setSystemInfo("Application Name", "ING ");
	Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
	Reporter.setSystemInfo("Environment", "Production");
	Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
	*/}


