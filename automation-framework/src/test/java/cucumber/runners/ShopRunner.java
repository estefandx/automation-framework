package cucumber.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        publish = true,
        plugin = {"pretty"},
        glue = {"cucumber.stepdefs"},
        features = {"src/test/java/cucumber/features/Shop.feature"})

public class ShopRunner {


}
