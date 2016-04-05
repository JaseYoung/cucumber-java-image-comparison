package StepDefinitions;

import Helpers.ImageComparisonHelper;
import Helpers.SeleniumHelper;
import cucumber.api.PendingException;
import org.junit.Assert;

import PageFactory.Pages;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchStepDefinition {

    @Then("^I capture element \"([^\"]*)\"$")
    public void iCaptureElement(String element) throws Throwable {
        SeleniumHelper.WaitForElement(Pages.homepage().ShopHomeLogo);
        ImageComparisonHelper.compareElementOnPage(Pages.homepage().ShopHomeLogo, element);
    }
}
