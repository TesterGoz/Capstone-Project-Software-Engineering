package StepDef;
import Pages.AcademicsPage;
import Pages.AdmissionsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
public class Admissions {
    @Given("user navigates to the website")
    public void user_navigates_to_the_website() {
        AdmissionsPage.visitHomePage();

    }

    @When("user clicks on APPLY NOW")
    public void user_clicks_on_APPLY_NOW() {
        AdmissionsPage.clickApplyNow();
    }

    @Then("the page will navigate to {string}")
    public void the_page_will_navigate_to(String string) {
        AdmissionsPage.applypage_page_will_displayed();
    }

    @Then("the page will appear")
    public void the_page_will_appear() {

    }

    @When("user mouse over on APPLY NAU")
    public void user_mouse_over_on_APPLY_NAU() {
        AdmissionsPage.mouseOver();


    }

    @Then("APPLY NAU should be underlined")
    public void apply_NAU_should_be_underlined() {


    }

}
