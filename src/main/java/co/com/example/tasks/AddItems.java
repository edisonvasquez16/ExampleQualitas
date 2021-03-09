package co.com.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.Keys;

import static co.com.example.ui.HomePage.INPUT_SEARCH;
import static co.com.example.ui.ItemsResults.LBL_ITEM;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddItems implements Task {

    private final String item;

    public AddItems(String item) {
        this.item = item;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(item).into(INPUT_SEARCH),
                Hit.the(Keys.ENTER).into(INPUT_SEARCH),
                Scroll.to(LBL_ITEM.of(item)),
                Click.on(LBL_ITEM.of(item))
        );
    }

    public static Performable toCart(String item) {
        return instrumented(AddItems.class, item);
    }
}
