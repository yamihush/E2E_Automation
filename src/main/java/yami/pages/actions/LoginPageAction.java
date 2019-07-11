package yami.pages.actions;

import yami.pages.repos.LoginPage;

public class LoginPageAction {

    LoginPage loginPage = new LoginPage();

    public void login(String username, String password){
        loginPage.inputUserName(username);
        loginPage.inputPassword(password);
    }

    public void login(String username, String password, boolean shouldRemember){
        login(username,password);


    }
}
