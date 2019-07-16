package yami.pages.repos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

    public WebDriver driver;


    @FindBy(xpath = "//*[@id=\"buy-now-button\"]")
    public WebElement buyNowBtn;

    @FindBy(xpath = "//*[@id=\"add-to-cart-button\"]")
    public WebElement addToCartBtn;

    public ProductPage(WebDriver driver){
        this.driver = driver;

        PageFactory.initElements(driver,this);
    }

}
