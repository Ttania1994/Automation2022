package Target;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TargetHomePage {


    static WebDriver driver;
    static String actualText;

    /**
     * Test Case: Target Home page should work properly.
     */
    @BeforeTest
    public static void SetUp() throws InterruptedException {
        String driverPath = "../Automation2022/BrowserDriver/Windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);


        /**
         * Scenario 1: Home page should be properly landed.
         */

//        To open browse
        driver = new ChromeDriver();
        driver.get("https://www.target.com/");
        driver.manage().window().maximize();

       // Verify successfully work
        String expectedText = "Categories";
        Thread.sleep(4000);
        String actualText = driver.findElement(By.xpath("//*[@id=\"headerPrimary\"]/div[2]/a")).getText();
        System.out.println("Actual Text : " + actualText);
        System.out.println("Expected Text :" + expectedText);
        Thread.sleep(3000);
        Assert.assertEquals(actualText, expectedText, "Target home  page does not open");
        Thread.sleep(3000);


    }

    /**
     * Scenario 2 : Categories drop down menu should be clickable.
     */
    @Test
    public static void clickable() throws InterruptedException {


        driver.findElement(By.xpath("//*[@id=\"headerPrimary\"]/div[2]/a")).click();


        // Verify successfully work
        String expectedText = "Categories ";
        Thread.sleep(4000);
        String actualText = driver.findElement(By.xpath("//*[@id=\"headerPrimary\"]/div[2]/a")).getText();
        System.out.println("Actual Text : " + actualText);
        System.out.println("Expected Text :" + expectedText);
        Thread.sleep(3000);
        Assert.assertEquals(actualText, expectedText, "Categories drop down menu  does not work properly");
        Thread.sleep(3000);
        driver.close();

    }



}