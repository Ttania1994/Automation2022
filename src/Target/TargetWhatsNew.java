package Target;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TargetWhatsNew {


    static WebDriver driver;
    static String actualText;

    /**
     * Test Case: Target Pickup and delivery should work properly.
     */
    @BeforeTest
    public static void SetUp() {
        String driverPath = "../Automation2022/BrowserDriver/Windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);


//        To open browse
        driver = new ChromeDriver();
        driver.get("https://www.target.com/");
        driver.manage().window().maximize();
    }


    /**
     * Scenario 1: Pickup and delivery  functionality should be clickable.
     */


    @Test
    public static void clickable() {

//user is click on Whats new
        driver.findElement(By.xpath("//*[@id=\"headerPrimary\"]/div[4]/a")).click();

    }

    /**
     * Scenario 2 :in whats new , kids new arrivals button should be clickable.
     */

    @Test
    public static void clickable1() throws InterruptedException {

//user is click on Whats new
        driver.findElement(By.xpath("//*[@id=\"headerPrimary\"]/div[4]/a")).click();
Thread.sleep(4000);
        //user can be click on kids new arrivals button.
        driver.findElement(By.xpath("//*[@id=\"headerPrimary\"]/div[4]/a")).click();


    }



}
