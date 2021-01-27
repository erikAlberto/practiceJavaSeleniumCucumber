package trello.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import trello.HomePage;
import trello.LoginPage;


import static org.junit.Assert.assertEquals;

public class LoginStepdefs {

    private LoginPage loginPage;
    private HomePage homePage;

    public LoginStepdefs() throws Exception {
        loginPage = new LoginPage();
    }

    @Given("^I navigate to Login page$")
    public void iNavigateToLoginPage() {
    }

//    @When("^I login as \"([^\"]*)\" with password \"([^\"]*)\"$")
//    public void iLoginAsWithPassword(String username, String password) throws Throwable {
//        homePage = loginPage.login(username,password);
//    }

    @When("^I login as \"([^\"]*)\"$")
    public void iLoginAs(String username) throws Throwable {
        homePage = loginPage.loginWithAtlassian(username);
    }

    @And("^I login with password \"([^\"]*)\"$")
    public void iLoginWithPassword(String password) throws Throwable {
        homePage = loginPage.login(password);
    }

    @Then("^I should login successfully \"([^\"]*)\"$")
    public void iShouldLoginSuccessfully(String title) throws Throwable {
        assertEquals(homePage.getTitle(),title);
    }

}
