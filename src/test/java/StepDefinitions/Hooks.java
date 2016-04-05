package StepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import Helpers.SeleniumDriver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    @Before
    public void beforeScenario() {
        SeleniumDriver.Instance();
    }

    @After
    public void TestShutDown(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                scenario.write("Current Page URL is " + SeleniumDriver.Instance().getCurrentUrl());
                byte[] buf = ((TakesScreenshot) SeleniumDriver.Instance()).getScreenshotAs(OutputType.BYTES);
                scenario.embed(buf, "image/png");
            } catch (WebDriverException somePlatformsDontSupportScreenshots) {
                System.err.println(somePlatformsDontSupportScreenshots.getMessage());
            }
        }
    }

    @After
    public void afterScenario() {
        SeleniumDriver.Instance().quit();
        SeleniumDriver.driver = null;
    }

}