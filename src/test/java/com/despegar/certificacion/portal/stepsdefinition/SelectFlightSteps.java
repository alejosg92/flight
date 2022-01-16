package com.despegar.certificacion.portal.stepsdefinition;


import com.despegar.certificacion.portal.tasks.SelectFlight;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.despegar.certificacion.portal.drivers.ChromeDriver.chrome;
import static com.despegar.certificacion.portal.pages.CheckOutPage.TITULOCHECKOUT;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class SelectFlightSteps {

    @Before
    public void init(){
        setTheStage(new Cast());
        theActorCalled("Usuario");
    }

    @Given("^User visits a Home of Despegar$")
    public void userVisitsAHomeOfDespegar() {
        theActorInTheSpotlight().can(BrowseTheWeb.with(chrome().withURL("https://www.despegar.com.co/")));
    }

    @When("^Selects the chapest flight (.*) to (.*)$")
    public void selectsTheChapestFlightFromToToForDateFromAndReturnDateTo(String from, String to) {
        theActorInTheSpotlight().attemptsTo(SelectFlight.withCityFrom(from).andCityTo(to));

    }

    @Then("^See checkout page$")
    public void seeCheckoutPage() {
        theActorInTheSpotlight().attemptsTo(Ensure.that(TITULOCHECKOUT).isDisplayed());
    }

}
