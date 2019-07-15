package yami.pages.actions;

import org.openqa.selenium.WebDriver;
import yami.pages.repos.LoginPage;

public class LoginPageAction  extends LoginPage{

    public LoginPageAction(WebDriver driver) {
        super(driver);
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
