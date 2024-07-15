package com.demoblaze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddProductToCart implements Task {
    private final String productXPath;

    public AddProductToCart(String productXPath) {
        this.productXPath = productXPath;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(By.xpath(productXPath)),
                Click.on(By.xpath("//a[text()='Add to cart']")),
                Switch.toAlert().andAccept(), // Manejar la alerta después de agregar al carrito
                Click.on(By.xpath("//a[.//span[@class='sr-only']]")) // XPath del botón de inicio
        );
    }

    public static AddProductToCart withXPath(String productXPath) {
        return new AddProductToCart(productXPath);
    }
}
