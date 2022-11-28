package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        features = "E://Selenium/Features/testAutomationFeature.feature",
        glue = "stepDefinition",
        dryRun = false,
        monochrome = true,
        stepNotifications = true,
        plugin = {"pretty","html:test-output"},
        tags= "@sanity"

)
public class testRunner {

}
