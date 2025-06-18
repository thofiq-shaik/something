package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import uistore.SpeakerPageLocators;
import utils.WebDriverHelper;

public class SpeakerPageActions {

    public static WebDriver driver;
    public static WebDriverHelper helper;
    
    public SpeakerPageActions(WebDriver driver){
        this.driver=driver;
        helper=new WebDriverHelper(driver);
    }

    public void btSpeakerClick(){
        helper.clickButton(SpeakerPageLocators.btSpeaker);
    }

    public void waitingImplicitly(){
        helper.waitImplicit();
    }

    public void scrollToBottom(){
        helper.moveToBottom();
    }

    public void homeAppliancesClick(){
        helper.clickButton(SpeakerPageLocators.homeAppliances);
    }


    public void verifyHomeApllianceText(){
        String expectedHat="Home Appliances";
        helper.verifyTextMethod(SpeakerPageLocators.homeApplianceText, expectedHat);
    }

    public void washingMachineClick(){
        helper.clickButton(SpeakerPageLocators.washingMachine);
    }
}
