package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Links {
    public static void main(String[] args) {
        //instance
        WebDriver driver=new ChromeDriver();
        //navigate to the website
        driver.get("http://www.amazon.com");
        //maximize the screen
        driver.manage().window().maximize();
        //get all links and print them on the console
        List<WebElement> links=driver.findElements(By.tagName("a"));
        for(WebElement link:links){
            String nameOfLink=link.getText();
            System.out.println(nameOfLink);
            String linkVal=link.getAttribute("href");
            System.out.println(linkVal);

        }
    }
}
