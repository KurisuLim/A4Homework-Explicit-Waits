package pages;

import org.openqa.selenium.WebDriver;

public class BasePage {
    public WebDriver driver;
    final String BASE_URL = "https://www.toolsqa.com/";

    public BasePage (WebDriver driver){
        this.driver = driver;
    }

    public void navigateTo(String path){
        driver.get(BASE_URL + path);
    }

}
