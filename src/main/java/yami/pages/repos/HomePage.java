package yami.pages.repos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    //@Findby
    //WebElement homePageLogo;

    WebDriver driver;

    By signIn = By.xpath("//*[@id=\"nav-link-accountList\"]");
    By userNameTxt = By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]");



    public HomePage(WebDriver driver){
        this.driver = driver;
    }


    public void clickSignIn(){

    driver.findElement(signIn).click();

    }
        //Get the title of Login Page

    public String getHomePageTitle(){

        return    driver.getTitle();

    }

    public String getLoginUserText(){

        return driver.findElement(userNameTxt).getText();
    }
}
