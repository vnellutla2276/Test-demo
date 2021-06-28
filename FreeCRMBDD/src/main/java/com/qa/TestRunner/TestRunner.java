package com.qa.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\venkatesh.nellutla\\eclipse-workspace\\FreeCRMBDD\\src\\main\\java\\com\\qa\\features\\CapellaLogin.feature",
 glue= {"com\\qa\\StepDefinitions"},
 dryRun=true)



public class TestRunner {
	
	

}
