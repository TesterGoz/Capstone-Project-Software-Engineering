package RunnerClass;
import base.Driver;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\FeatureFiles\\Admissions.feature",
        glue= "StepDef"
        ,tags = "@test2"
        ,plugin = "html:target/cucumber-html-report")

public class AdmissionsRunner {
}


