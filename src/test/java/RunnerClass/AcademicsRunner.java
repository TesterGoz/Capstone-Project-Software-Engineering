package RunnerClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\FeatureFiles\\Academics.feature",
        glue= "StepDef"
        ,tags = "@test"
        ,plugin = "html:target/cucumber-html-report")

public class AcademicsRunner {
}
