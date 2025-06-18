package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import uistore.HomePageLocators;

public class WebDriverHelper {
    public WebDriver driver;
    

    public WebDriverHelper(WebDriver driver){
        this.driver=driver;
    }

    public void clickButton(By loc){
        driver.findElement(loc).click();
    }

    public void moveToIT(By loc){
        WebElement element=driver.findElement(loc);
        Actions action=new Actions(driver);
        action.moveToElement(element).build().perform();
    }

    public void moveToTop(){
        Actions action=new Actions(driver);
        action.sendKeys(Keys.HOME).build().perform();
    }

    public void moveToBottom(){
        Actions action=new Actions(driver);
        action.sendKeys(Keys.END).build().perform();
    }

    public void verifyTextMethod(By loc,String expectedText){
        String actualText=driver.findElement(loc).getText();
        // String expectedText=verifyText;
        Assert.assertTrue(actualText.equalsIgnoreCase(expectedText));
    }

    public void selectDropDown(By loc,String text){
        clickButton(loc);
        // driver.findElement(loc).click();
        Select select=new Select(driver.findElement(loc));
        select.selectByValue(text);

    }

    public void selectDropDownByText(By loc,String text){
        clickButton(loc);
        // driver.findElement(loc).click();
        Select select=new Select(driver.findElement(loc));
        select.selectByVisibleText(text);

    }

    public void screenShots(String ssName) throws IOException{
        TakesScreenshot ts=(TakesScreenshot) driver;
        File screenShot=ts.getScreenshotAs(OutputType.FILE);
        String screenShotPath=System.getProperty("user.dir")+"/screenshots/";
        String timeStamp=new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss").format(new Date());
        String fileName=ssName+timeStamp+".png";
        File target=new File(screenShotPath+fileName);
        FileUtils.copyFile(screenShot, target);
    }

    public void waitImplicit(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    public void pageSwitch(){
        String currentPage=driver.getWindowHandle();
        Set<String> allWindowHandles=driver.getWindowHandles();
        for(String window:allWindowHandles){
            if(!window.equalsIgnoreCase(currentPage)){
                driver.switchTo().window(window);
            }
        }
    }

    public void typeInto(By loc,String text){
        driver.findElement(loc).sendKeys(text);
    }

    // public void mission(By loc){
    //     WebElement mission=driver.findElement(loc);
    //     JavascriptExecutor js=(JavascriptExecutor) driver;
    //     js.executeScript("arguments[0].scrollIntoView(true)", mission);
    // }


    // public void toClick(By loc){
    //     driver.findElement(loc).click();
    // }

    // public void scrollDown(By loc){
    //     WebElement element=driver.findElement(loc);
    //     Actions action=new Actions(driver);
    //     action.moveToElement(element).perform();
    // }
}
