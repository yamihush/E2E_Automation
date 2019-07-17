package yami.pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import yami.pages.repos.ShoppingCartPage;

public class ShoppingCartPageAction extends ShoppingCartPage {


    public ShoppingCartPageAction(WebDriver driver) {
        super(driver);
    }

    public int getCountInShoppingList(){

        return cartListPane.size();
    }

    public void deleteProductInshoppingCart(){

        System.out.println(cartListPane.get(0).findElement(By.xpath("//div[1]/div[4]/div/div[1]/div/div/div[2]/ul/li[1]/span/a")).getText());


    }

}
