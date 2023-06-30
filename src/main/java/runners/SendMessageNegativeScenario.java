package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
        features = "src/main/resources/Features/SendMessage-NegativeScenario.feature",
        glue = {"stepDefinitions.steps.java"},
//        dryRun=true,
        plugin = {"pretty", "html:target/cucumber-reports/cucumber.html"},
        monochrome = true
        )
public class SendMessageNegativeScenario {
}
