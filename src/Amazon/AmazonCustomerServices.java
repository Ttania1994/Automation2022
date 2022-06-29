package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonCustomerServices {


    static WebDriver driver;
    static String actualText;

    /**
     * Test Case: Amazon Customer service should work properly.
     */
    @BeforeTest
    public static void SetUp() throws InterruptedException {
        String driverPath = "../Automation2022/BrowserDriver/Windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);


//        To open browse
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();

       Thread.sleep(3000);
    }

    /**
     * Scenario 1: Amazon customer services functionality should be clickable.
     */


    @Test
    public static void clickable() throws InterruptedException {

//user is click on amazon customer services
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]")).click();

//         Verify successful clickable
        String expectedText = "Welcome to Amazon Customer Service";
        Thread.sleep(4000);
        String actualText = driver.findElement(By.xpath("//*[@id=\"hub-gateway-app-unauth\"]/div[1]/div/h1")).getText();
        System.out.println("Actual Text : " + actualText);
        System.out.println("Expected Text :" + expectedText);
        Thread.sleep(3000);
        Assert.assertEquals(actualText, expectedText, "Amazon customer service page does not open");
        Thread.sleep(3000);
        driver.close();
    }

    /**
     * Scenario 2 :in amazon customer services, digital services and device support should be clickable.
     */

    @Test
    public static void clickable1() throws InterruptedException {

//user is click on amazon customer services
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]")).click();


        Thread.sleep(5000);
        //user can be click on  amazon launchpad.
        driver.findElement(By.xpath("//*[@id=\"hub-gateway-app-unauth\"]/header/div[3]/a")).click();

       // Verify successful clickable
        String expectedText = "Digital Services and Device Support";
        Thread.sleep(4000);
        String actualText = driver.findElement(By.className("h1headding")).getText();
        System.out.println("Actual Text : " + actualText);
        System.out.println("Expected Text :" + expectedText);
        Thread.sleep(3000);
        Assert.assertEquals(actualText, expectedText, "Digital Services and Device Support page does not clickable");
        Thread.sleep(3000);
        driver.close();


    }
}
