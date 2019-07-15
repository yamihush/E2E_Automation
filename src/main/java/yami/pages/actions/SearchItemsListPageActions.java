package yami.pages.actions;

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
}
