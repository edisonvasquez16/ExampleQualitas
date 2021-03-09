package co.com.example.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ItemsResults {

    public static final Target LBL_ITEM =
            Target.the("label item")
            .locatedBy("//span[contains(text(),'{0}')]");

}
