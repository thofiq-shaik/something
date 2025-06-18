package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import uistore.HomePageLocators;
import utils.LoggerUtil;
import utils.WebDriverHelper;

public class HomePageActions{
    public static WebDriver driver;
    public static WebDriverHelper helper;
    
    public HomePageActions(WebDriver driver){
        this.driver=driver;
        helper=new WebDriverHelper(driver);
    }

    public void aboutUsClick(){
        helper.clickButton(HomePageLocators.aboutUs);
    }

    public void InstallationRequestClick(){
        helper.clickButton(HomePageLocators.installationRequest);
    }

    public void clickScreenShots()throws IOException{
        helper.screenShots("screenshot");
    }

    public void scrollToMission(){
        helper.moveToIT(HomePageLocators.ourMission);
    }

    public void scrollToTop(){
        helper.moveToTop();
    }

    public void scrollToBottom(){
        helper.moveToBottom();
    }

    public void mediaClick(){
        helper.clickButton(HomePageLocators.media);
    }

    public void hoverMoveToIT(){
        helper.moveToIT(HomePageLocators.iT);
    }

    public void mouseClick(){
        helper.clickButton(HomePageLocators.mouse);
    }    

    public void verifySortByText(){
        helper.verifyTextMethod(HomePageLocators.sortByText,"Sort:");
    }

    public void DropDownSelect(){
        helper.selectDropDown(HomePageLocators.sort,"price-descending");
    }

    public void optionSelect(){
        helper.clickButton(HomePageLocators.option);
    }

    public void waitingImplicitly(){
        helper.waitImplicit();
    }

    public void infoLogger(){
        LoggerUtil.info("about us clicked");
    }

    public void tabSwitch(){
        helper.pageSwitch();
    }

    public void hoverOverSpeakers(){
        helper.moveToIT(HomePageLocators.speakers);
    }

    public void soundBarClick(){
        helper.clickButton(HomePageLocators.soundBar);
    }



    // public void homePage(){
    //     helper.toClick(HomePageLocators.aboutUs);
    //     helper.scrollDown(HomePageLocators.ourMileStone);
    //     helper.toClick(HomePageLocators.ourMileStone);
    // }


    

    
}
