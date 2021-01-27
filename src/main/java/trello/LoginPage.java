package trello;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(id = "user")
    private WebElement userNameTextBox;

    @FindBy(id = "password")
    private WebElement passwordTextBox;

    @FindBy(id = "login")
    private WebElement loginWithAtlassianButton;

    @FindBy(id = "login-submit")
    private WebElement loginButton;

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
    private void setPassword(final String password) {
        passwordTextBox.sendKeys(password);
    }

    /**
     * Clicks on login button.
     *
     * @return page.
     */
    private HomePage clickLoginWithAtlassianButton() {
        loginWithAtlassianButton.click();
        return homePage;
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

    public HomePage login(String password) {
        setPassword(password);
        return clickLoginButton();
    }

    public HomePage loginWithAtlassian(String userName) {
        setUsername(userName);
        return clickLoginWithAtlassianButton();
    }
}
