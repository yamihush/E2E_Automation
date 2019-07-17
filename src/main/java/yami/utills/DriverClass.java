package yami.utills;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DriverClass {

    WebDriver driver;

    public DriverClass(WebDriver driver) {

        this.driver = driver;

    }

    public void clickWebElement(WebElement webElement){

        webElement.click();

    }

    public String getTitle(){

        return driver.getTitle();
    }

    public void fillTextBox(WebElement webElement,String value){

        webElement.sendKeys(value);

    }


    public String getText(WebElement webElement){

        return webElement.getText();
    }
}
