package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {
        //instance
        WebDriver driver=new ChromeDriver();
        //navigate to the website
        driver.get("http://35.175.58.98/input-form-locator.php");
        //maximize the screen
        driver.manage().window().maximize();
        //locate the webElement first name
        WebElement firstName=driver.findElement(By.id("first_name"));
        firstName.sendKeys("moazzam");

        //locate the webElement last name
        WebElement lastName=driver.findElement(By.name("last_name"));
        lastName.sendKeys("sadiq");

        WebElement email=driver.findElement(By.className("form-control-01"));
        email.sendKeys("moazzamsadiq@gmail.com");

        WebElement submitBtn= driver.findElement(By.tagName("button"));
        submitBtn.click();

       WebElement linkBtn=driver.findElement(By.linkText("Link"));
       linkBtn.click();

       WebElement clickHere=driver.findElement(By.partialLinkText("Here."));
       clickHere.click();

    }

}
