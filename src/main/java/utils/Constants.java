package utils;

public class Constants {

    //Configurations
    public static final String browser = "Edge";

    //Excel Files
    public static final String excelFile = "src/test/java/ExcelReader/DataFiles/testing4.xlsx";
    public static final String sheetName = "Sheet1";

    //Logs
    public static final String rollingFileAppenderPath = "src/test/resources/logs/selenium_";

    //Extent Reports
    public static final String extentReportsPath = "src/test/resources/Reports/Extent_Report_";
    public static final String extentConfigXMLFile = "src/test/resources/extent-config.xml";

    //Drivers
    //Important: keep updated these drivers
    public static final String chromeDriverPath = "src/test/resources/chromedriver";
    public static final String firefoxDriverPath = "src/test/resources/geckodriver";
    public static final String edgeDriverPath = "src/test/resources/msedgedriver";
}
