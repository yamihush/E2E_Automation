package yami.pages.repos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    //@Findby
    //WebElement homePageLogo;

    public WebDriver driver;

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


    //By signIn = By.xpath("//*[@id=\"nav-link-accountList\"]");
    //By userNameTxt = By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]");



    public HomePage(WebDriver driver){


        this.driver = driver;

        //This initElements method will create all WebElements

        PageFactory.initElements(driver, this);

    }


}