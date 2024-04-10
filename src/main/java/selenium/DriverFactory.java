package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    private static final String CHROME = "chrome";
    private static final String FIREFOX = "firefox";
    private static final String OPERA = "opera";

    public static WebDriver driver;

    public static WebDriver getDriver (){
        if (driver == null) {
            driver = createDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
        return driver;
    }

    public static WebDriver createDriver() {
        //String browser = AutoProperties.getInstance().getProperty("browser.name");
        String browser = DriverType.FIREFOX.name();
        if (browser.equalsIgnoreCase(CHROME)) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }else if (browser.equalsIgnoreCase(FIREFOX)) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }else {
            System.out.println("browser not found");
        }
        return driver;
    }
}
