package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticeFormPage extends BasePage {

    //element
    @FindBy(className = "vc_message_box")
    public WebElement messageBox;

    public PracticeFormPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


    public void openTestingPage(){
        driver.get("https://www.toolsqa.com/automation-practice-form/");
        System.out.println("Navigating");
    }

}
