package Helpers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SeleniumDriver {

    public static WebDriver driver;
    public static String webdriver = System.getProperty("browser", "firefox");

    public static WebDriver Instance() {
        if (driver == null) {
            createWebDriver();
            return driver;
        } else {
            return driver;
        }
    }

    public static void createWebDriver() {
        if (webdriver.equals("firefox")) {
            driver = new FirefoxDriver();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        } else if (webdriver.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/bin/chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        } else if (webdriver.equals("ie")) {
            driver = new InternetExplorerDriver();
            driver.manage().window().maximize();
        } else if (webdriver.equals("safari")) {
            System.setProperty("webdriver.safari.noinstall", "true");
            driver = new SafariDriver();
            driver.manage().window().maximize();
        } else {
            throw new RuntimeException("Unsupported webdriver: " + webdriver);
        }
    }


}
