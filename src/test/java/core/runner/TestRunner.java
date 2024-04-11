package core.runner;

import selenium.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json", "junit:target/cucumber.xml"},
        features = "src/test/resources/features/trello",
        glue= {"core/steps"},
        tags= "@login"
)
public class TestRunner {

    @BeforeClass
    public static void setUp() {
        WebDriverManager.getInstance().initialize();
    }

    @AfterClass
    public static void tearDown() {
        WebDriverManager.getInstance().quitDriver();
    }
}
