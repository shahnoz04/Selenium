package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookExample {
    public static void main(String[] args) throws InterruptedException {
        //instance
        WebDriver driver=new ChromeDriver();
        //go to fb.com
        driver.get("https://www.facebook.com");
        //maximize the window
        driver.manage().window().maximize();

        WebElement email=driver.findElement(By.id("email"));
        email.sendKeys("moazzamsadiq94@gmail.com");

        WebElement password= driver.findElement(By.name("pass"));
        password.sendKeys("abracedbare");


        WebElement login= driver.findElement(By.name("login"));
        login.click();
    }
}
