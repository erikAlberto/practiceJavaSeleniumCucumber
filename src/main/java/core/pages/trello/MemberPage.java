package core.pages.trello;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MemberPage extends BasePage{

    @FindBy(css = ".autocomplete-input")
    private WebElement addTeamMemberTextField;

    @FindBy(css = ".autocomplete-btn.nch-button.nch-button--primary")
    private WebElement inviteTeamButton;

    @FindBy(css = "div:nth-of-type(1) .full-name")
    private WebElement memberNameField;

    public void setTeamMember (String email) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(addTeamMemberTextField));
        addTeamMemberTextField.sendKeys(email);
    }

    public void memberPage () {
        driver.get("https://trello.com/auto1103/members");
    }

    public void addMember (String memberName) {
        setTeamMember(memberName);
        inviteTeamButton.click();
    }

    @Override
    public void getUrl(String url) {

    }
}
