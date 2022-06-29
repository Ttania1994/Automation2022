package Target;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TargetPickupAndDelivery {

    static WebDriver driver;
    static String actualText;

    /**
     * Test Case: Target Pickup and delivery should work properly.
     */
    @BeforeTest
    public static void SetUp() throws InterruptedException {
        String driverPath = "../Automation2022/BrowserDriver/Windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);


//        To open browse
        driver = new ChromeDriver();
        driver.get("https://www.target.com/");
        driver.manage().window().maximize();

        Thread.sleep(3000);
    }

    /**
     * Scenario 1:  In target home page, "Pickup & Delivery" button should clickable
     * @throws InterruptedException
     */


    @Test
    public static void pickUpButton() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"headerPrimary\"]/div[5]/a")).click();


        //         Verify successful click on "Pickup & Delivery"
        String expectedText ="Order Pickup";
        Thread.sleep(5000);
        String actualText = driver.findElement(By.xpath("//*[@id=\"overlay-12\"]/ul/li[1]/a/div/span")).getText();
        System.out.println("Actual Text : " + actualText);
        System.out.println("Expected Text :" + expectedText);
        Thread.sleep(4000);
        Assert.assertEquals(actualText, expectedText, "Pickup & Delivery does not  work properly");
        Thread.sleep(3000);
        driver.close();
    }

        /**
         * Scenario 2 :in Pickup and delivery , order pickup button should be clickable.
         */

        @Test
        public static void clickable1 () throws InterruptedException {

//user is click on Pickup and delivery
            driver.findElement(By.xpath("//*[@id=\"headerPrimary\"]/div[5]/a")).click();
            Thread.sleep(2000);
            //user can be click on order pickup button.
            driver.findElement(By.id("skipLinks")).click();


        }


    }

