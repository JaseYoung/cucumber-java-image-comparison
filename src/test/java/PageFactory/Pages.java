package PageFactory;

import org.openqa.selenium.support.PageFactory;

import Helpers.SeleniumHelper;
import PageObjects.HomePage;

public class Pages {

	public static HomePage homepage()
	{
		return PageFactory.initElements(SeleniumHelper.GetDriver(), HomePage.class);
	}

}
