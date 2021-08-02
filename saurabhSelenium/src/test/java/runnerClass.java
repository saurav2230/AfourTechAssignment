//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/featureFiles", glue = "stepDefinitions", tags = "@test")
public class runnerClass {

}