package Helpers;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestContext {

    private boolean initialized = false;

    private WebDriver driver;

    @Before
    public void setUp() throws Exception {

        // initialize the driver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        initialized = true;

    }

    public WebDriver getDriver() throws Exception {
        if(!initialized){
            setUp();
        }
        return driver;
    }

    public void closeDriver(){
        driver.close();
    }
}