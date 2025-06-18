package pages;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import uistore.HomePageLocators;
import uistore.InstallationPageLocators;
import utils.LoggerUtil;
import utils.WebDriverHelper;

public class InstallationPageActions {

    public static WebDriver driver;
    public static WebDriverHelper helper;
    
    public InstallationPageActions(WebDriver driver){
        this.driver=driver;
        helper=new WebDriverHelper(driver);
    }

    public void installationRequestClick(){
        helper.clickButton(InstallationPageLocators.installationRequest);
    }

    public void switchWindow(){
        helper.pageSwitch();
    }

    public void verifyInstallationText(){
        helper.verifyTextMethod(InstallationPageLocators.installationText,"Installation Booking");
    }

    public void waitingImplicitly(){
        helper.waitImplicit();
    }

    public void selectBookingBy(){
        helper.selectDropDownByText(InstallationPageLocators.selectBooking, "Customer");
    }

    public void scrollToBottom(){
        helper.moveToBottom();
    }

    public void onlineComplaintClick(){
        helper.clickButton(InstallationPageLocators.onlineComplaint);
    }

    public void enterPincode(){
        helper.typeInto(InstallationPageLocators.pinCode, String.valueOf(600001L));
    }

    public void customerStateSelect(){
        helper.selectDropDownByText(InstallationPageLocators.customerState, "Tamil Nadu");
    }
    

    
}
