package co.com.example.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CartPage {

    public static final Target ITEM_CART =
            Target.the("item cart")
                    .locatedBy("//tr[@class='product-item']");

    public static final Target LBL_TOTAL_CART =
            Target.the("label total cart")
                    .locatedBy("//td[@class='monetary exito-checkout-monetary']");
    //.located(By.className("monetary exito-checkout-monetary"));

}
