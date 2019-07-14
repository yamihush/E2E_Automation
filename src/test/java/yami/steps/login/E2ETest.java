package yami.steps.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import yami.pages.repos.HomePage;
import yami.pages.repos.LoginPage;

import java.util.concurrent.TimeUnit;

public class E2ETest {

    WebDriver driver;

    HomePage objHome;
    LoginPage objLogin;


    @BeforeTest
    public void setup(){


        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        driver.get("https://www.amazon.in");

    }

    @Test
    public void loginScenario(){


        objHome = new HomePage(driver);

        Assert.assertEquals(objHome.getHomePageTitle(),"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");

        System.out.println(objHome.getHomePageTitle());

        objHome.clickSignIn();

        objLogin = new LoginPage(driver);

        objLogin.inputUserName("yamihushh@gmail.com");

        objLogin.clickCountinueBtn();

        objLogin.inputPassword("Logout@123");

        objLogin.clickSignInSubmitBtn();

        Assert.assertEquals("Hello, Muthukumar" , objHome.getLoginUserText());

        System.out.println(objHome.getLoginUserText());



    }


    @AfterTest
    public void tearDown(){

        driver.quit();
    }

}
