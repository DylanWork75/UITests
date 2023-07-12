package Screens;
import Helpers.TestContext;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleHomeScreen {
    WebDriver driver;
    final private By searchBar = By.className("gLFyf");
    public GoogleHomeScreen(TestContext testcontext) throws Exception {
        driver = testcontext.getDriver();
    }

    public void goToHomePage() throws Exception{
        driver.get("https://www.google.com");
    }
    public void search(String searchTerm){
        driver.findElement(searchBar).sendKeys(searchTerm);
        driver.findElement(searchBar).sendKeys(Keys.ENTER);
    }

}
