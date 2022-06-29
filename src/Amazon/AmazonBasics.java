package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonBasics {


    static WebDriver driver;
    static String actualText;

    /**
     * Test Case: Amazon basics should work properly.
     */
    @BeforeTest
    public static void SetUp() {
        String driverPath = "../Automation2022/BrowserDriver/Windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);


//        To open browse
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
    }


    /**
     * Scenario 1: Amazon basics functionality should be clickable.
     */


    @Test
    public static void clickable() {

//user is click on amazon basics.
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[3]")).click();


    }

    /**
     * Scenario 2 :in amazon basics, smart home should be clickable.
     */

    @Test
    public static void clickable1() {

//user is click on amazon basics.
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[3]")).click();


        //user can be click on smart home.
        driver.findElement(By.className("a-m-us a-aui_72554-c a-aui_accordion_a11y_role_354025-c a-aui_killswitch_csa_logger_372963-c a-aui_launch_2021_ally_fixes_392482-c a-aui_pci_risk_banner_210084-c a-aui_preload_261698-c a-aui_rel_noreferrer_noopener_309527-c a-aui_template_weblab_cache_333406-c a-aui_tnr_v2_180836-c a-meter-animate")).click();


    }



}
