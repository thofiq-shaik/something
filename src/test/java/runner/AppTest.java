package runner;

import utils.BaseUtil;
import utils.EventHandler;
import utils.ExtentReportUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.HomePageActions;
import pages.InstallationPageActions;
import pages.SpeakerPageActions;

import java.net.URL;
import java.time.Duration;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;

public class AppTest extends BaseUtil{
    // public WebDriver driver;
    public static ExtentReports report;
    public static ExtentTest test;

    @BeforeSuite
    public void generateReport(){
        // report=ExtentReportUtil.init();
    }

    @BeforeMethod
    public void setUp() throws MalformedURLException, FileNotFoundException, IOException{

        openBrowser();
           
    }

    

    @Test
    public void test1() throws MalformedURLException{
        try{
            HomePageActions hpa=new HomePageActions(driver);
            hpa.aboutUsClick();
            hpa.infoLogger();
            hpa.scrollToMission();
            hpa.waitingImplicitly();
            hpa.scrollToTop();
            hpa.waitingImplicitly();
            hpa.mediaClick();
            hpa.hoverMoveToIT();
            hpa.mouseClick();
            hpa.verifySortByText();
            hpa.DropDownSelect();
            hpa.optionSelect();
            hpa.waitingImplicitly();
            hpa.clickScreenShots();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void test2(){
        HomePageActions hpa=new HomePageActions(driver);
        hpa.scrollToBottom();
        hpa.waitingImplicitly();
        hpa.InstallationRequestClick();
        InstallationPageActions ipa=new InstallationPageActions(driver);
        ipa.switchWindow();
        ipa.verifyInstallationText();
        ipa.selectBookingBy();
        ipa.switchWindow();
        ipa.scrollToBottom();
        hpa.waitingImplicitly();
        ipa.onlineComplaintClick();
        ipa.switchWindow();
        ipa.enterPincode();
        ipa.customerStateSelect();
    }

    @Test
    public void test3(){
        HomePageActions hpa=new HomePageActions(driver);
        hpa.hoverOverSpeakers();
        hpa.soundBarClick();
        SpeakerPageActions spa=new SpeakerPageActions(driver);
        spa.waitingImplicitly();
        spa.btSpeakerClick();
        spa.scrollToBottom();
        spa.homeAppliancesClick();
        spa.verifyHomeApllianceText();
        spa.washingMachineClick();
    }


    @AfterMethod
    public void tearDown(){
        closeBrowser();
    }

    @AfterSuite
    public void flushReport(){
        report.flush();
    }

}
