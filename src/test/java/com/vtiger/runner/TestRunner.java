package com.vtiger.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Features/",
		glue = {"com.vtiger.stepdefinations"},
		plugin = { "pretty","html:target/cucumber-reports.html"},
		tags = "@Invalid2",
//		dryRun = true,
		monochrome = true
		)
public class TestRunner {

}
