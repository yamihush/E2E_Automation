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
import yami.pages.actions.HomePageAction;
import yami.pages.actions.LoginPageAction;
import yami.pages.actions.ProductPageAction;
import yami.pages.actions.SearchItemsListPageActions;
import yami.pages.repos.HomePage;
import yami.pages.repos.LoginPage;
import yami.pages.repos.ProductPage;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class E2ETest {

    WebDriver driver;

    HomePageAction objHome;
    LoginPageAction objLogin;
    SearchItemsListPageActions objsrch;
    ProductPageAction objproduct;

    @BeforeTest
    public void setup(){


        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        driver.get("https://www.amazon.in");

    }

    @Test(priority=1)
    public void loginScenario(){


        objHome = new HomePageAction(driver);


        Assert.assertEquals(objHome.getHomePageTitle(),"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");

        System.out.println(objHome.getHomePageTitle());

        objHome.clickSignIn();

        objLogin = new LoginPageAction(driver);

        objLogin.inputUserName("yamihushh@gmail.com");

        objLogin.clickCountinueBtn();

        objLogin.inputPassword("Logout@123");

        objLogin.clickSignInSubmitBtn();

        Assert.assertEquals("Hello, Muthukumar" , objHome.getLoginUserText());

        System.out.println(objHome.getLoginUserText());

        System.out.println(objHome.getHomePageTitle());

    }

    @Test(priority=2)
    public void addItemToCart() throws InterruptedException {

        //Pre requsites
        //     create a New User
        //     add deliver address
        //    add Payment details

        // ---  Add an single Item to cart and remove the item in the cart.
        //search the Item

        objsrch = new SearchItemsListPageActions(driver);

        objHome.searchProductItems("redmi note 6 pro");

        System.out.println(objHome.getHomePageTitle());
        Assert.assertEquals("Amazon.in: redmi note 6 pro",objHome.getHomePageTitle());

        Assert.assertTrue(objsrch.getSerchResultsPanePresent());

        System.out.println(objsrch.getSearchResultsCount());
        String parentWinHandle = driver.getWindowHandle();

        objsrch.getSearchListItemsName();
        Thread.sleep(5000);

        Set<String> winHandles = driver.getWindowHandles();
        // Loop through all handles for New Window opened

        for(String handle: winHandles) {
            if (!handle.equals(parentWinHandle)) {
                driver.switchTo().window(handle);
                Thread.sleep(1000);
                System.out.println("Title of the new window: " +
                        driver.getTitle());
            }

        }

        //Add product to cart form Product Page

        objproduct = new ProductPageAction(driver);
        objproduct.clickAddtoCartBtn();

        Thread.sleep(5000);

        System.out.println(objHome.getHomePageTitle());

        // Close the New window and go to parent Window and verify in Cart that added product is present


        driver.close();

        driver.switchTo().window(parentWinHandle);

        System.out.println(driver.getTitle());
        System.out.println(objHome.getHomePageTitle());


        //open the product page
        //select Buy Now option
        // Go to cart
        // select Delivery details
        // remove item form cart
        // ensure item removed form cart

    }

    @AfterTest
    public void tearDown(){

        driver.quit();
    }

}
