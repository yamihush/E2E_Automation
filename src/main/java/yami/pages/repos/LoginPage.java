package yami.pages.repos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {

   // @FinBy()
    //WebElement userName;

    WebDriver driver;

    By loginUsername = By.xpath("//*[@id=\"ap_email\"]");
    By loginCountinueBtn = By.xpath("//*[@id=\"continue\"]");
    By loginPassword = By.xpath("//*[@id=\"ap_password\"]");
    By signInSubmitBtn = By.xpath("//*[@id=\"signInSubmit\"]");



    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage() {

    }


    public void inputUserName(String userName){
        driver.findElement(loginUsername).sendKeys(userName);
    }


    public void clickCountinueBtn(){
        driver.findElement(loginCountinueBtn).click();
    }


    public void inputPassword(String password){

        driver.findElement(loginPassword).sendKeys(password);
    }

    public void clickSignInSubmitBtn(){
        driver.findElement(signInSubmitBtn).click();
    }

}
