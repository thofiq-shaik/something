package utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;

public class BaseUtil{

    public static WebDriver driver;
    
        public static void openBrowser() throws MalformedURLException,FileNotFoundException,IOException{
            ChromeOptions opt=new ChromeOptions();
            opt.addArguments("--disable-notifications");
            DesiredCapabilities dc=new DesiredCapabilities();
            PropertiesUtil.proertiesMade();
            dc.setBrowserName(PropertiesUtil.browserName);
             driver=new RemoteWebDriver(new URL(PropertiesUtil.gridURL),dc);
             driver.manage().window().maximize();
         driver.get(PropertiesUtil.appURL);
         
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            // driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));

            WebDriverListener listener=new EventHandler();
            driver=new EventFiringDecorator<>(listener).decorate(driver);
    }

    public static void closeBrowser(){
        if(driver!=null){
            driver.quit();
        }
    }
}
