package core.steps.trello;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import core.pages.trello.HomePage;
import core.pages.trello.LoginPage;


import static org.junit.Assert.assertEquals;

public class LoginStepdefs {

    private LoginPage loginPage;
    private HomePage homePage;

    public LoginStepdefs() throws Exception {
        loginPage = new LoginPage();
    }

    @Given("^User navigate to \"([^\"]*)\" Login page$")
    public void iNavigateToLoginPage(String url) throws Throwable {
        loginPage.getUrl(url);
    }

    @When("^User login as \"([^\"]*)\"$")
    public void iLoginAs(String username) throws Throwable {
        loginPage.loginWithAtlassian(username);
    }

    @And("^User login with password \"([^\"]*)\"$")
    public void iLoginWithPassword(String password) throws Throwable {
        homePage = loginPage.login(password);
    }

    @Then("^User should login successfully \"([^\"]*)\"$")
    public void iShouldLoginSuccessfully(String title) throws Throwable {
        assertEquals(homePage.getTitle(),title);
    }

    @Then("^I should not login successfully \"([^\"]*)\"$")
    public void iShouldNotLoginSuccessfully(String message) throws Throwable {
        assertEquals(loginPage.getError(), message);
    }

    @Given("^User navigate to \"([^\"]*)\"$")
    public void userNavigateTo(String url) throws Throwable {
        loginPage.getUrl(url);
    }

    @When("^User logs out on the page$")
    public void userLogsOutOnThePage() {
        loginPage.logOut();
    }

    @Then("^Message displayed Logout successfully$")
    public void messageDisplayedLogoutSuccessfully() {
    }
}
