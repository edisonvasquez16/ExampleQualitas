package co.com.example.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CartPage {

    public static final Target ITEM_CART =
            Target.the("item cart")
                    .locatedBy("//tr[@class='product-item']");

}
