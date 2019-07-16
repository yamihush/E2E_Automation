package yami.pages.actions;

import org.openqa.selenium.WebDriver;
import yami.pages.repos.ProductPage;

public class ProductPageAction extends ProductPage {


    public ProductPageAction(WebDriver driver) {
        super(driver);
    }

    public void clickBuyNowBtn(){

        buyNowBtn.click();

    }

    public void clickAddtoCartBtn(){

        addToCartBtn.click();

    }
}
