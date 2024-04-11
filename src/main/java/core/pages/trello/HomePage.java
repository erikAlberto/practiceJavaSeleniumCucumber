package core.pages.trello;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage{
    @FindBy(className = "DD3DlImSMT6fgc")
    private WebElement title;

    @FindBy(css = "._2aV_KY1gTq1qWc.icon-add.icon-sm")
    private WebElement createTeamButton;

    @FindBy(css = "._2vrbr9OyhcQOwQ > ._1CLyNodCAa-vQi")
    private WebElement teamNameTextField;

    @FindBy(css = ".css-1yqjdp6")
    private WebElement teamTypeDropdown;

    @FindBy(css = ".css-1yqjdp6")
    private WebElement teamTypeSelect;

    @FindBy(css = ".X1P6DVryq8CYGC._21upOlzpUQJcdT.voB8NatlbuEme5")
    private WebElement continueButton;

    @FindBy(css = "._1rhhEuk7pUqNV_ span[role='img']")
    private WebElement exitButton;

    @FindBy(css = "//div[@id='layer-manager-overlay']/div[@role='dialog']/div[@class='_1rhhEuk7pUqNV_']//a[@href='/tttt198']")
    private WebElement iwilldolaterLink;

    @FindBy(css = ".home-left-sidebar-container ._1T7jXM3PAP_MoF:nth-child(1) > .pgEbaAFZBA0N5R:nth-child(2) > ._1hc34_9rc6xcjf:nth-of-type(1) ._3qwe2tMMFonNvf")
    private WebElement nameTeamButton;

    @FindBy(css = "li:nth-of-type(1) > ._1T7jXM3PAP_MoF > li:nth-of-type(4) > .IAUH08xqIilxIq.NW2sHAzvMGz-9L._1hc34_9rc6xcjf._2kYQrj8XNz8DaV._3Yj9q2I4BGFx4r > ._2P-NazJFBDpMac._3qwe2tMMFonNvf")
    private WebElement memberLink;

//    @FindBy(css = ".autocomplete-input")
//    private WebElement addTeamMemberTextField;
//
//    @FindBy(css = ".autocomplete-btn.nch-button.nch-button--primary")
//    private WebElement inviteTeamButton;
//
//    @FindBy(css = "div:nth-of-type(1) .full-name")
//    private WebElement memberNameField;

    @FindBy(css = ".home-left-sidebar-container .pgEbaAFZBA0N5R:nth-child(2) .pgEbaAFZBA0N5R:nth-of-type(1) ._2P-NazJFBDpMac")
    private WebElement boardsLink;


    @FindBy(css = ".js-org-profile.tabbed-pane-nav-item-button")
    private WebElement boardsTab;

    @FindBy(xpath = "//span[.='Create new board']")
    private WebElement createNewBoardButton;

    @FindBy(xpath = "//div[@class='_1rhhEuk7pUqNV_']//input")
    private WebElement boardTitleTextField;

    @FindBy(css = "._21upOlzpUQJcdT.uj9Ovoj4USRUQz.voB8NatlbuEme5")
    private WebElement createBoardButton;

    @FindBy(css = ".board-header-btn.inline-rename-board.js-rename-board.mod-board-name > .board-header-btn-text.js-board-editing-target")
    private WebElement boardNameField;

    @FindBy(css = ".board-tile > .board-tile-details.is-badged")
    private WebElement selectBoardButton;

    @FindBy(css = "._24AWINHReYjNBf.aYXvcYtXemTcSj")
    private WebElement profileNameButton;

    @FindBy(css = "li:nth-of-type(8) > ._2FCfpANq784raH > .lcLi2SyiMFND91")
    private WebElement logOutButton;

    @FindBy(css = ".button-link.option.remove-button span:nth-of-type(3)")
    private WebElement removeMemberLink;

    @FindBy(css = ".sub-name")
    private WebElement removeMemberPopUp;

    @FindBy(css = (".board-tile.mod-light-background > .board-tile-details.is-badged"))
    private WebElement boardButton;

    /**
     * get text of the element
     * @return text title
     */
    public String getTitle(){
        return title.getText();
    }

    @Override
    public void getUrl(String url) {
        driver.get(url);
    }

//    public void createTeam (String name, String type) {
//        createTeamButton.click();
//        teamNameTextField.sendKeys(name);
//
//        teamTypeDropdown.click();
//        //teamTypeSelect.click();
////        Select select = new Select(driver.findElement(By.cssSelector(".css-1yqjdp6")));
////        select.selectByValue(type);
//        continueButton.click();
//    }

    public void selectNameTeam(String nameLink) {
        if (nameLink.equalsIgnoreCase("Members")) {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            wait.until(ExpectedConditions.visibilityOf(nameTeamButton));
            nameTeamButton.click();
            memberLink.click();
        }else if (nameLink.equalsIgnoreCase("Boards")) {
            nameTeamButton.click();
            boardsLink.click();
        }
    }

//    public void setTeamMember (String email) {
//        WebDriverWait wait = new WebDriverWait(driver,30);
//        wait.until(ExpectedConditions.visibilityOf(addTeamMemberTextField));
//        addTeamMemberTextField.sendKeys(email);
//    }
    public void clickButton (String nameButton) {
        if (nameButton.equalsIgnoreCase("Create new board")) {
            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(40));
            wait.until(ExpectedConditions.visibilityOf(createNewBoardButton));
            createNewBoardButton.click();
        }else if (nameButton.equalsIgnoreCase("Invite to team")) {
//            WebDriverWait wait = new WebDriverWait(driver,30);
//            wait.until(ExpectedConditions.visibilityOf(inviteTeamButton));
//            inviteTeamButton.click();
        }else if (nameButton.equalsIgnoreCase("Create Board")) {
            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(40));
            wait.until(ExpectedConditions.visibilityOf(createBoardButton));
            createBoardButton.click();
        } else if (nameButton.equalsIgnoreCase("Add list")) {
//            WebDriverWait wait = new WebDriverWait(driver,30);
//            wait.until(ExpectedConditions.visibilityOf(addListButton));
//            addListButton.click();
        }
    }

    public String verifyName (String page) {
        String pageName = null;
        if (page.equalsIgnoreCase("Member")) {
//            WebDriverWait wait = new WebDriverWait(driver,40);
//            wait.until(ExpectedConditions.visibilityOf(memberNameField));
//            pageName = memberNameField.getText();
        } else if (page.equalsIgnoreCase("Board")) {
            pageName = boardNameField.getText();
        } else if (page.equalsIgnoreCase("List")) {
            //pageName = nameCardLabel.getText();
        }
        return pageName;
    }

    public void fillTitleBoard (String title) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(createBoardButton));
        boardTitleTextField.sendKeys(title);
    }

    public void clickOnBoard () {
        selectBoardButton.click();
    }

    public void removeMember () {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(removeMemberLink));
        removeMemberLink.click();
        wait.until(ExpectedConditions.visibilityOf(removeMemberPopUp));
        removeMemberPopUp.click();
    }

    public void openBoard () {
        boardButton.click();
    }

    public void openBoardPage () {
        driver.get("https://trello.com/auto1103/home");
        selectBoardButton.click();
    }

    public void openHomePage () {
        driver.get("https://trello.com/auto1103/home");
    }

    public void createBoard (String name) {
        openHomePage();
        createNewBoardButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(createBoardButton));
        boardTitleTextField.sendKeys(name);
        wait.until(ExpectedConditions.visibilityOf(createBoardButton));
        createBoardButton.click();
    }
//    public void memberPage () {
//        driver.get("https://trello.com/auto1103/members");
//    }
//
//    public void addMember (String memberName) {
//        setTeamMember(memberName);
//        inviteTeamButton.click();
//    }
}
