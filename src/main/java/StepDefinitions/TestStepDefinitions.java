package StepDefinitions;

import Screens.GoogleHomeScreen;
import io.cucumber.java.en.Given;

public class TestStepDefinitions {
    @Given("I am on the google home page")
    public void i_am_on_the_google_home_page(){
        new GoogleHomeScreen().goToHomePage();
    }
}
