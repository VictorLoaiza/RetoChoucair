package co.com.choucair.inicial.interactions;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MetodosAux extends PageObject {

    public void tiempoDeEspera(String segundos) {
        int sg = Integer.parseInt(segundos);
        waitFor(sg).seconds();
    }




}
