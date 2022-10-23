package cucumber;

import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;




@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"},
		glue = {"cucumber.stepdefs"},
		features = {"src/test/java/cucumber/features"})

public class CucumberTestOptions {


}
