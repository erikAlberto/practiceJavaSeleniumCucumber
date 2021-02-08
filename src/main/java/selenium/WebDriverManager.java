package selenium;

import org.openqa.selenium.WebDriver;

public class WebDriverManager {
    public WebDriver webDriver;

    private static WebDriverManager instance = null;

    /**
     * Gets the instance of the Web Driver.
     * @return WebDriverManager.
     */
    public static WebDriverManager getInstance() {
        if (instance == null || instance.webDriver == null) {
            instance = new WebDriverManager();
        }
        return instance;
    }

    /**
     * Initializes the settings for the driver.
     */
    public void initialize() {
        this.webDriver = DriverFactory.getDriver();
        this.webDriver.manage().window().maximize();
    }

    /**
     * Closes the browser instances.
     */
    public void quitDriver() {
        webDriver.quit();
    }

    /**
     * Gets the WebDriver.
     * @return WebDriver.
     */
    public WebDriver getWebDriver() {
        return webDriver;
    }

}
