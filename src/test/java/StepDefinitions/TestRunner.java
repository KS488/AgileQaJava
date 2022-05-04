package StepDefinitions;

import org.junit.runner.RunWith;   
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions; 


@RunWith(Cucumber.class) 
@CucumberOptions(features="src/main/resources/Features",glue={"StepDefinitions"},
monochrome = true,

plugin = { "pretty", "html:target/Htmlreport/index.html"})
///plugin = { "pretty", "json:target/reports/cucumber.json"},
//plugin = { "pretty",  "junit:target/reports/cucumber.xml"})

public class TestRunner {

}

