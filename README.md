# StudyCase
* POM project with some basic test cases about https://www.saucedemo.com/
* This project uses Maven dependencies
* Based on Selenium and cucumber framework.
* Logging with Log4j, included.
* Handle of Excel files in scenario outline, included.
* ExtentReports V.2 with screenshots included.

## Setup Instructions 🔧
1. This project has included three drivers, make sure your current browser version match with your browser’s version as follows: 
* chromedriver for Chrome Version 83.0.4103.61, 
* geckodriver for Firefox version 68.0.2 and 
* msedgedriver for Edge Version 83.0.478.37 

When you need update the drivers when your browsers be updated, make sure to download them from:
* Chrome: https://sites.google.com/a/chromium.org/chromedriver/downloads
* Edge: https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/
* Firefox: https://github.com/mozilla/geckodriver/releases

The /test/java/resources folder that works fine with MacOS. 

2. When the project is opened, go to the pom.xml file and Import the changes.

3. Make sure the target bytecode version be 10. To know that, in Intellij, go to Intellij IDEA menu > Preferences >Build, Execution, Deployment >Compiler > Java Compiler > and choose the Target byte code version.

## Running tests.🚀
Two ways:
1. Go to test/java/runners/ choose the set of tests that you want and execute it.
2. Go to test/resources/runner/ choose the set of tests that you want and execute it.

To edit paths and choose browser where the test is going to be run:
Go to src/main/java/utils/Constants.java 
And edit it.

## Logs  📋
To see logs go to src/test/resources/logs and open directly in documents folder, for any reason Intellij do not open .log files
