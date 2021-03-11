package co.com.example.ui;

import net.serenitybdd.screenplay.targets.Target;

public class DetailProductPage {

    public static final Target BTN_BUY_NOW = Target.the("button buy now").locatedBy("//button[contains(string(),'Comprar Ahora')]");
    public static final Target BTN_ADD_TO_CART = Target.the("button add to cart").locatedBy("//div[contains(@class,'productSummaryBuyButtonProductDetail')]//button[contains(string(),'Agregar')]");


}
