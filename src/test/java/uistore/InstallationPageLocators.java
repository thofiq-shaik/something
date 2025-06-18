package uistore;

import org.openqa.selenium.By;

public class InstallationPageLocators {

    public static By installationRequest=By.xpath("//a[text()='Installation Request']");
    public static By installationText=By.xpath("//h2[text()='Installation Booking']");
    public static By selectBooking=By.xpath("//select[@name='ddlType']");
    public static By onlineComplaint=By.xpath("//a[contains(text(),'Online Complaint')]");
    public static By pinCode=By.xpath("//input[@name='txtPinCode']");
    public static By customerState=By.xpath("//select[@name='ddlState']");
}
