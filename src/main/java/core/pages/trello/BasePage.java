package core.pages.trello;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import selenium.WebDriverManager;

public abstract class BasePage {

    public abstract void getUrl(String url);

    protected WebDriver driver;

    public BasePage () {
        this.driver = WebDriverManager.getInstance().getWebDriver();
        PageFactory.initElements(driver, this);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
}
