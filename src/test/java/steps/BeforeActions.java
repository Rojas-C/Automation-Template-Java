package steps;

import cucumber.api.java.Before;
import utils.SeleniumDriver;

public class BeforeActions {

    /**
     * Here begins the execution after set report
     */
    @Before
    public static void setUp() {
        //Logging some information
        SeleniumDriver.log.info("############################### Launching Scenario execution ###############################");
        SeleniumDriver.log.info("Hook Before");
        //Starting the drivers configuration
        SeleniumDriver.initConfiguration();

    }
}
