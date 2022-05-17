package com.saucedemo.testing.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenBrowserTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        //actor intenta abrir la url
        actor.attemptsTo(Open.url("https://www.saucedemo.com/"));
    }


    //Constructor
    public static OpenBrowserTask openBrowserTask(){
        return Tasks.instrumented(OpenBrowserTask.class);
    }
}
