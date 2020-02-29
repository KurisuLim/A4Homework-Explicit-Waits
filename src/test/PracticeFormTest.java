package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
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
        Homework-Refactor your tests using Explicit waits In your tests.
        JAVA AUTOMATION A4  Homework-Refactor your tests using Explicit waits In your tests.

        1.Refactor your tests using Explicit waits In your tests.
        Where you used “driver.findElement” change it to the explicit waits.
    */
    @Test
    public void explicitWaitSample(){
        /*
        * NOTE:
        * Before you comment there is a code duplication
        * If I declare the constructor outside the @Test
        * the test will fail and says "Test cannot be found".
        * I have no problem putting the constructor on Before All block
        * in Rspec and Protractor Angular. But here it is different,
        * please advice a solution
        * */
        //Refactored
        PracticeFormPage page = new PracticeFormPage(driver);
        BasePage base = new BasePage(driver);
        base.waitForVisibility(page.messageBox);
        System.out.println("Explicit Wait Test Success!");
    }

}
