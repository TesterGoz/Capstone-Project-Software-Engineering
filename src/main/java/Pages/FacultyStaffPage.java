package Pages;
import Utils.ConfigReader;
import base.Base;
import base.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
public class FacultyStaffPage {
    private static String fsUrl = "http://qatest2119.na.edu/faculty-staff/";
    private static By fsLink = By.xpath("//li[@id='menu-item-896']/descendant::span");
    private static By dropdownMenu = By.cssSelector("ul.ubermenu-submenu.ubermenu-submenu-id-896.ubermenu-submenu-type-auto.ubermenu-submenu-type-mega.ubermenu-submenu-drop.ubermenu-submenu-align-full_width");

    WebDriver driver = Driver.getDriver();

    public void waitUntil(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void goHomePage(){

        driver.get(ConfigReader.getProperty("url"));

    }
    public void doesItHoverOver(){

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(fsLink)).build().perform();

    }
    public void verifyColorChange() throws InterruptedException {

        System.out.println("Color before hover: " + driver.findElement(fsLink).getCssValue("color"));
        String beforeHover = driver.findElement(fsLink).getCssValue("color");
        doesItHoverOver();
        System.out.println("Color after hover: " + driver.findElement(fsLink).getCssValue("color"));
        String afterHover = driver.findElement(fsLink).getCssValue("color");
        Assert.assertNotEquals(afterHover,beforeHover);

    }
    /*
    //public boolean verifyIfButtonIsClickable(){
        try
        {
            WebDriverWait wait = new WebDriverWait(driver, 5);
            WebElement until = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(fsLink)));
            return true;
        }
        catch (Exception e)
        {
            return false;
        }

    }
    */
    public void isDropdownMenuVisible(){
        doesItHoverOver();
        Assert.assertTrue(driver.findElement(dropdownMenu).isDisplayed());
    }

    public void clickFsLink(){
        driver.findElement(fsLink).click();
    }

    public void verifyGoRespectivePage(){
        clickFsLink();
        Assert.assertEquals(ConfigReader.getProperty("fsUrl"), driver.getCurrentUrl());
    }

}
