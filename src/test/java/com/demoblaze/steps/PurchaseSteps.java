package com.demoblaze.steps;

import com.demoblaze.tasks.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class PurchaseSteps {

    @Given("^The user is on the demoblaze home page$")
    public void theUserIsOnTheDemoblazeHomePage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("User").attemptsTo(NavigateTo.theDemoblazeHomePage());
    }

    @When("^The user adds two products to the cart$")
    public void theUserAddsTwoProductsToTheCart() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AddProductToCart.withXPath("//*[@id='tbodyid']/div[1]/div/div/h4/a"), // Samsung galaxy s6
                AddProductToCart.withXPath("//*[@id='tbodyid']/div[2]/div/div/h4/a")  // Nokia lumia 1520
        );
    }

    @When("^The user views the cart$")
    public void theUserViewsTheCart() {
        OnStage.theActorInTheSpotlight().attemptsTo(ViewCart.page());
    }


    @When("^The user clicks on Place Order$")
    public void theUserClicksOnPlaceOrder() {
        OnStage.theActorInTheSpotlight().attemptsTo(PlaceOrder.now());
    }

    @When("^The user completes the purchase form$")
    public void theUserCompletesThePurchaseForm() {
        OnStage.theActorInTheSpotlight().attemptsTo(CompletePurchase.form());
    }

    @Then("^The user should see a purchase confirmation$")
    public void theUserShouldSeeAPurchaseConfirmation() {
        // Aquí podemos añadir validaciones de la confirmación de compra
    }
}
