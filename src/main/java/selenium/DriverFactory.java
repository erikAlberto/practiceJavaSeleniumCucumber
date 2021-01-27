package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class DriverFactory {

    private static final String CHROME = "chrome";
    private static final String FIREFOX = "firefox";
    private static final String OPERA = "opera";

    public static WebDriver driver;

    public static WebDriver getDriver (){
        if (driver == null) {
            driver = createDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            //driver.manage().window().fullscreen();
        }
        return driver;
    }

    public static WebDriver createDriver() {
        //String browser = AutoProperties.getInstance().getProperty("browser.name");
        String browser = DriverType.OPERA.name();
        if (browser.equalsIgnoreCase(CHROME)) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }else if (browser.equalsIgnoreCase(FIREFOX)) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }else if (browser.equalsIgnoreCase(OPERA)) {
            WebDriverManager.operadriver().setup();
            driver = new OperaDriver();
        }else {
            System.out.println("browser not found");
        }
        return driver;
    }
}
