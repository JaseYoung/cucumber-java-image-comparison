package StepDefinitions;

import org.junit.Assert;
import Helpers.SeleniumHelper;
import PageFactory.Pages;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class HomepageStepDefinition {


    @When("^I navigate to \"([^\"]*)\"$")
    public void INavigateTo(String pageName) {
        Pages.homepage().NavigateToPage(pageName);
    }

    @Then("^I should be on the \"([^\"]*)\" page$")
    public void IShouldBeOnThePage(String pageName) {
        if (pageName.equals("Home")) {
            Assert.assertEquals(Pages.homepage().title, SeleniumHelper.GetPageTitle());
        }
    }

    @Given("^I am on the lego website \"(.*)\"$")
    public void iAmOnTheLegoWebsiteLocale(String locale) throws Throwable {
        Pages.homepage().NavigateToLego(locale);
    }
}
