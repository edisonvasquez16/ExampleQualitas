package co.com.example.ui;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static final Target INPUT_SEARCH =
            Target.the("input search item")
            .locatedBy("//input[@id and @type='text' and @value]");

}
