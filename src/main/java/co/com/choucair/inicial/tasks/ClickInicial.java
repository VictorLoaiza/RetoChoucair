package co.com.choucair.inicial.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


import static co.com.choucair.inicial.userinterface.uTest.JOIN_TODAY;

public class ClickInicial implements Task {


    public static ClickInicial inicioClick() {

        return Tasks.instrumented(ClickInicial.class);

    }

    @Override
    public <T extends Actor> void performAs(T actor){

        actor.attemptsTo(
                Click.on(JOIN_TODAY));
    }


}
