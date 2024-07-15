package com.demoblaze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class PlaceOrder implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on("//*[@id=\"page-wrapper\"]/div/div[2]/button")
                //  //button[@data-toggle='modal']
        );
    }

    public static PlaceOrder now() {
        return new PlaceOrder();
    }
}
