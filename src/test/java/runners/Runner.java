package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // Path to your feature files
        glue = {"stepdefinitions","hooks"}, // Path to your step definitions
        plugin = { "pretty", "html:target/cucumber-reports1" }, // Generates reports
        monochrome = true,
        dryRun = false,
        tags = "@excel"// Better console output
)
public class Runner {
}
