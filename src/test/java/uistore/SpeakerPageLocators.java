package uistore;

import org.openqa.selenium.By;

public class SpeakerPageLocators {
    public static By btSpeaker=By.xpath("(//h6[@data-cl-text='collectionItem.item_text'])[3]");
    public static By homeAppliances=By.xpath("(//a[@href='/collections/home-appliances'])[3]");
    public static By homeApplianceText=By.xpath("(//a[text()='Home Appliances'])[2]");
    public static By washingMachine=By.xpath("//h6[contains(text(),'Washing Machine')]");
}
