import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class ChromeProfile {



    ChromeOptions options = new ChromeOptions();
    String userProfile= "C:\\Users\\alika\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\";


    public ChromeProfile() {


        options.addArguments("user-data-dir=" + userProfile);
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.get("http://www.enuygun.com");
        driver.findElement(By.xpath("//*[contains(span,\"Google ile\")]"));

    }

}
