package StepDef;

import Pages.AdmissionsPage;
import Pages.ThreeSixtyFivePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class ThreeSixtyFive {
    @Given("user will navigates to the website")
    public void user_will_navigates_to_the_website() {
        ThreeSixtyFivePage.visitHomePage();
    }

    @When("user clicks on {int} Portal")
    public void user_clicks_on_Portal(Integer int1) {
        ThreeSixtyFivePage.clickThreeSixtyFivePortal();
    }

    @Then("a page will navigate to {string}")
    public void a_page_will_navigate_to(String threeSixtyFive) {
        ThreeSixtyFivePage.clickThreeSixtyFivePortal();

    }
    @Then("the page will open")
    public void the_page_will_open() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

}
