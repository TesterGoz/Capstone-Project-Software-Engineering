package StepDef;
import Pages.FacultyStaffPage;
import base.Base;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.io.IOException;

public class FacultyStaff {
    FacultyStaffPage facultyStaff = new FacultyStaffPage();

    @Given("^User navigates to the main page$")
    public void user_navigates_to_the_main_page() throws Throwable {
        facultyStaff.goHomePage();
    }

    @When("^User hover over on Faculty&Staff button on menu$")
    public void user_hover_over_on_facultystaff_button_on_menu() throws Throwable {
        facultyStaff.doesItHoverOver();
    }

    @Then("^Button color changes$")
    public void button_color_changes() throws Throwable {
        facultyStaff.verifyColorChange();
    }
/*
    @And("^Button is clickable$")
    public void button_is_clickable() throws Throwable {
        facultyStaff.verifyIfButtonIsClickable();
    }

 */

    @When("User hover over Faculty&Staff button on menu")
    public void user_hover_over_Faculty_Staff_button_on_menu() {

    }

    @Then("Dropdown menu is visible")
    public void dropdown_menu_is_visible() {
        facultyStaff.isDropdownMenuVisible();
    }
    @When("^User clicks Faculty&Staff button on menu$")
    public void user_clicks_facultystaff_button_on_menu() throws Throwable {
        facultyStaff.clickFsLink();
    }

    @Then("^User navigates to respective page$")
    public void user_navigates_to_respective_page() throws Throwable {
        facultyStaff.verifyGoRespectivePage();
    }


}
