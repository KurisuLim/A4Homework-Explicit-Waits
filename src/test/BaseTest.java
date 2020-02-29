package test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

public class BaseTest {
    public WebDriver driver;

    @BeforeSuite
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        System.setProperty("webdriver.chrome.silentOutput", "true");
        java.util.logging.Logger.getLogger("org.openga.selenium").setLevel(Level.OFF);
        driver = new ChromeDriver();
//        driver.manage().window().fullscreen();

        //waits for page to load first
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @AfterSuite
    public void tearDown(){
        driver.quit();
    }
}
