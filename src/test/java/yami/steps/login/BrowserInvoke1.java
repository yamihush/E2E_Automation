package yami.steps.login;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserInvoke1 {

    @Test
    public void getWindowTittle() throws MalformedURLException {

        DesiredCapabilities cap=DesiredCapabilities.chrome();

        URL u = new URL("http://192.168.99.100:4444/wd/hub");

        RemoteWebDriver driver=new RemoteWebDriver(u,cap);

        driver.get("http://google.com");

        System.out.println(driver.getTitle());

        driver.quit();
    }

}
