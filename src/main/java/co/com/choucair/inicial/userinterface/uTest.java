package co.com.choucair.inicial.userinterface;


import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


@DefaultUrl("https://utest.com/")
public class uTest extends PageObject {

    public static final Target JOIN_TODAY = Target.the("Clic en el botón Join today").located(By.xpath("//a[contains(text(),'Join Today')]"));



}
