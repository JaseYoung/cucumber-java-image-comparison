package StepDefinitions;

import Helpers.ImageComparisonHelper;
import Helpers.SeleniumHelper;
import PageFactory.Pages;
import cucumber.api.java.en.Then;

public class SearchStepDefinition {

    @Then("^I capture element \"([^\"]*)\"$")
    public void iCaptureElement(String element) throws Throwable {
        SeleniumHelper.WaitForElement(Pages.homepage().ShopHomeLogo);
        ImageComparisonHelper.compareElementOnPage(Pages.homepage().ShopHomeLogo, element);
    }
}
