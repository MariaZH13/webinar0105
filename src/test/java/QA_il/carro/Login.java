package QA_il.carro;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends TestBase{

    @Test
    public void positiveLoginTest() throws InterruptedException {
     //   wd.findElement(By.xpath("//a[text()='Log in']")).click();
        click(By.xpath("//a[text()='Log in']"));

  //      wd.findElement(By.id("email")).click();
  //      wd.findElement(By.id("email")).clear();
  //      wd.findElement(By.id("email")).sendKeys("mariahryn@gmail.com");
        type(By.id("email"),"mariahryn@gmail.com");

 //       wd.findElement(By.id("password")).click();
 //            wd.findElement(By.id("password")).clear();
//        wd.findElement(By.id("password")).sendKeys("abcdE34_*");
        type(By.id("password"), ("abcdE34_*"));

 //       wd.findElement(By.xpath("//button[@type='submit']")).click();
        click(By.xpath("//button[@type='submit']"));
        pause(3000);
        Assert.assertTrue(isElementDisplayed(By.xpath("//div[@class='dialog-container']//h2")));


    }

    @Test
    public void negativeLoginTest(){
        click(By.xpath("//a[text()='Log in']"));
        type(By.id("email"),"mariahryn@gmail.com");
        type(By.id("password"), "abcdE34_*");
        click(By.xpath("//button[@type='submit']"));
        pause(3000);
        Assert.assertTrue(isElementDisplayed(By.xpath("//h2[normalize-space()='\"Login or Password incorrect\"']")));


    }


}
