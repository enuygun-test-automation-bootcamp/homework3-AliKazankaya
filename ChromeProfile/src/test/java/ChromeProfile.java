import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class ChromeProfile {



    ChromeOptions options = new ChromeOptions();
    // Profile Path
    String userProfile= "C:\\Users\\alika\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\";


    public ChromeProfile() {

          // Some Options Here
        options.addArguments("user-data-dir=" + userProfile);
        options.addArguments("--start-maximized");
        // Driver set up
        WebDriver driver = new ChromeDriver(options);
        // the url we want to go to
        driver.get("http://www.enuygun.com");

        //Found Locator
        driver.findElement(By.xpath("//*[contains(span,\"Google ile\")]"));

    }

}
