package co.com.choucair.inicial.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class Formulario1 extends PageObject {

    public static final Target FIRST_NAME = Target.the("Introducir nombre de usuario").located(By.xpath("//input[@id='firstName']"));
    public static final Target LAST_NAME = Target.the("Introducir apellido de usuario").located(By.xpath("//input[@id='lastName']"));
    public static final Target EMAIL = Target.the("Introducir email de usuario").located(By.xpath("//input[@id='email']"));
    public static final Target MONTH = Target.the("Introducir Mes de nacimiento de usuario").located(By.xpath("//option[contains(text(),'August')]"));
    public static final Target DAY = Target.the("Introducir dia de nacimiento de usuario").located(By.xpath("//option[text()='2']"));
    public static final Target YEAR = Target.the("Introducir año de nacimiento de usuario").located(By.xpath("//option[contains(text(),'1996')]"));
    public static final Target NEXT = Target.the("Click boton siguiente").located(By.xpath("//a[@class='btn btn-blue']"));


}
