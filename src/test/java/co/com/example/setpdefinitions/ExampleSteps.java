package co.com.example.setpdefinitions;

import co.com.example.navigation.OpenBrowser;
import co.com.example.tasks.AddItems;
import co.com.example.tasks.GoTo;
import co.com.example.tasks.SearchProduct;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static co.com.example.ui.CartPage.ITEM_CART;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class ExampleSteps {


    @Given("^que el usuario (.*) accede hasta la página principal$")
    public void accessToApp(String name) {
        theActorCalled(name)
                .wasAbleTo(
                        OpenBrowser.inPage()
                );

    }

    @When("^el agrega item (.*) al carrito$")
    public void addItems(String item) {
        theActorInTheSpotlight()
                .wasAbleTo(
                        SearchProduct.withName(item),
                        AddItems.toCart(item)
                );
    }

    @Then("^el puede realizar la compra de los artículos$")
    public void payItems() {
        theActorInTheSpotlight().wasAbleTo(GoTo.cart());
        theActorInTheSpotlight()
                .should(
                        seeThat(the(ITEM_CART), isVisible())
                );
    }

}
