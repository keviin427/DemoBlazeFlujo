package com.demoblaze.runners;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"json:target/build/cucumber.json"},
        features = "src/test/resources/features/purchase.feature",
        glue = "com.demoblaze.steps"
)
public class PurchaseRunner {
}