package co.com.example.setpdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import co.com.example.navigation.OpenBrowser;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class ExampleSteps {


    @Given("^que el usuario (.*) accede hasta la página principal$")
    public void accessToApp(String name) {
        theActorCalled(name)
                .wasAbleTo(
                    OpenBrowser.inPage()
                );

    }

    @When("^el agrega items al carrito$")
    public void addItems() {

    }

    @Then("^el puede realizar la compra de los artículos$")
    public void payItems() {

    }

}
