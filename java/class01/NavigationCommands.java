package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");

        driver.manage().window().maximize();
        Thread.sleep(2000);
        //go to fb
        driver.navigate().to("http://www.facebook.com"); //get does not allow to move forward and backward whereas navigate allows
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        //go forward
        driver.navigate().forward();
//           slow down to observe
        Thread.sleep(2000);
        driver.navigate().refresh();

//        close
        driver.close(); //close == closes the current tab, quit close the whole tab
//        also we can use
//        driver.quit();
    }
}
