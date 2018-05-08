package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features",
glue="stepDefinition",
plugin={"pretty","html:reports/test-report"},
tags= {"@SmokeTest,@RegressionTest"})
public class TestRunner {

}
