package helpers;

import org.apache.log4j.*;
import utils.Constants;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LoggerHelper {

    private static PatternLayout layout = null;
    private static ConsoleAppender console = null;
    private static RollingFileAppender rolling = null;
    private static Logger rootLogger = null;
    private static Logger logger = null;
    private static final String pattern = "%d{yyyy-MM-dd HH:mm:ss} %-5p %c : %L - [%M] %m%n";
    private static boolean flag = false;

    /**
     * Logger configuration using Log4j
     */
    public static void initLogger(){

        SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yyyy");
        Date curDate = new Date();
        String strDate = sdf.format(curDate);

        layout = new PatternLayout(pattern);

        /* Console Appender */
        console = new ConsoleAppender(layout);
        console.setName("STDOUT");
        console.setTarget("System.out");
        console.setThreshold(Level.INFO);
        console.activateOptions();

        /* Rolling Logger Appender */
        try {
            rolling = new RollingFileAppender(layout, Constants.rollingFileAppenderPath +strDate+".log");
            rolling.setName("RFILE");
            rolling.setThreshold(Level.INFO);
            rolling.setMaxFileSize("25MB");
            rolling.setMaxBackupIndex(100);
            rolling.activateOptions();

        } catch (IOException e) {
            e.printStackTrace();
        }

        /* Root Logger configuration */

        rootLogger = Logger.getRootLogger();
        rootLogger.addAppender(console);
        rootLogger.addAppender(rolling);
    }

    public static Logger getLogger(Class aClass){
        if (!flag){
            initLogger();
            flag=true;
            LoggerHelper.logger = Logger.getLogger(aClass);
            return LoggerHelper.logger;
        }else{
            LoggerHelper.logger = Logger.getLogger(aClass);
            return LoggerHelper.logger;
        }
    }

}
