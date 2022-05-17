package com.saucedemo.testing.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.saucedemo.testing.userinterfaces.SaucedemoPages.*;
public class VerifyLoginQuestion implements Question<String> {


    @Override
    public String answeredBy(Actor actor) {
        return SPN_PRINCIPAL_PAGE.resolveFor(actor).getTextValue();
    }

   public static Question<String> verifyLoginQuestion(){
       return actor -> SPN_PRINCIPAL_PAGE.resolveFor(actor).getTextValue();
   }


}
