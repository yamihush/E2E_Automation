package yami.pages.repos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchItemsListPage {

    public WebDriver driver;

    @FindBy(xpath = "//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[1]")
    public WebElement searchResultsPane;

    @FindBy(xpath = "//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[1]/div")
    public
    List<WebElement> searchAllElements;

    @FindBy(xpath = "/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a")
    public WebElement listContainer;

    public SearchItemsListPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
