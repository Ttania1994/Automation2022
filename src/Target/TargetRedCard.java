package Target;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TargetRedCard {

    static WebDriver driver;
    static String actualText;

    /**
     * Test Case: Target Red card should work properly.
     */
    @BeforeTest
    public static void SetUp() throws InterruptedException {
        String driverPath = "../Automation2022/BrowserDriver/Windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);


//        To open browse
        driver = new ChromeDriver();
        driver.get("https://www.target.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

    }


    /**
     * Scenario 1: Red card functionality should be clickable.
     */


    @Test
    public static void clickable() throws InterruptedException {

//user is click on red card.
        driver.findElement(By.id("utilityNav-redCardLI")).click();

       //  Verify successfully work
        String expectedText = "RedCard";
        Thread.sleep(4000);
        String actualText = driver.findElement(By.className("Heading__StyledHeading-sc-1mp23s9-0 NavHeader__RedCardHeading-sc-1t30nzk-0 dUBjVM zwjbk h-text-red")).getText();
        System.out.println("Actual Text : " + actualText);
        System.out.println("Expected Text :" + expectedText);
        Thread.sleep(3000);
        Assert.assertEquals(actualText, expectedText, "RedCard does not clickable");
        Thread.sleep(3000);
        driver.close();
    }

/**
 * Scenario 2 :in red card, program rules should be clickable.
 */

@Test
public static void clickable1() throws InterruptedException {

//user is click on red card.
    driver.findElement(By.className("Link__StyledLink-sc-4b9qcv-0 styles__StyledLink-sc-1ghv6mc-2 ghasId ckIRoZ h-text-sm h-text-white h-padding-a-none h-margin-l-jumbo")).click();
Thread.sleep(3000);
    //user can be click on program rules.
    driver.findElement(By.className("Link-sc-1khjl8b-0 kdCHb")).click();


    //  Verify successfully work
    String expectedText = "Program rules";
    Thread.sleep(4000);
    String actualText = driver.findElement(By.xpath("//*[@id=\"mainContainer\"]/div[2]/div[1]/div[2]/div/div/div[3]/div[1]/a")).getText();
    System.out.println("Actual Text : " + actualText);
    System.out.println("Expected Text :" + expectedText);
    Thread.sleep(3000);
    Assert.assertEquals(actualText, expectedText, "Program rules does not clickable");
    Thread.sleep(3000);
    driver.close();

}

}