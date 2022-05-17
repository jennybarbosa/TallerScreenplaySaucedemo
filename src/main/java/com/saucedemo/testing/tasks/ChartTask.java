package com.saucedemo.testing.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


import static com.saucedemo.testing.userinterfaces.SaucedemoPages.*;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;


public class ChartTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        //Actor intenta dar click en el boton ADD TO CART
        actor.attemptsTo(Click.on(BTN_ADD_CART));
         //Actor intenta dar click en el boton CHART
        actor.attemptsTo(Click.on(BTN_CHART));
        //Punto de control
        actor.should(GivenWhenThen.seeThat(the(SPN_YOUR_CART), isVisible()));
        //Actor intenta dar click en el boton CHECKOUT
        actor.attemptsTo(Click.on(BTN_CHECKOUT));




    }
    //Constructor
    public static ChartTask selectProductToChart(){
    return Tasks.instrumented(ChartTask.class);
    }

}
