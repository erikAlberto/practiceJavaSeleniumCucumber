package base;

import manager.DriverManager;
import manager.DriverManagerFactory;
import manager.DriverType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseUtil {

    public WebDriver driver;
    DriverManager driverManager;

    @BeforeMethod
    public void setUp(){
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();
    }

    @AfterMethod
    public void tearDown() {

    }
}
