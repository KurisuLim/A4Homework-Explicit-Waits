package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.PracticeFormPage;

public class PracticeFormTest extends BaseTest {
    public WebElement cookieAccept;

    @BeforeMethod
    public void beforeTest(){
        PracticeFormPage page = new PracticeFormPage(driver);
        page.openTestingPage();
        cookieAccept = driver.findElement(By.id("cookie_action_close_header"));

        if(cookieAccept.isDisplayed()){
            cookieAccept.click();
        }
    }
    /*
        A4 – Homework – Refactor your tests using Explicit waits
        JAVA AUTOMATION A4  A4 – Homework – Refactor your tests using Explicit waits

        1. In your tests. Where you used “driver.findElement” change it to the explicit waits.
    */
    @Test
    public void explicitWaitSample(){
        PracticeFormPage page = new PracticeFormPage(driver);

        //Solution
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(page.messageBox));

        System.out.println("Explicit Wait Test Success!");
    }

}
