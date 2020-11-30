package Pages;
import Utils.ConfigReader;
import Utils.SeleniumUtil;
import base.Base;
import base.Driver;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
public class CampusLifePage extends Base {
    private static By campusLife=By.xpath("//*[@id='menu-item-897']/a/span[1]");
    private static By campusLifeMouseOver=By.xpath("//*[@id='menu-item-897']/a/span[1]");
    private static By admissions=By.xpath("//*[@id='menu-item-107']/a/span[1]");
    private static By academic=By.xpath("//*[@id='menu-item-645']/a/span[1]");
    private static By facultyStaff=By.xpath("//*[@id='menu-item-896']/a");
    private static By students=By.xpath("//*[@id='menu-item-898']/a/span[1]");
    private static By aboutNau=By.xpath("//*[@id='menu-item-899']/a/span[1]");
    private static By studentOrganizations=By.xpath(" //*[@id='sidebar']/ul/li[9]/a");
    private static By calendarOfEvents=By.xpath("//*[@id='sidebar']/ul/li[8]/a");
    private static By CampusLifeDropdown=By.xpath("//*[@id='menu-item-5753']/a");
    private static By nauAthletics=By.xpath("//*[@id='menu-item-5756']/a/span");
    private static By healthServices=By.xpath("//*[@id='sidebar']/ul/li[10]/a");
    private static By diningAtNau=By.xpath("//*[@id='sidebar']/ul/li[7]/a");
    private static By requestInfo=By.xpath("//*[@id='menu-item-57']/a/span");
    private static By urlCampusLifePage=By.xpath("//*[@id='menu-item-897']/a/span[1]");
    private static By housing=By.xpath("//*[@id='sidebar']/ul/li[2]/a");
    private static By servReqv=By.xpath("//*[@id='sidebar']/ul/li[3]/a");
    private static By campusSecurity=By.xpath("//*[@id='sidebar']/ul/li[4]/a");
    private static By emergencyGuide=By.xpath("//*[@id='sidebar']/ul/li[5]/a");
    private static By parkingTransportation=By.xpath("//*[@id='sidebar']/ul/li[6]/a");
    private static By studentServices=By.xpath("//*[@id='sidebar']/ul/li[11]/a");
    private static String requestInfoPageUrl= "https://www.na.edu/request-information/";
    private static String studentOrganizationsUrl="https://www.na.edu/campus-life/student-organizations/";
    private static String urlLibrary="urlLibrary=https://www.na.edu/?s=library/";
    private static String timeStamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());

    WebElement CampusLifePath = seleniumUtil.findElement(CampusLifeDropdown);
    private static WebDriver driver=driver ();
    public static WebDriver driver() {
        WebDriver driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
    public static void goToPage() {
        driver.get (ConfigReader.getProperty ("url"));
    }
    public static void colorChangeVerified() throws InterruptedException {

        System.out.println("Color before hover: " + driver.findElement(urlCampusLifePage).getCssValue("color"));
        String beforeHover = driver.findElement(urlCampusLifePage).getCssValue("color");
        itHoversOver();
        System.out.println("Color after hover: " + driver.findElement(urlCampusLifePage).getCssValue("color"));
        String afterHover = driver.findElement(urlCampusLifePage).getCssValue("color");
        Assert.assertNotEquals(afterHover,beforeHover);
    }
    public static void itHoversOver(){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(urlCampusLifePage)).build().perform();
    }
    public static void hoversOverHousing(){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(housing)).build().perform();
    }
    public static void hoversOverServReqv(){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(servReqv)).build().perform();
    }
    public static void hoversOverCampusSecurity(){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(campusSecurity)).build().perform();
    }
    public static void hoversOverEmergencyGuide(){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(emergencyGuide)).build().perform();
    }
    public static void hoversOverParkingTransportation(){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(parkingTransportation)).build().perform();
    }
    public static void hoversOverCalendarOfEvents(){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(calendarOfEvents)).build().perform();
    }
    public static void hoversOverStudentOrganizations(){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(studentOrganizations)).build().perform();
    }
    public static void hoversOverDiningAtNau(){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(diningAtNau)).build().perform();
    }
    public static void hoversOverHealthServices(){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(healthServices)).build().perform();
    }
    public static void hoversOverStudentServices(){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(studentServices)).build().perform();
    }
    public static boolean buttonIsClickable(){
        try
        {
            WebDriverWait wait = new WebDriverWait(driver, 5);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(urlCampusLifePage)));
            return true;
        }
        catch (Exception e)
        {
            return false;
        }

    }
    public static void StudentOrganizationsPageIsDisplayed (){
        WebDriverWait wait=new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(By.id(studentOrganizationsUrl)));
        clickOnStudentOrganizations();
        Assert.assertTrue (driver ().getCurrentUrl ().equalsIgnoreCase (studentOrganizationsUrl));
    }
    public static void mouseOverCampusLife ()  {
        SeleniumUtil.getActions().moveToElement(driver().findElement(campusLifeMouseOver)).build().perform();
    }
    public static void mouseOverAdmissions(){
        SeleniumUtil.getActions().moveToElement(driver().findElement(admissions)).build().perform();
    }
    public static void mouseOverAcademics(){
        SeleniumUtil.getActions().moveToElement(driver().findElement(academic)).build().perform();
    }
    public static void mouseOverFacultyStaff(){
        SeleniumUtil.getActions().moveToElement(driver().findElement(facultyStaff)).build().perform();
    }
    public static void mouseOverStudents(){
        SeleniumUtil.getActions().moveToElement(driver().findElement(students)).build().perform();
    }
    public static void mouseOverAboutNau(){
        SeleniumUtil.getActions().moveToElement(driver().findElement(aboutNau)).build().perform();
    }
    public static void mouseOverStudentOrganizations(){
        SeleniumUtil.getActions().moveToElement(driver().findElement(studentOrganizations)).build().perform();
    }
    public static void mouseOverCalendarOfEvents(){
        SeleniumUtil.getActions().moveToElement(driver().findElement(calendarOfEvents)).build().perform();
    }
    public static void mouseOverNauAthletics(){
        SeleniumUtil.getActions().moveToElement(driver().findElement(nauAthletics)).build().perform();
    }
    private static void mouseOverHealthServices(){
        SeleniumUtil.getActions().moveToElement(driver().findElement(healthServices)).build().perform();
    }
    public static void mouseOverDiningAtNau(){
        SeleniumUtil.getActions().moveToElement(driver().findElement(diningAtNau)).build().perform();
    }
    public static void clickRequestInfo(){
        WebElement ri= By.xpath("//*[@id='menu-item-57']/a/span").findElement(driver);
        ri.click();
        driver().navigate().back();
    }
    public static void screenShot(String TestName) throws IOException {

        String fileLocation= "src\\main\\CommonFile\\CampusLifeScreenshots\\ScreenShots";
        String fileName=TestName+" "+timeStamp;
        String fileExtension=".png";

        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File(fileLocation+fileName+fileExtension));
    }
    public static void requestInfoIsDisplayed (){
        Assert.assertTrue (driver.getCurrentUrl().equalsIgnoreCase (requestInfoPageUrl));
    }
    public static void campusLife () {
        WebElement cl = driver.findElement(By.xpath("//*[@id=\"menu-item-897\"]/a/span[1]"));
        cl.click();
    }
    public static void campusLifeSub(){
        WebElement cls= By.xpath("//*[@id=\"menu-item-897\"]/a/span[1]").findElement(driver);
        cls.click();
    }
    public static void goesToRespectivePageCampusLifeSub() throws IOException, InterruptedException {
        campusLifeSub();
        Driver.getDriver().manage().window().maximize();
        Assert.assertEquals(SeleniumUtil.getUrl(), "https://www.na.edu/campus-life/");
        System.out.println("https://www.na.edu/campus-life/");
    }
    public static void goesToRespectivePageHousing() throws IOException, InterruptedException {
        clickOnHousing();
        Driver.getDriver().manage().window().maximize();
        Assert.assertEquals(SeleniumUtil.getUrl(), "https://www.na.edu/campus-life/housing/");
        System.out.println("https://www.na.edu/campus-life/housing/");
    }
    public static void clickOnHousing () {
        WebElement housing = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[2]/a"));
        housing.click();
        driver().navigate().back();
    }
    public static void clickOnCampusLife(){
        WebElement campusLife= driver.findElement(By.xpath("//*[@id='menu-item-897']/a/span[1]"));
        campusLife.click();
    }

    public static void clickOnServReqv () {
        WebElement sr = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[3]/a"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        sr.click();
        driver().navigate().back();

    }
    public static void clickOnCampusSecurity(){
        WebElement cs = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[4]/a"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        cs.click();
        driver().navigate().back();
    }
    public static void clickOnEmergencyGuide(){
        WebElement eg = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[5]/a"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        eg.click();
        driver().navigate().back();
    }
    public static void clickOnParkingTransportation(){
        WebElement pt = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[6]/a"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        pt.click();
        driver().navigate().back();
    }
    public static void clickOnCalendarOfEvents(){
        WebElement ce = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[8]/a\n"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ce.click();
        driver().navigate().back();
    }
    public static void clickOnHealthServices(){
        WebElement hs = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[10]/a"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        hs.click();
        driver().navigate().back();
    }
    public static void clickOnStudentOrganizations(){
        WebElement so = driver.findElement(By.xpath(" //*[@id='sidebar']/ul/li[9]/a"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        so.click();
        driver().navigate().back();
    }
    public static void clickOnDiningNau(){
        WebElement dn = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[7]/a"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        dn.click();
        driver().navigate().back();
    }

    public static void clickOnStudentServices(){
        WebElement ss = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[11]/a"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ss.click();
        driver().navigate().back();
    }
    public static void clickOnSearchBox(){
        WebElement sb = driver.findElement(By.xpath("//*[@id='menu-item-4549']/div/div/div/form/input[1]"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        sb.click();
        sb.sendKeys("library");
        driver().navigate().back();
    }
    public static void sendKeys() {
        WebElement sb = driver.findElement(By.xpath("//*[@id='menu-item-4549']/div/div/div/form/input[1]"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        sb.click();
        sb.sendKeys("library");
        driver().navigate().to(urlLibrary);
        driver().navigate().back();
    }
    public boolean isServReqvClickable(){

        try
        {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 3);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(), 'Service Request')]")));
            return true;
        }
        catch (Exception e)
        {
            return false;
        }

    }

    public static void goBack(){

        driver.navigate().back();
    }



}
