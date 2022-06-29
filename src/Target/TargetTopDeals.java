package Target;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TargetTopDeals {


    static WebDriver driver;
    static String actualText;

    /**
     * Test Case: Target Deals should work properly.
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
     * Scenario 1: Deals functionality should be clickable.
     */


    @Test
    public static void clickable() {

//user is click on Deals
        driver.findElement(By.xpath("//*[@id=\"headerPrimary\"]/div[3]/a")).click();

    }

    /**
     * Scenario 2 :in Deals, Top deals should be clickable.
     */

    @Test
    public static void clickable1() throws InterruptedException {

//user is click on Deals
        driver.findElement(By.xpath("//*[@id=\"headerPrimary\"]/div[3]/a")).click();
Thread.sleep(3000);
        //user can be click on Top deals button.
        driver.findElement(By.className("CellSkinny__TextWrapper-sc-117d15w-0 bcbdds")).click();


    }





}
