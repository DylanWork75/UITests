package Helpers;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\dclst\\Desktop\\UITests\\src\\main\\java\\Screens"
        ,glue={"C:\\Users\\dclst\\Desktop\\UITests\\src\\main\\java\\StepDefinitions"}
)

public class TestRunner {
}