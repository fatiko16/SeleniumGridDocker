package dockertest;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class ChromeTest3 {

    @Test
    public void test3() throws MalformedURLException {
        DesiredCapabilities dc = DesiredCapabilities.chrome();
        URL url = new URL("http://localhost:4444/wd/hub");

        RemoteWebDriver driver = new RemoteWebDriver(url,dc);
        driver.get("https://www.netflix.com");
        System.out.println("Title of the page is " + driver.getTitle());

        driver.quit();
    }
}
