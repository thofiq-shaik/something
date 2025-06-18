package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {
    public static String appURL;
    public static String gridURL;
    public static String browserName;
    public static Properties properties;
        public static void proertiesMade() throws FileNotFoundException,IOException{
            properties=new Properties();
            FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"/config/config.properties");
            properties.load(fis);
        appURL=properties.getProperty("appURL");
        gridURL=properties.getProperty("gridURL");
        browserName=properties.getProperty("browser");
        
    }
}
