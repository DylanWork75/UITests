package StepDefinitions;

import Helpers.TestContext;
import Screens.GoogleHomeScreen;
import Screens.GoogleSearchResultsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestStepDefinitions {
    TestContext testcontext;
    GoogleHomeScreen googleHomeScreen;
    GoogleSearchResultsPage googleSearchResultsPage;
    public TestStepDefinitions(TestContext testcontext) throws Exception {
        googleHomeScreen = new GoogleHomeScreen(testcontext);
        googleSearchResultsPage = new GoogleSearchResultsPage(testcontext);
    }
    @Given("I am on the google home page")
    public void i_am_on_the_google_home_page() throws Exception{
        googleHomeScreen.goToHomePage();
    }

    @When("I search caesars {string} in the search bar")
    public void iSearchCaesarsInTheSearchBar(String searchTerm) {
        googleHomeScreen.search(searchTerm);
    }

    @Then("I click the {string} result")
    public void iClickTheResult(String resultTerm) throws Exception {
        googleSearchResultsPage.clickOnCaesarsSportsbookPage();
    }
}
