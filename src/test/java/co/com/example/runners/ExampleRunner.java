package co.com.example.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/example.feature",
        glue = {"co.com.example"},
        tags = "@Stable")
public class ExampleRunner {
}
