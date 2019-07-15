package yami.pages.actions;

import org.openqa.selenium.WebDriver;
import yami.pages.repos.HomePage;

public class HomePageAction extends HomePage {


    public HomePageAction(WebDriver driver) {
        super(driver);
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
