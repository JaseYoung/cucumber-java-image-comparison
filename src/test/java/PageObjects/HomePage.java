package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BaseClass {

	@FindBy(how = How.ID, using = "homeLink")
	public WebElement ShopHomeLogo;
	public String pageName = "";
	public String relativeUrl = "";
	public String title = "";
	public String url = "";
}
