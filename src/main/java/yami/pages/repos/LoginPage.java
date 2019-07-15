package yami.pages.repos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

   // @FinBy()
    //WebElement userName;

    WebDriver driver;


    @FindBy(xpath = "//*[@id=\"ap_email\"]")
            WebElement loginUsername;
        @FindBy(xpath = "//*[@id=\"continue\"]")
            WebElement loginCountinueBtn;
    @FindBy(xpath = "//*[@id=\"ap_password\"]")
            WebElement  loginPassword;
    @FindBy(xpath = "//*[@id=\"signInSubmit\"]")
            WebElement signInSubmitBtn;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public LoginPage() {
    }

    public void inputUserName(String userName){
        loginUsername.sendKeys(userName);
    }


    public void clickCountinueBtn(){
        loginCountinueBtn.click();
    }


    public void inputPassword(String password){
        loginPassword.sendKeys(password);
    }


    public void clickSignInSubmitBtn(){
        signInSubmitBtn.click();
    }




}
