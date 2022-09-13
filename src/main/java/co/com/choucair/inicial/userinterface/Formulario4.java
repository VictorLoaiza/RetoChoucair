package co.com.choucair.inicial.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class Formulario4 extends PageObject {

    public static final Target PASSWORD = Target.the("Introducircontraseña de usuario").located(By.xpath("//input[@id='password']"));

    public static final Target REPASSWORD = Target.the("Introducir contraseña de usuario").located(By.xpath("//input[@id='confirmPassword']"));

    public static final Target FINISH_ONE = Target.the("Introducir contraseña de usuario").located(By.xpath("//input[@id='termOfUse']"));

    public static final Target FINISH_TWO = Target.the("Introducir contraseña de usuario").located(By.xpath("//input[@id='privacySetting']"));

    public static final Target FINISH_THREE = Target.the("Introducir contraseña de usuario").located(By.xpath("//input[@name='newsletterOptIn']"));





}
