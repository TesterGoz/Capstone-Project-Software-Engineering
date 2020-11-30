package StepDef;
import Pages.CampusLifePage;
import Pages.FacultyStaffPage;
import Utils.SeleniumUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.io.IOException;
public class CampusLife {
    CampusLifePage campusLifePage = new CampusLifePage();

    @Given("User will navigate to the NAU website")
    public void user_will_navigate_to_the_NAU_website() {
        CampusLifePage.goToPage();
    }

    @When("User hovers on Campus Life button on menu")
    public void user_hovers_on_Campus_Life_button_on_menu() {
        CampusLifePage.mouseOverCampusLife();
    }

    // @When("User hovers over on Campus Life button on menu")
    //public void user_hovers_over_on_Campus_Life_button_on_menu() {

    //}

    @Then("The Button color changes then")
    public void the_Button_color_changes_then() throws InterruptedException {
        CampusLifePage.colorChangeVerified();
    }

    @Then("Button becomes clickable")
    public void button_becomes_clickable() {
        CampusLifePage.buttonIsClickable();
    }
    @Then("Three sections on Student Services, Residential Life and Parking & Security are displayed on screen")
    public void three_sections_on_Student_Services_Residential_Life_and_Parking_Security_are_displayed_on_screen() {

    }

    @Then("Under Sub-section of Student Services user will click on Calendar of Events")
    public void under_Sub_section_of_Student_Services_user_will_click_on_Calendar_of_Events() {
        CampusLifePage.clickOnCalendarOfEvents();
    }

    @When("User hovers on Admissions")
    public void user_hovers_on_Admissions() {

        CampusLifePage.mouseOverAdmissions();
    }

    @Then("Three sections on Undergraduate, Graduate, Gulf Language School are displayed")
    public void three_sections_on_Undergraduate_Graduate_Gulf_Language_School_are_displayed() {
    }

    @When("User hovers on Academics")
    public void user_hovers_on_Academics()
    {
        CampusLifePage.mouseOverAcademics();
    }

    @Then("Three sections on Academic Resources are displayed")
    public void three_sections_on_Academic_Resources_are_displayed() {
    }

    @When("User hovers on Faculty & Staff")
    public void user_hovers_on_Faculty_Staff() {

        CampusLifePage.mouseOverFacultyStaff();
    }

    @Then("Sections on Employee Center and News and Events are displayed")
    public void sections_on_Employee_Center_and_News_and_Events_are_displayed() {
    }

    @When("User hovers on Students")
    public void user_hovers_on_Students() {

        CampusLifePage.mouseOverStudents();
    }

    @Then("Information on Offices will be displayed")
    public void information_on_Offices_will_be_displayed() {
    }

    @When("User hovers on About NAU")
    public void user_hovers_on_About_NAU() {

        CampusLifePage.mouseOverAboutNau();
    }

    @Then("Three sections on Mission Statement, Office of the President and Details are displayed")
    public void three_sections_on_Mission_Statement_Office_of_the_President_and_Details_are_displayed() {
    }

    @Then("User hovers on Student Organizations")
    public void user_hovers_on_Student_Organizations() {
        CampusLifePage.mouseOverStudentOrganizations();
    }
    @Then("User hovers on Calendar of Events")
    public void user_hovers_on_Calendar_of_Events() {
        CampusLifePage.hoversOverCalendarOfEvents();
        CampusLifePage.clickOnCalendarOfEvents();
        CampusLifePage.goBack();
        CampusLifePage.clickOnCampusLife();
    }
    @Then("User hovers on Health Services")
    public void user_hovers_on_Health_Services() {
        CampusLifePage.hoversOverHealthServices();
        CampusLifePage.clickOnHealthServices();
        CampusLifePage.goBack();
        CampusLifePage.clickOnCampusLife();
    }
    @Then("User hovers on Housing")
    public void user_hovers_on_Housing() {
        CampusLifePage.hoversOverHousing();
        CampusLifePage.clickOnHousing();
        CampusLifePage.goBack();
        CampusLifePage.clickOnCampusLife();
    }

    @Then("User hovers on Dining at NAU")
    public void user_hovers_on_Dining_at_NAU() {
        CampusLifePage.hoversOverDiningAtNau();
        CampusLifePage.clickOnDiningNau();
        CampusLifePage.goBack();
        CampusLifePage.clickOnCampusLife();
    }
    @Then("User hovers on Campus Security")
    public void user_hovers_on_Campus_Security() {
        CampusLifePage.hoversOverCampusSecurity();
        CampusLifePage.clickOnCampusSecurity();
        CampusLifePage.goBack();
        CampusLifePage.clickOnCampusLife();
    }
    @Then("User hovers on Emergency Guide")
    public void user_hovers_on_Emergency_Guide() {
        CampusLifePage.hoversOverEmergencyGuide();
        CampusLifePage.clickOnEmergencyGuide();
        CampusLifePage.goBack();
        CampusLifePage.clickOnCampusLife();
    }
    @When("User clicks on Request Info")
    public void user_clicks_on_Request_Info() {
        CampusLifePage.clickRequestInfo();
    }

    @Then("Info appears")
    public void info_appears() throws IOException, InterruptedException {
        //CampusLifePage.goesToRespectiveRequestInfo();
    }
    @Then("User sees detailed information")
    public void user_sees_detailed_information() {

    }
    @When("user click the Student Organizations")
    public void user_click_the_Student_Organizations() {
        CampusLifePage.hoversOverStudentOrganizations();
        CampusLifePage.clickOnStudentOrganizations();
        CampusLifePage.goBack();
        CampusLifePage.clickOnCampusLife();
    }
    @Then("Student Organizations Page will be displayed")
    public void student_Organizations_Page_will_be_displayed() {
        CampusLifePage.StudentOrganizationsPageIsDisplayed();
    }
    @When("User hovers over on Campus Life button on menu")
    public void user_hovers_over_on_Campus_Life_button_on_menu() {

    }

    @When("User clicks on Campus Life")
    public void user_clicks_on_Campus_Life() {
        CampusLifePage.mouseOverCampusLife();
        CampusLifePage.clickOnCampusLife();

    }
    @Then("User hovers on Service Request")
    public void user_hovers_on_Service_Request() {
        CampusLifePage.hoversOverServReqv();
        CampusLifePage.clickOnServReqv();
        CampusLifePage.goBack();
        CampusLifePage.clickOnCampusLife();
    }

    @Then("User hovers on Parking & Transportation")
    public void user_hovers_on_Parking_Transportation() {
        CampusLifePage.hoversOverParkingTransportation();
        CampusLifePage.clickOnParkingTransportation();
        CampusLifePage.goBack();
        CampusLifePage.clickOnCampusLife();
    }

    @Then("User hovers on Student Services")
    public void user_hovers_on_Student_Serivces() {
        CampusLifePage.hoversOverStudentServices();
        CampusLifePage.clickOnStudentServices();
        CampusLifePage.goBack();
        CampusLifePage.clickOnCampusLife();
    }
    @When("user clicks on Search Button")
    public void user_clicks_on_Search_Button() {
        CampusLifePage.clickOnSearchBox();

    }

    @Then("user sends keys")
    public void user_sends_keys() {
        CampusLifePage.sendKeys();
        CampusLifePage.goBack();
        CampusLifePage.clickOnCampusLife();
    }


}
