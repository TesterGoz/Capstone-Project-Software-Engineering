package Pages;

import Utils.ConfigReader;
import base.Base;
import base.Driver;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
public class AcademicsPage extends Base{
    private static By academics=By.id ("menu-item-645");
    private static String timeStamp = new SimpleDateFormat ("yyyy_MM_dd__hh_mm_ss").format(new Date ());
    private static By academicsMenu=By.id ("menu-item-5684");
    private static String academicColorBefore;
    private static String academicColorAfter;
    private static int quickLinkWindowCount=0;
    private static By academicsColor=By.xpath("//*[@id=\"menu-item-645\"]/a/span[1]");
    private static By academicsPageMenuItems=By.xpath("//*[@id=\"sidebar\"]/ul/li");
    private static By quickLinksMenuItems=By.xpath("//*[@id=\"text-15\"]/div/a");
    private static String academicsPageUrl= "http://qatest2119.na.edu/academics/";
    private static String CourseSchedulesPageUrl= "http://qatest2119.na.edu/academics/course-schedule/";
    private static String FinalsSchedulesPageUrl= "http://qatest2119.na.edu/academics/finals-schedule/";
    private static String DegreeProgramsPageUrl= "http://qatest2119.na.edu/degree-programs/";
    private static String CalendarOfEventsPageUrl= "http://qatest2119.na.edu/academics/calendar-of-events/";
    private static String DistanceEducationPageUrl= "http://qatest2119.na.edu/academics/distance-education/";
    private static String AcademicCatalogPageUrl= "http://qatest2119.na.edu/academics/academic-catalog/";
    private static String FacultyMembersPageUrl= "http://qatest2119.na.edu/academics/faculty-members/";
    private static String AcademicCalendarPageUrl= "http://qatest2119.na.edu/academics/academic-calendar/";
    private static String AcademicClubsPageUrl= "http://qatest2119.na.edu/academics/academic-clubs/";
    private static String CourseDescriptionPageUrl= "http://qatest2119.na.edu/academics/course-description/";

    private static String NAULibraryPageTitle= "Library - North American University";
    private static String myNAULoginPageTitle= "Sign in to your account";
    private static String NAUmoodleLoginPageTitle= "Sign in to your account";
    private static String NAUEmailLoginPageTitle= "Sign in to Outlook";
    private static String NAUBrochurePageTitle= "NAU Brochures - North American University";
    private static String GulfLanguageSchoolPageTitle= "GLS - Gulf Language School - North American University";




    private static WebDriver driver(){
        WebDriver driver= Driver.getDriver ();
        driver.manage ().window ().maximize ();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver;
    }
    public static void screenShot(String TestName) throws IOException {

        String fileLocation= "src\\main\\CommonFile\\AcademicsScreenshots\\ScreenShots";
        String fileName=TestName+" "+timeStamp;
        String fileExtension=".png";

        File src = ((TakesScreenshot)(driver ())).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File(fileLocation+fileName+fileExtension));
    }

    public static void go_To_HomePage (){
        driver ().get (ConfigReader.getProperty ("url"));
        academicColorBefore=driver().findElement(academicsColor).getCssValue("color");

    }

    public static void click_academics (){


        driver ().findElement (academics).click ();
    }

    public static void Academics_page_will_displayed (){
        Assert.assertTrue (driver ().getCurrentUrl ().equalsIgnoreCase (academicsPageUrl));


    }
    public static void move_mouse_over_Academics (){
        new Actions (driver ()).moveToElement (driver ().findElement (academics)).build ().perform ();
        academicColorAfter=driver().findElement(academicsColor).getCssValue("color");
    }

    public static void menu_will_be_displayed () throws IOException {
        Assert.assertTrue(driver().findElement(academicsMenu).isDisplayed());
        screenShot("menu_will_be_displayed");
    }

    public static void AcademicsColorChanged () throws IOException {
        new Actions (driver ()).moveToElement (driver ().findElement (academics)).build ().perform ();
        Assert.assertNotEquals(academicColorBefore,academicColorAfter);
        screenShot("AcademicsColorChanged");
    }

    public static void goToAcademicsPage() {
        go_To_HomePage();
        click_academics();

    }

    public static void userClickAcademicPageMenuItem(String MenuItem) {
        goToAcademicsPage();
        boolean find=true;
        for(int i=0;i<11;i++){
            if (MenuItem.equalsIgnoreCase(driver().findElements(academicsPageMenuItems).get(i).getText().replaceAll("\\s+",""))){
                driver().findElements(academicsPageMenuItems).get(i).click();
                find=false;
                break;
            }

        }
        if (find){
            System.out.println(MenuItem+" page not found");
        }
    }



    public static void correctMenuItemPageWillDisplay(String MenuItem) throws IOException {
        String currentUrl= driver().getCurrentUrl();

        String expectedUrl;
        switch(MenuItem){
            case "Academics" : expectedUrl=academicsPageUrl;
                break;
            case "CourseSchedule" : expectedUrl=CourseSchedulesPageUrl;
                break;
            case "FinalsSchedule" : expectedUrl=FinalsSchedulesPageUrl;
                break;
            case "DegreePrograms" : expectedUrl=DegreeProgramsPageUrl;
                break;
            case "CalendarOfEvents" : expectedUrl=CalendarOfEventsPageUrl;
                break;
            case "DistanceEducation" : expectedUrl=DistanceEducationPageUrl;
                break;
            case "AcademicCatalog" : expectedUrl=AcademicCatalogPageUrl;
                break;
            case "FacultyMembers" : expectedUrl=FacultyMembersPageUrl;
                break;
            case "AcademicCalendar" : expectedUrl=AcademicCalendarPageUrl;
                break;
            case "AcademicClubs" : expectedUrl=AcademicClubsPageUrl;
                break;
            case "CourseDescription" : expectedUrl=CourseDescriptionPageUrl;
                break;
            default:
                expectedUrl="";
                System.out.println( MenuItem+" page is not displayed");

        }



        Assert.assertEquals(expectedUrl,currentUrl);
    }

    public static void userClickQuickLinksMenuItem(String QuickLink) {
        goToAcademicsPage();
        boolean find=true;
        Actions a =new Actions(driver());
        for(int i=0;i<7;i++){
            if (QuickLink.equalsIgnoreCase(driver().findElements(quickLinksMenuItems).get(i).getText().replaceAll("\\s+",""))){
                a.keyDown(Keys.CONTROL).click(driver().findElements(quickLinksMenuItems).get(i)).keyUp(Keys.CONTROL).build().perform();
                find=false;
                break;
            }

        }
        if (find){
            System.out.println(quickLinksMenuItems+" page not found");
        }
    }

    public static void correctQuickLinksPageWillDisplay(String QuickLink) throws IOException {
        ++quickLinkWindowCount;

        driver().getWindowHandles();
        Set<String> ids=driver().getWindowHandles();
        Iterator<String> it=ids.iterator();
        String parentId=it.next();
        String ChildId;
        switch(quickLinkWindowCount){
            case 6 : ChildId=it.next();

            case 5 :  ChildId=it.next();

            case 4 : ChildId=it.next();

            case 3 : ChildId=it.next();

            case 2 : ChildId=it.next();

            case 1 : ChildId=it.next();
                break;
            default:
                ChildId="";
                System.out.println("Window does not exist");
        }
        driver().switchTo().window(ChildId);
        String currentTitle= driver().getTitle();
        driver().switchTo().window(parentId);

        String expectedTitle;
        switch(QuickLink){
            case "NAULibrary" : expectedTitle=NAULibraryPageTitle;
                break;
            case "myNAULogin" : expectedTitle=myNAULoginPageTitle;
                break;
            case "NAUmoodleLogin" : expectedTitle=NAUmoodleLoginPageTitle;
                break;
            case "NAUEmailLogin" : expectedTitle=NAUEmailLoginPageTitle;
                break;
            case "NAUBrochures" : expectedTitle=NAUBrochurePageTitle;
                break;
            case "GulfLanguageSchool" : expectedTitle=GulfLanguageSchoolPageTitle;
                break;

            default:
                expectedTitle="";
                System.out.println(QuickLink+" page is not displayed");

        }

        Assert.assertEquals(expectedTitle,currentTitle);
    }
}
