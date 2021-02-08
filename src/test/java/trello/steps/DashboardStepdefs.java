package trello.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import trello.pages.BoardPage;
import trello.pages.HomePage;
import trello.pages.MemberPage;


import static org.junit.Assert.assertEquals;

public class DashboardStepdefs {
    private HomePage homePage;
    private BoardPage boardPage;
    private MemberPage memberPage;

    public DashboardStepdefs() {
        homePage = new HomePage();
        boardPage = new BoardPage();
        memberPage = new MemberPage();
    }

    @Given("^I click on New Team button$")
    public void iClickOnNewTeamButton() {
        //dashboardPage.createTeam("hola", "other");
    }

    @When("^I populate the \"([^\"]*)\" and \"([^\"]*)\" with the following information:$")
    public void iPopulateTheAndWithTheFollowingInformation(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the \"([^\"]*)\" should be displayed in Team Details page$")
    public void theShouldBeDisplayedInTeamDetailsPage(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^The user navigate to \"([^\"]*)\" tab$")
    public void iClickOnTab(String nameLink) throws Throwable {
        homePage.selectNameTeam(nameLink);
    }

    @When("^The user fill \"([^\"]*)\" on Team members field$")
    public void iFillOnTeamMembersField(String member) throws Throwable {
        memberPage.setTeamMember(member);
    }

    @When("^The user click on \"([^\"]*)\" button$")
    public void iClickOnButton(String nameButton) throws Throwable {
        homePage.clickButton(nameButton);
    }

    @And("^User fill \"([^\"]*)\" board title field$")
    public void iFillBoardTitleField(String boardTitle) throws Throwable {
        homePage.fillTitleBoard(boardTitle);
    }

    @Then("^User should see \"([^\"]*)\" on \"([^\"]*)\" page$")
    public void iShouldSeeBoardNameOnBoardPage(String name, String page) {
        assertEquals(homePage.verifyName(page),name);
    }

    @Given("^I click on \"([^\"]*)\" board$")
    public void iClickOnBoard(String arg0) throws Throwable {
        homePage.clickOnBoard();
    }

    @When("^User fill \"([^\"]*)\" on title card name$")
    public void iFillOnTitleCardName(String name) throws Throwable {
        boardPage.fillCardName(name);
    }

    @When("^The user remove team member$")
    public void iRemoveTeamMember() {
        homePage.removeMember();
    }

    @Given("^The user open the board$")
    public void theUserOpenTheBoard() {
        homePage.getUrl("https://trello.com/auto1103/home");
        homePage.openBoard();
    }

    @When("^The user close the board$")
    public void theUserCloseTheBoard() {
        boardPage.closeBoard();
    }

    @And("^The user delete the board$")
    public void theUserDeleteTheBoard() {
        boardPage.removeBoard();
    }

    @Then("^The user see the message \"([^\"]*)\"$")
    public void theUserVerifyThatDeleted(String name) throws Throwable{
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^The user verify that was deleted$")
    public void theUserVerifyThatWasDeleted() throws Throwable{
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^The user is on the board page$")
    public void theUserIsOnTheBoard() {
        homePage.openBoardPage();
    }

    @When("^The user create a new card \"([^\"]*)\"$")
    public void theUserCreateANewCard(String name) throws Throwable {
        boardPage.createCard(name);
    }

    @Then("^The user see \"([^\"]*)\" on \"([^\"]*)\" page$")
    public void theUserSeeCardSNameOnPage(String name, String page) throws Throwable {
        assertEquals(homePage.verifyName(page),name);
    }

    @Given("^The user is on home page$")
    public void theUserIsOnHomePage() {
        homePage.openHomePage();
    }

    @When("^The user creates the \"([^\"]*)\" board$")
    public void theUserCreateABoard(String name) {
        homePage.createBoard(name);
    }

    @Given("^The user is on member page$")
    public void theUserIsOnMemberPage() {
        memberPage.memberPage();
    }

    @When("^The user add to \"([^\"]*)\"new team member$")
    public void theUserAddToNewTeamMember(String name) throws Throwable {
        memberPage.addMember(name);
    }

    @Then("^The user sees the (.*) name$")
    public void theUserSeesTheBoardSName(String namePage) {

    }
}
