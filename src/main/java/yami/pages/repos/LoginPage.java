package yami.pages.repos;

public class LoginPage {

   // @FinBy()
    //WebElement userName;

    public String inputUserName(String userName){
       //return userName.sendKeys(userName);
        return "username";
    }

    //@FindBy()
    //WebElement password;
    public String inputPassword(String password){
        return "password";
    }


}
