package co.com.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.example.ui.HomePage.BTN_CART;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoTo implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_CART)
        );
    }

    public static GoTo cart() {
        return instrumented(GoTo.class);
    }

}
