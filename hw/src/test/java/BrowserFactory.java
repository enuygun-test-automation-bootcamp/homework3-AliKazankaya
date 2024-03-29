import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BrowserFactory {


    public static WebDriver startapplication(WebDriver driver, String BrowserName, String appURL) {
        // Here Select Browser Types
        if (BrowserName.equals("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
            driver = new ChromeDriver();

        } else if (BrowserName.equals("FireFox")) {
            System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else {
            System.out.println("Sorry this browser is not supported !!");
        }
         // Some Options of our browser.
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(appURL);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        return driver;
    }
// When Script is completed, Browser will close automatically.
    public static void QuitBrowser(WebDriver driver)
    {
        driver.quit();
    }
}
