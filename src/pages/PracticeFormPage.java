package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PracticeFormPage extends BasePage {

    //element
    @FindBy(className = "vc_message_box")
    public WebElement messageBox;

    @FindBy(id = "cookie_action_close_header")
    public WebElement cookieAccept;

    @FindBy(id = "buttonwithclass")
    public WebElement simpleBtn;

    @FindBy(css = "input[name='firstname']")
    public WebElement firstName;

    @FindBy(css = "input[id='lastname']")
    public WebElement lastName;

    public PracticeFormPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


    public void openTestingPage(){
        driver.get("https://www.toolsqa.com/automation-practice-form/");
        System.out.println("Navigating");
    }

}
