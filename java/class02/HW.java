package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement userName=driver.findElement(By.name("username"));
        userName.sendKeys("abc");
        Thread.sleep(2000);
        userName.sendKeys(Keys.CONTROL + "a");
        userName.sendKeys(Keys.DELETE);
        userName.sendKeys("Admin");
        WebElement password=driver.findElement(By.name("password"));
        password.sendKeys("admin123");
        WebElement login= driver.findElement(By.tagName("button"));
        String log=login.getText();
        System.out.println(log);
        login.click();
    }

    }
