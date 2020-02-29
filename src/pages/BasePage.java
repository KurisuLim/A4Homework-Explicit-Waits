package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public WebDriver driver;
    WebDriverWait wait;
    final String BASE_URL = "https://www.toolsqa.com/";

    public BasePage (WebDriver driver){
        this.driver = driver;
        wait  = new WebDriverWait(driver, 15);
    }

    public void navigateTo(String path){
        driver.get(BASE_URL + path);
    }

    //Refactor solution
    public void waitForVisibility(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForClick(WebElement element){
        waitForVisibility(element);
        driver.findElement(By.cssSelector(String.valueOf(element))).click();
    }

}
