package helpers;

import com.cucumber.listener.ExtentCucumberFormatter;
import utils.Constants;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class ReportHelper {

    GenericHelper genericHelper = new GenericHelper();

    /**
     * Extent Report configuration
     */
    public void initReport(){

        //Locate in the user home directory
        System.getProperty("user.home");
        // Initiates the extent report and generates the output in the output/Run_<unique timestamp>/report.html file by default.
        String fileName = Constants.extentReportsPath + genericHelper.getUniqueTimestamp()+".html";
        File newFile = new File(fileName);
        ExtentCucumberFormatter.initiateExtentCucumberFormatter(newFile,false);
        // Loads the extent config xml to customize on the report.
        ExtentCucumberFormatter.loadConfig(new File(Constants.extentConfigXMLFile));

        // Adding system information as follows
        ExtentCucumberFormatter.addSystemInfo("Browser Name", Constants.browser);
        ExtentCucumberFormatter.addSystemInfo("Browser version", "v81.0.4044.138");
        ExtentCucumberFormatter.addSystemInfo("Selenium version", "v2.53.0");

        // Adding system information using a hash map
        Map systemInfo = new HashMap();
        systemInfo.put("Cucumber version", "v1.2.3");
        systemInfo.put("Extent Cucumber Reporter version", "v1.1.0");
        ExtentCucumberFormatter.addSystemInfo(systemInfo);

    }
}
