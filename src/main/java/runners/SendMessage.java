package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
        features = "src/main/resources/Features/SendMessage.feature",
        glue = {"stepDefinitions.steps.java"},
//        dryRun=true,
        plugin = {"json:target/cucumber-reports/cucumber.json"}
        )
public class SendMessage {
}
