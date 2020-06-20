package test.first.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class FirstSeleniumTest {

    public WebDriver driver;

    @Before
    public void Setup(){
        System.setProperty("webdriver.chrome.driver", "chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void DevToIsOpenInTheBrowser (){
        String devToUrl = "https://dev.to/";
        driver.get(devToUrl);
        String currentUrl = driver.getCurrentUrl();
        assertThat(currentUrl).isEqualTo(devToUrl);
    }

    @After
    public void CleanUp (){}
}
