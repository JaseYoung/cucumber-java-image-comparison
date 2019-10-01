package PageObjects;

import org.openqa.selenium.By;
import Helpers.SeleniumDriver;
import Helpers.SeleniumHelper;

public abstract class BaseClass {

    public String pageName = "";
    public String relativeUrl = "";
    public String title = "";
    public String url = "";

    public void NavigateToLego(String locale) {
        SeleniumHelper.GoToUrl("http://lego.com/" + locale + "/");
    }

    public void NavigateToPage(String linkText) {
        SeleniumDriver.Instance().findElement(By.linkText(linkText)).click();
    }

    public void Search(String keyword) {
        SeleniumHelper.FindElement(By.id("orb-search-q")).sendKeys(keyword);
        SeleniumHelper.FindElement(By.id("orb-search-button")).click();
    }
}
