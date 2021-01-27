package trello.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.WebDriver;
import selenium.WebDriverManager;
import org.openqa.selenium.By;
import org.junit.Assert;

public class TestSteps {
    public WebDriver driver;

    @Given("^user is  on homepage$")
    public void userIsOnHomepage() throws Throwable {
//        System.setProperty("webdriver.gecko.driver","D:\\automation2\\drivers\\geckodriver.exe");
//        driver = new FirefoxDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
        //webDriver.get("http://automationpractice.com/index.php");
        //driver = DriverFactory.getDriver();
        //webDriver.get("https://trello.com/login");

    }

    @When("^user navigates to Login Page$")
    public void userNavigatesToLoginPage() {
//        driver.findElement(By.linkText("Sign in")).click();
    }

    @And("^user enters username and Password$")
    public void userEntersUsernameAndPassword() {
//        driver.findElement(By.id("email")).sendKeys("blog.cucumber@gmail.com");
//        driver.findElement(By.id("passwd")).sendKeys("Cucumber@blog");
//        driver.findElement(By.id("SubmitLogin")).click();
    }

    @Then("^success message is displayed$")
    public void successMessageIsDisplayed() {
//        String exp_message = "Welcome to your account. Here you can manage all of your personal information and orders.";
//        String actual = driver.findElement(By.cssSelector(".info-account")).getText();
//        Assert.assertEquals(exp_message, actual);
        //webDriver.quit();
    }
}
