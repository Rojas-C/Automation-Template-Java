package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import helpers.ReportHelper;
import org.testng.annotations.BeforeClass;

@CucumberOptions(
        plugin = {"json:target/cucumberReport/cucumber.json", "pretty", "html:target/cucumberReport/cucumber.html","com.cucumber.listener.ExtentCucumberFormatter"},
        features = "src/test/resources/FeatureFiles",
        glue = "steps",
        tags = {"@Products"}
)
/**
 * Runner to execute the test cases referenced in the tags parameter
 */
public class ProductsRunner extends AbstractTestNGCucumberTests {

    @BeforeClass
    public static void ProductsRunner(){
        //Creating report with previous information
        ReportHelper reportHelper = new ReportHelper();
        reportHelper.initReport();
    }

}
