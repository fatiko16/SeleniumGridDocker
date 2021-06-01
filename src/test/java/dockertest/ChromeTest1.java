package dockertest;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class ChromeTest1 {

    @Test
    public void test1() throws MalformedURLException {
        DesiredCapabilities dc = DesiredCapabilities.chrome();
        URL url = new URL("http://18.212.73.27:4444/wd/hub");

        RemoteWebDriver driver = new RemoteWebDriver(url,dc);
        driver.get("https://www.amazon.com");
        System.out.println("Title of the page is " + driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.quit();
    }
}
