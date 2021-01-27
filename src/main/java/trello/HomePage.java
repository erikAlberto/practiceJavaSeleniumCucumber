package trello;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    @FindBy(className = "_3qwe2tMMFonNvf")
    private WebElement title;


    /**
     * get text of the element
     * @return text title
     */
    public String getTitle(){
        return title.getText();
    }
}
