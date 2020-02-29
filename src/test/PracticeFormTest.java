package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.PracticeFormPage;

import java.util.List;

public class PracticeFormTest extends BaseTest {

    @BeforeMethod
    public void beforeTest(){
        PracticeFormPage page = new PracticeFormPage(driver);
        page.openTestingPage();

        if(page.cookieAccept.isDisplayed()){
            page.cookieAccept.click();
        }
    }

    @Test
    public void explicitWaitSample(){
        PracticeFormPage page = new PracticeFormPage(driver);
        BasePage base = new BasePage(driver);
        base.waitForVisibility(page.messageBox);
        System.out.println("Explicit Wait Test Success!");
    }
    /*
        A4 – Homework-Implements one of the advanced methods in your tests
        JAVA AUTOMATION A4  A4 – Homework-Implements one of the advanced methods in your tests
        1.Implements one of the advanced methods in your tests
        implement one of the advanced methods to your tests (Scrolling, JS execution, Drag and drop and so on)
    */
    @Test
    public void hover(){
        Actions action = new Actions(driver);
        PracticeFormPage page = new PracticeFormPage(driver);
        Action mouseOver = action.moveToElement(page.simpleBtn).build();
        mouseOver.perform();
        System.out.println("Mouse Over Test Success!");
    }

    @Test
    public void multiActions(){
        Actions action = new Actions(driver);
        PracticeFormPage page = new PracticeFormPage(driver);
        Action multiActions = (Action) action
            .moveToElement(page.firstName)
                .click()
                .sendKeys(page.firstName, "Chris")
                .moveToElement(page.lastName)
                .sendKeys(page.lastName,"Lim")
                .build();
        multiActions.perform();
        System.out.println("Multi Action Test Success!");
    }

    @Test
    public void selectCheckbox(){
        Actions action = new Actions(driver);
        List<WebElement> automationTool = (List<WebElement>) driver.findElements(By.cssSelector("input[name='tool']"));
        action.moveToElement(automationTool.get(1));
        int toolSize = automationTool.size();
        for(int i = 0; i < toolSize; i++){
            String toolValue = automationTool.get(i).getAttribute("value");
            if(toolValue.equalsIgnoreCase("Selenium IDE")){
                automationTool.get(i).click();
                System.out.println("Select Checkbox Test Success!");
            }
        }
    }

    @Test
    public void scrolling(){
        //JavascriptException js = (JavascriptException) driver;
        //This code does'nt work anymore in Selenium 3 jar file
        //js.executeScript("window.scrollTo(0, 600)");

        System.out.println("Scrolling Test Success!");
    }

}
