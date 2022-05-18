package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/java/AppFeature/Amazon.feature"},
		glue = {"StepDef"}
//		,plugin = {"pretty"}
		)
public class AmazonTestRunner {

}
