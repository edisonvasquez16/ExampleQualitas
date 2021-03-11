package co.com.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static co.com.example.ui.HomePage.INPUT_SEARCH;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchProduct implements Task {

    private String item;

    public SearchProduct(String item) {
        this.item = item;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(item).into(INPUT_SEARCH),
                Hit.the(Keys.ENTER).into(INPUT_SEARCH)
        );
    }

    public static SearchProduct withName(String item) {
        return instrumented(SearchProduct.class, item);
    }
}
