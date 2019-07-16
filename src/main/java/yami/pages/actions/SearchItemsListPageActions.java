package yami.pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import yami.pages.repos.SearchItemsListPage;

public class SearchItemsListPageActions extends SearchItemsListPage {


    public SearchItemsListPageActions(WebDriver driver) {
        super(driver);
    }


    public boolean getSerchResultsPanePresent(){

        return searchResultsPane.isDisplayed();
    }

    public int getSearchResultsCount(){

        return searchAllElements.size();
    }

    public void getSearchListItemsName(){


        System.out.println(searchAllElements.get(0).findElement(By.tagName("h2")).getText());
        searchAllElements.get(0).findElement(By.tagName("h2")).click();

    }
}
