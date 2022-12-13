package com.co.avianca.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/reserva.feature",
snippets = SnippetType.CAMELCASE,
glue = "com.co.avianca.stepsdefinitions")
public class ReservaRunner {
}
