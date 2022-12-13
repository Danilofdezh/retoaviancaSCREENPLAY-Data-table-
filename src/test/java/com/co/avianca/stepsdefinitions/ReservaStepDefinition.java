package com.co.avianca.stepsdefinitions;

import com.co.avianca.models.Data;
import com.co.avianca.questions.ValidationMessage;
import com.co.avianca.tasks.ManageReservations;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;


public class ReservaStepDefinition {

@Managed
    WebDriver hisBrowser;

@Before
public void setUp(){

    OnStage.setTheStage(new OnlineCast());
    OnStage.theActorCalled("Danilo");
    //OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
}
    @Given("^the user enters the avianca website$")
    public void theUserEntersTheAviancaWebsite() {
    OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.avianca.com/co/es/"));


    }

    @When("^the user registers his data$")
    public void theUserRegistersHisData(List<Data>dataReservaList) {
    Data dataReserva;
    dataReserva = dataReservaList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(ManageReservations.Click(dataReserva));


    }

    @Then("^successful query$")
    public void successfulQuery() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidationMessage.compare()
                , Matchers.is(Matchers.equalTo("Numero de reserva o apellido invalido, por favor intentelo nuevamente"))));


    }
}
