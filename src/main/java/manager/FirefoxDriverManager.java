package manager;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriverService;

public class FirefoxDriverManager extends DriverManager{

    WebDriverManager firefoxService;
    @Override
    void startService() {

        firefoxService.firefoxdriver().setup();
    }

    @Override
    void stopService() {
        if (firefoxService != null){

        }
    }

    @Override
    void createDriver() {
        driver = new FirefoxDriver();
    }
}
