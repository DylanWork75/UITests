package Screens;

import Helpers.TestContext;
import Helpers.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchResultsPage {
    WebDriver driver;
    By caesarsLink = By.xpath( "//*[contains(text(), 'Welcome to Caesars Sportsbook')]");
    public GoogleSearchResultsPage(TestContext testcontext) throws Exception {
        driver = testcontext.getDriver();
    }

     public void clickOnCaesarsSportsbookPage() throws Exception {
        new WaitHelpers(driver).elementVisible(caesarsLink,20);
        driver.findElement(caesarsLink).click();
    }

}
