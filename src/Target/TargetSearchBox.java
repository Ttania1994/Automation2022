package Target;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TargetSearchBox {


    static WebDriver driver;
    static String actualText;

    /**
     * Test Case: Target search box functionality should work properly;
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
     * Scenario 1: Search box should be type able with valid product name
     */

    @Test
    public static void typeAble() {
        driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("iphone12");


        actualText = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div/nav/div[6]/form/input")).getText();
        System.out.println("Actual Text : " + actualText);
        String expectedText = "iphone12";
        System.out.println("Expected Text : " + expectedText);

        if (actualText.equals(expectedText)) {
            System.out.println("Test Pass");
        } else {
            System.out.println("Test Fail");
        }

    }

    /**
     * Scenario 2 : Search box should be clickable
     */
@Test
    public static void clickable() throws InterruptedException {
//
        driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("iphone12");
Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"headerPrimary\"]/div[6]/form/button[2]")).click();
Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"typeahead\"]/li[1]/div/a")).click();


    }

}









