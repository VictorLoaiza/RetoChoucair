package co.com.choucair.inicial.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FormularioValidacion extends PageObject {

    public static final Target VALIDATION = Target.the("Introducir contraseña de usuario").located(By.xpath("//span[contains(text(),'The last step')]"));

}
