import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginPage {

WebDriver driver = new ChromeDriver();
WebElement button ;
// E mail Locator
    WebElement username = driver.findElement(By.name("_email"));
// Password Locator
    WebElement password= driver.findElement(By.name("_password"));

    public void loginto(String usrnme, String pswrd)
    {
        driver.findElement(By.id("ctx-LoginBtn")).click();
        username.sendKeys(usrnme);
        password.sendKeys(pswrd);
        driver.findElement(By.cssSelector("span.MuiButton01222"));
    }
}
