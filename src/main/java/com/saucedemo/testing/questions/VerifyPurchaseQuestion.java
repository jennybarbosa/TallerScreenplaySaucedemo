package com.saucedemo.testing.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.saucedemo.testing.userinterfaces.SaucedemoPages.*;

public class VerifyPurchaseQuestion implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return LBL_ORDER_COMPLETE.resolveFor(actor).getTextValue();
    }

    public static Question<String> verifyPurchseQuestion(){
        return actor -> LBL_ORDER_COMPLETE.resolveFor(actor).getTextValue();
    }

}
