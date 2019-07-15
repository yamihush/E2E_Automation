package yami.pages.repos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

   // @FinBy()
    //WebElement userName;

   public WebDriver driver;


    @FindBy(xpath = "//*[@id=\"ap_email\"]")
          public   WebElement loginUsername;
        @FindBy(xpath = "//*[@id=\"continue\"]")
          public  WebElement loginCountinueBtn;
    @FindBy(xpath = "//*[@id=\"ap_password\"]")
           public WebElement  loginPassword;
    @FindBy(xpath = "//*[@id=\"signInSubmit\"]")
           public WebElement signInSubmitBtn;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public LoginPage() {
    }


}
