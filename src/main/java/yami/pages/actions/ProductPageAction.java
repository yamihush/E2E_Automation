package yami.pages.actions;

import org.openqa.selenium.WebDriver;
import yami.pages.repos.ProductPage;
import yami.utills.DriverClass;

public class ProductPageAction extends ProductPage {


    public ProductPageAction(WebDriver driver) {
        super(driver);
    }

    DriverClass objdc = new DriverClass(driver);

    public void clickBuyNowBtn(){

        objdc.clickWebElement(buyNowBtn);

    }

    public void clickAddtoCartBtn(){

        objdc.clickWebElement(addToCartBtn);

    }
}
