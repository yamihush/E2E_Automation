package yami.steps.login;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import yami.pages.actions.*;
import yami.utills.DriverClass;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class E2ETest {

    WebDriver driver;
    DriverClass objdc;
    HomePageNavBarAction objHome;
    LoginPageAction objLogin;
    SearchItemsListPageActions objsrch;
    ProductPageAction objproduct;
    ShoppingCartPageAction objshopcart;


    @BeforeTest
    public void setup(){


        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        driver.get("https://www.amazon.in");

    }

    @Test(priority=1)
    public void loginScenario(){


        objHome = new HomePageNavBarAction(driver);
        objdc = new DriverClass(driver);

        Assert.assertEquals(objdc.getTitle(),"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");

        System.out.println(objdc.getTitle());

        objHome.signIn("yamihushh@gmail.com","Logout@123");


        Assert.assertEquals("Hello, Muthukumar" , objHome.getLoginUserText());


        System.out.println(objHome.getLoginUserText());




        System.out.println("The Cart Count is : " + objHome.getCartValue());

        System.out.println(objdc.getTitle());

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

        System.out.println(objdc.getTitle());
        Assert.assertEquals("Amazon.in: redmi note 6 pro",objdc.getTitle());

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

        System.out.println("****Now in Child Window " +objdc.getTitle());

        // Close the New window and go to parent Window and verify in Cart that added product is present


        driver.close();

        driver.switchTo().window(parentWinHandle);


        //Refresh the Page

        driver.get(driver.getCurrentUrl());

        System.out.println("****Now in Parent Window " + driver.getTitle());

        // Validate cart value is increased

        System.out.println("The Cart Count is : " + objHome.getCartValue());

        System.out.println("****Now in Parent Window " + objdc.getTitle());

        // Go to Cart

        objHome.openCartPage();

        System.out.println("****Now in Parent Window " + objdc.getTitle());

        // Remove the Product that added to Cart
        objshopcart = new ShoppingCartPageAction(driver);

        System.out.println(objshopcart.getCountInShoppingList());

        objshopcart.deleteProductInshoppingCart();


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
