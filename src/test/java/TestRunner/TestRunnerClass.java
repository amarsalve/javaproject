package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"AllFeaturesFile"},
		glue= {"StepDefination"},
		dryRun= false
		)

public class TestRunnerClass {

}