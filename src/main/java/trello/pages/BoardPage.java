package trello.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BoardPage extends BasePage {
    @FindBy(css = ".placeholder")
    private WebElement addCardListButton;

    @FindBy(css = "input[name='name']")
    private WebElement cardNameTextField;

    @FindBy(css = ".js-save-edit.mod-list-add-button.nch-button.nch-button--primary")
    private WebElement addListButton;

    @FindBy(css = ".js-editing-target.list-header-target")
    private WebElement nameCardLabel;

    // elements of the board page
    @FindBy(css = "li:nth-of-type(5) > .board-menu-navigation-item-link")
    private WebElement moreLink;

    @FindBy(css = ".board-menu-navigation-item-link.js-close-board")
    private WebElement closeBoardLink;

    @FindBy(css = ".full.js-confirm.nch-button.nch-button--danger")
    private WebElement closeBoardButton;

    //
    @FindBy(xpath = "//div[@id='content']//h1[.='auto2 is closed.']")
    private WebElement boardClosedLabel;

    @FindBy(css = ".js-delete.quiet")
    private WebElement deleteBoardLink;

    //
    @FindBy(css = ".full.js-confirm.nch-button.nch-button--danger")
    private WebElement deleteBoardButton;

    @FindBy(xpath = "//div[@id='content']//h1[.='Board not found.']")
    private WebElement boardDeletedLabel;

    public void fillCardName (String name) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(cardNameTextField));
        cardNameTextField.sendKeys(name);
    }

    public void createCard (String name) {
        addCardListButton.click();
        fillCardName(name);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(addListButton));
        addListButton.click();
    }

    public void closeBoard () {
        moreLink.click();
        closeBoardLink.click();
        closeBoardButton.click();
    }

    public void removeBoard () {
        moreLink.click();
        closeBoardLink.click();
        closeBoardButton.click();
        deleteBoardLink.click();
        deleteBoardButton.click();
    }

    @Override
    public void getUrl(String url) {

    }
}
