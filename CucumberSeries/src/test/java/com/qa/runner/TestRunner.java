	package com.qa.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"./FeatureFile"},
		glue = "com.qa.steps",
		plugin = {"html:target/html_output.html", 
				"json:target/json_output.json", 
					"junit:target/junit_output.xml","pretty"},
		monochrome = true,
		dryRun = false,
		tags = "@Five and @Payment or @Checkout"
		)
	

public class TestRunner {

}
