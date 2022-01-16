package com.despegar.certificacion.portal.pages;

import net.serenitybdd.screenplay.targets.Target;

public class SelectFlightPage {

    public static Target CHEAPESTFLIGH = Target.the("Cheapest Flight").locatedBy("(//DIV[@class='cluster-container COMMON']//BUY-BUTTON)[1]");

    public static Target BUTTONCONTINUE = Target.the("Continue").locatedBy("//SPAN[@id='upselling-popup-position']//BUTTON");

}
