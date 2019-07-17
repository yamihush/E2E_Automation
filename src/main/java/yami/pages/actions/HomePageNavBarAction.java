package yami.pages.actions;

import org.openqa.selenium.WebDriver;
import yami.pages.repos.HomeNavBarPage;
import yami.utills.DriverClass;

public class HomePageNavBarAction extends HomeNavBarPage {


    public HomePageNavBarAction(WebDriver driver) {
        super(driver);
    }

    DriverClass objDC = new DriverClass(driver);

    LoginPageAction objLP = new LoginPageAction(driver);

    public void signIn(String userName,String password){

        objDC.clickWebElement(signIn);
        objDC.fillTextBox(objLP.loginUsername,userName);
        objDC.clickWebElement(objLP.loginCountinueBtn);
        objDC.fillTextBox(objLP.loginPassword,password);
        objDC.clickWebElement(objLP.signInSubmitBtn);


    }

    public String getLoginUserText(){

        return objDC.getText(userNameTxt);
    }

    public void searchProductItems(String searchitem){

        objDC.fillTextBox(searchTxtBox,searchitem);
        objDC.clickWebElement(searchIcon);
    }

    public String getCartValue(){

        return objDC.getText(cartCount);
    }

    public void openCartPage(){

        objDC.clickWebElement(cartIcon);
    }
}
