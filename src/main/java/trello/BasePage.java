package trello;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.WebDriverManager;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage () {
        this.driver = WebDriverManager.getInstance().getWebDriver();
        PageFactory.initElements(driver, this);

    }


}
