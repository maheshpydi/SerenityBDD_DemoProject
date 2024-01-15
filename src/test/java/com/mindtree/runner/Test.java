package com.mindtree.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumber.html", "json:target/cucumber.json",
		"junit:target/cucumber.xml" },

		features = { "src/test/resources/features/" }, glue = {
				"com.mindtree.stepdef" }, monochrome = true 

)
public class Test {

}
