package core.pages.trello;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BasePage{

    @FindBy(id = "user")
    private WebElement userNameTextBox;

    @FindBy(id = "password")
    private WebElement passwordTextBox;

    @FindBy(id = "login")
    private WebElement loginWithAtlassianButton;

    @FindBy(id = "login-submit")
    private WebElement loginButton;

    @FindBy(css = "#login-error > span")
    private WebElement error;

    @FindBy(xpath = "//div[@data-testid='header-member-menu-avatar']")
    private WebElement userIcon;

    @FindBy(xpath = "//button[@data-testid='account-menu-logout']")
    private WebElement logOutLink;

    @FindBy(xpath = "//button[@id='logout-submit']")
    private WebElement logOutButton;

    @FindBy(xpath = "//h1[.='Gracias por utilizar Trello.']")
    private WebElement messageLabel;

    private HomePage homePage = new HomePage();

    /**
     * Sets the user name.
     *
     * @param username - The user name.
     */
    private void setUsername(String username) {
        userNameTextBox.clear();
        userNameTextBox.sendKeys(username);
    }

    /**
     * Sets the user password.
     *
     * @param password - The user password.
     */
    private void setPassword(String password) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOf(passwordTextBox));
        passwordTextBox.sendKeys(password);
    }

    /**
     * Clicks on login button.
     *
     * @return page.
     */
    private void clickLoginWithAtlassianButton() {
        loginWithAtlassianButton.click();
    }

    /**
     * Clicks on login button.
     *
     * @return a home page.
     */
    private HomePage clickLoginButton() {
        loginButton.click();
        return homePage;
    }

    public void loginWithAtlassian(String userName) {
        setUsername(userName);
        clickLoginWithAtlassianButton();
    }

    public HomePage login(String password) {
        setPassword(password);
        return clickLoginButton();
    }

    public void getUrl (String url) {
        driver.get(url);
    }

    public String getError(){
        return error.getText();
    }

    public void logOut () {
        userIcon.click();
        logOutLink.click();
        logOutButton.click();
    }
}
