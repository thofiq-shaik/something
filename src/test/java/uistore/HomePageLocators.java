package uistore;

import org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner.stdDSA;
import org.openqa.selenium.By;

public class HomePageLocators {
    public static By aboutUs=By.xpath("//span[text()='About Us']");
    public static By ourMission=By.xpath("//h2[text()='Our Mission']");
    public static By iT=By.xpath("(//span[text()='IT Accessories'])[1]");
    public static By mouse=By.xpath("(//a[@href='/collections/mouse'])[1]");
    public static By sort=By.cssSelector("select[id='SortByClone']");
    public static By sortByText=By.xpath("//label[contains(text(),'Sort:')]");
    public static By option=By.xpath("//span[@data-value='price-descending']");
    public static By media=By.xpath("//span[text()='Media']");
    public static By installationRequest=By.xpath("//a[text()='Installation Request']");
    public static By speakers=By.xpath("//span[text()='Speakers']");
    public static By soundBar=By.xpath("//a[@href='/collections/sound-bar']");


}
