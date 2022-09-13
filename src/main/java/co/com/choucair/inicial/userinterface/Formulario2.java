package co.com.choucair.inicial.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class Formulario2 extends PageObject {

    //public static final Target CITY = Target.the("Introducir ciudad de residencia de usuario").located(By.xpath("//input[@id='city']"));

    public static final Target CODE_POSTAL = Target.the("Introducir codigo postal de usuario").located(By.xpath("//input[@id='zip']"));

    public static final Target DEPLOY_CLIC = Target.the("Click en menu de paises").located(By.xpath("(//div[@class='ui-select-match'])[2]"));

    public static final Target COUNTRY = Target.the("Introducir pais de residencia de usuario").located(By.xpath("//div[contains(text(),'Colombia')]"));


    public static final Target NEXT_BUTON = Target.the("Click boton siguiente").located(By.xpath("//SPAN[@aria-hidden='true'][text()='Next: Devices']"));




}
