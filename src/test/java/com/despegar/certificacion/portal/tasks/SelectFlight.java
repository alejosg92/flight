package com.despegar.certificacion.portal.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.despegar.certificacion.portal.pages.HomePage.*;
import static com.despegar.certificacion.portal.pages.SelectFlightPage.BUTTONCONTINUE;
import static com.despegar.certificacion.portal.pages.SelectFlightPage.CHEAPESTFLIGH;

public class SelectFlight implements Task {

    public String from,to;

    public SelectFlight(String from){
        this.from = from;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CITYFROM));
        actor.attemptsTo(Enter.theValue("X" + from).into(CITYFROM));
        actor.attemptsTo(Click.on(SELECTFIRSTCITY));

        actor.attemptsTo(Click.on(CITYTO));
        actor.attemptsTo(Enter.theValue("X" + to).into(CITYTO));
        actor.attemptsTo(Click.on(SELECTFIRSTCITY));

        actor.attemptsTo(Click.on(DATETO));
        actor.attemptsTo(Click.on(SELECTDATETO));
        actor.attemptsTo(Click.on(SELECTDATEFROM));
        actor.attemptsTo(Click.on(BUTTONSEARCH));

        actor.attemptsTo(Click.on(CHEAPESTFLIGH));
        actor.attemptsTo(Click.on(BUTTONCONTINUE));
    }

    public static SelectFlight withCityFrom(String from){
        return Tasks.instrumented(SelectFlight.class,from);
    }

    public SelectFlight andCityTo(String to){
        this.to = to;
        return this;
    }


}
