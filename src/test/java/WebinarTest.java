import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WebinarTest {
    WebDriver wd;
    String browser = "Chrome";

    @Test
    public void searchWebDriverTest(){
       if(browser.equals("Chrome")){
           wd = new ChromeDriver();
       }
       wd.manage().window().maximize();
       wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       wd.navigate().to("https://www.google.com");
       wd.findElement(By.name("q")).sendKeys("WebDriver"+ Keys.ENTER);
        wd.navigate().to("https://www.saucedemo.com/");
        wd.findElement(By.name("user-name")).sendKeys("standard_user");
        wd.findElement(By.name("password")).sendKeys("secret_sauce");
        wd.findElement(By.id("login-button")).click();

    }

}
