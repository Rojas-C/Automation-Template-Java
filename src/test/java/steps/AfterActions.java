package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import helpers.GenericHelper;
import utils.SeleniumDriver;

public class AfterActions {

    /**
     * Here, the execution is finished
     * @param scenario
     */
     @After
    public static void tearDown(Scenario scenario) {
         GenericHelper genericHelper = new GenericHelper();
        SeleniumDriver.log.info("Hook After");
        SeleniumDriver.log.info("Scenario is failed? --> "+scenario.isFailed());
        //If the scenario fails, screenshot is taken.
        if (scenario.isFailed()) {
            genericHelper.takeScreenshot(scenario);
        }
        //Browser teardown
        SeleniumDriver.tearDown();
    }
}
