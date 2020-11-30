package Pages;
import Utils.ConfigReader;
import base.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
public class ThreeSixtyFivePage {
    private static By threeSixtyFive=By.className("365 Portal");
    private static WebDriver driver=driver ();
    private static By threeSixtyFivePortal=By.cssSelector("#menu-item-103 > a > span");


    public static WebDriver driver(){
        WebDriver driver= Driver.getDriver ();
        driver.manage ().window ().maximize ();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver;
    }

    public static void visitHomePage (){
        driver.get (ConfigReader.getProperty ("url"));

        driver.findElement (threeSixtyFive).click ();
    }

    public static void clickThreeSixtyFivePortal (){
        driver.findElement (threeSixtyFivePortal).click ();
    }
}
