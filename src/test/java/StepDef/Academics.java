package StepDef;
import Pages.AcademicsPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import java.io.IOException;


@RunWith(Cucumber.class)
    public class Academics {

        @Given("^User will go to home page$")
        public void user_will_go_to_home_page() throws Throwable {
            AcademicsPage.go_To_HomePage();
        }

        @When("^Moving mouse over Academics$")
        public void moving_mouse_over_academics() throws Throwable {
        AcademicsPage.click_academics();
        }

    @Then("Academics page will be displayed")
    public void academics_page_will_be_displayed() throws IOException {
        // Write code here that turns the phrase above into concrete actions
        AcademicsPage.Academics_page_will_displayed ();
        AcademicsPage.screenShot ("AcademicsPageDisplay");
    }


    @When("move mouse over Academics")
    public void moveMouseOveAcademics() {
        AcademicsPage.move_mouse_over_Academics ();

    }

    @Then("menu will be displayed")
    public void menuWillBeDisplayed() throws IOException {
        AcademicsPage.menu_will_be_displayed();
    }
    @Then("color will change")
    public void color_will_change() throws IOException {
        // Write code here that turns the phrase above into concrete actions
        AcademicsPage.AcademicsColorChanged();
    }

    @Given("user go to academics page")
    public void userGoToAcademicsPage() {
        AcademicsPage.goToAcademicsPage();
    }

    @When("user click the {string}")
    public void userClickThe(String arg0) {
        AcademicsPage.userClickAcademicPageMenuItem(arg0);
    }


    @Then("corresponding {string} page will be displayed")
    public void correspondingPageWillBeDisplayed(String arg0) throws IOException {
        AcademicsPage.correctMenuItemPageWillDisplay(arg0);
    }

    @Then("corresponding Quick Links {string} page will be displayed")
    public void correspondingQuickLinksPageWillBeDisplayed(String arg0) throws IOException {
        AcademicsPage.correctQuickLinksPageWillDisplay(arg0);
    }

    @When("user click the {string} under Quick Links")
    public void userClickTheUnderQuickLinks(String arg0) throws IOException {
        AcademicsPage.userClickQuickLinksMenuItem(arg0);
    }



    }

