package yami.pages.repos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ShoppingCartPage  {

    public WebDriver driver;

    @FindBy(xpath = "//*[@id=\"activeCartViewForm\"]/div[2]/div")
    public List<WebElement> cartListPane;



    public ShoppingCartPage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver,this);

    }



    //*[@id="sc-item-Cfe00a6ad-a064-4ede-b608-5ff786e130a6"]/div[4]/div/div[1]/div/div/div[2]/div/span[1]/span/input
}
