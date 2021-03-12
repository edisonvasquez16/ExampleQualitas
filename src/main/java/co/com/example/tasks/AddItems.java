package co.com.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.example.ui.DetailProductPage.BTN_ADD_TO_CART;
import static co.com.example.ui.ItemsResultsPage.LBL_ITEM;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddItems implements Task {

    private final String item;

    public AddItems(String item) {
        this.item = item;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //Scroll.to(LBL_ITEM.of(item)).andAlignToTop(),
                WaitUntil.the(LBL_ITEM.of(item), isVisible()).forNoMoreThan(5).seconds(),
                Click.on(LBL_ITEM.of(item)),
                Click.on(BTN_ADD_TO_CART)
        );
    }

    public static Performable toCart(String item) {
        return instrumented(AddItems.class, item);
    }
}
