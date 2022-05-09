package StepDefinition;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/BackgroundDemo.feature",
        glue = {"StepsForBackground"},
        monochrome = true,
        plugin = {"pretty", "json:target/JSONReports/report.json",
                "html:target/HtmlReports"}

)
public class TestRunnerForBackground {

}
