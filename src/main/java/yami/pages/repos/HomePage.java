package yami.pages.repos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    //@Findby
    //WebElement homePageLogo;

    WebDriver driver;

    @FindBy(xpath ="//*[@id=\"nav-link-accountList\"]")
            WebElement signIn;

    @FindBy(xpath = "//*[@id=\"nav-link-accountList\"]/span[1]")
            WebElement userNameTxt;

    @FindBy(xpath = "//*[@id=\"twotabsearchtextbox\"]")
            WebElement searchTxtBox;

    @FindBy(xpath = "//*[@id=\"nav-search\"]/form/div[2]/div")
            WebElement searchIcon;


    //By signIn = By.xpath("//*[@id=\"nav-link-accountList\"]");
    //By userNameTxt = By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]");



    public HomePage(WebDriver driver){


        this.driver = driver;

        //This initElements method will create all WebElements

        PageFactory.initElements(driver, this);

    }


    public void clickSignIn(){

            signIn.click();

    }
        //Get the title of Login Page

    public String getHomePageTitle(){

        return    driver.getTitle();

    }

    public String getLoginUserText(){

        return userNameTxt.getText();
    }

    public void searchProductItems(String searchitem){

        searchTxtBox.sendKeys(searchitem);
        searchIcon.click();

    }
}