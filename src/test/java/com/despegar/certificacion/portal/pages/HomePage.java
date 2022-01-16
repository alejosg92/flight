package com.despegar.certificacion.portal.pages;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static Target CITYFROM = Target.the("City From").locatedBy("//SPAN[text()='Tramo 1']//ancestor::DIV[1]//INPUT[@placeholder='Ingresa desde dónde viajas']");

    public static Target SELECTFIRSTCITY = Target.the("Select First City").locatedBy("(//DIV[@class='ac-container']//LI[1])[1]");

    public static Target CITYTO = Target.the("City To").locatedBy("//SPAN[text()='Tramo 1']//ancestor::DIV[1]//INPUT[@placeholder='Ingresa hacia dónde viajas']");

    public static Target DATETO = Target.the("Date To").locatedBy("//SPAN[text()='Tramo 1']//ancestor::DIV[1]//INPUT[@placeholder='Ida']");

    public static Target SELECTDATETO = Target.the("Select Date To").locatedBy("(//DIV[contains(@data-month,'2022')]//DIV[contains(text(),'13')])[2]");

    public static Target SELECTDATEFROM = Target.the("Select Date From").locatedBy("(//DIV[contains(@data-month,'2022')]//DIV[contains(text(),'22')])[2]");

    public static Target BUTTONSEARCH = Target.the("Button Search").locatedBy("//EM[contains(text(),'Buscar')]/ancestor::BUTTON");


}
