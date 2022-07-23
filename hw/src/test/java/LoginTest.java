import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class LoginTest {

   WebDriver driver ;

   public void loginTest(){

     driver = BrowserFactory.startapplication(driver, "Chrome" , "https://www.enuygun.com/");
     LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
     loginPage.loginto("test@ali.com","admin");
     BrowserFactory.QuitBrowser(driver);

   }





    }


