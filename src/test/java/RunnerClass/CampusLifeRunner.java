package RunnerClass;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\FeatureFiles\\CampusLife.feature",
        glue= "StepDef"
        ,tags = "@test4"
        ,plugin = "html:target/cucumber-html-report")

public class CampusLifeRunner {
}


