package yami.pages.repos;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeNavBarPage {

    //@Findby
    //WebElement homePageLogo;

    public WebDriver driver;

    @FindBy(xpath = "//*[@id=\"nav-cart-count\"]")
    public
    WebElement cartCount;

    @FindBy(xpath ="//*[@id=\"nav-link-accountList\"]")
    public
    WebElement signIn;

    @FindBy(xpath = "//*[@id=\"nav-link-accountList\"]/span[1]")
    public
    WebElement userNameTxt;

    @FindBy(xpath = "//*[@id=\"twotabsearchtextbox\"]")
    public
    WebElement searchTxtBox;

    @FindBy(xpath = "//*[@id=\"nav-search\"]/form/div[2]/div")
    public
    WebElement searchIcon;

    @FindBy(xpath = "//*[@id=\"nav-cart\"]")
    public WebElement cartIcon;

    public HomeNavBarPage(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }


}