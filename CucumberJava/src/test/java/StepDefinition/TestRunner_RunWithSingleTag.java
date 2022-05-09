package StepDefinition;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/featuresWithTags",
        monochrome = true,
        glue = {"StepsDefinitions"},
        tags = "(@smoke and not @regression)"


)
public class TestRunner_RunWithSingleTag {
}
