package com.demoblaze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;

public class CompletePurchase implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("John Doe").into("//input[@id='name']"),
                Enter.theValue("United States").into("//input[@id='country']"),
                Enter.theValue("New York").into("//input[@id='city']"),
                Enter.theValue("1234567890123456").into("//input[@id='card']"),
                Enter.theValue("July").into("//input[@id='month']"),
                Enter.theValue("2024").into("//input[@id='year']"),
                Click.on("//button[text()='Purchase']")
        );
    }

    public static CompletePurchase form() {
        return new CompletePurchase();
    }
}
