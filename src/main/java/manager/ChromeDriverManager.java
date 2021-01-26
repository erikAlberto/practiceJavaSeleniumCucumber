package manager;

import java.io.File;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class ChromeDriverManager extends DriverManager{

    ChromeDriverService chromeService;
    @Override
    void startService() {

        if (chromeService == null){
            chromeService = new ChromeDriverService.Builder()
                    .usingDriverExecutable(new File(System.getProperty("user.dir") + "\\drivers\\chromedriver.exe"))
                    .usingAnyFreePort()
                    .build();
        }
    }

    @Override
    void stopService() {
        if (chromeService != null && chromeService.isRunning()){
            chromeService.stop();
        }
    }

    @Override
    void createDriver() {
        driver = new ChromeDriver(chromeService);
    }
}
