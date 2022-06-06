package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import helpers.ReportHelper;
import org.testng.annotations.BeforeClass;

@CucumberOptions(
        plugin = {"json:target/cucumberReport/cucumber.json", "pretty", "html:target/cucumberReport/cucumber.html","com.cucumber.listener.ExtentCucumberFormatter"},
        features = "src/test/resources/FeatureFiles",
        glue = "steps",
        tags = {"@Login-5"}
)
/**
 * Runner to execute the test cases referenced in the tags parameter
 */
public class LoginRunner extends AbstractTestNGCucumberTests {

    @BeforeClass
    public static void LoginRunner() {
        //Creating report with previous information
        ReportHelper reportHelper = new ReportHelper();
        reportHelper.initReport();
    }
}
