import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginPage {

    // Driver set up
WebDriver driver = new ChromeDriver();

// E mail Locator
    WebElement username = driver.findElement(By.name("_email"));
// Password Locator
    WebElement password= driver.findElement(By.name("_password"));

    public void loginto(String usrnme, String pswrd)
    {
        driver.findElement(By.id("ctx-LoginBtn")).click(); // Home-Page Log in locator
        username.sendKeys(usrnme); // username
        password.sendKeys(pswrd);   // password
        driver.findElement(By.cssSelector("span.MuiButton01222")); // Log-in locator
    }
}
