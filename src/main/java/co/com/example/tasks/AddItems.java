package co.com.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddItems implements Task {

    private final String item;

    public AddItems(String item){
        this.item = item;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(item).into(),
                Hit.the(Keys.ENTER).into(),
                Click.on()
        );
    }

    public static Performable toCart(String item) {
        return instrumented(AddItems.class, item);
    }
}
