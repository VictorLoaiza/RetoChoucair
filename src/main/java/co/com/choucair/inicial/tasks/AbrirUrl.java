package co.com.choucair.inicial.tasks;

import co.com.choucair.inicial.userinterface.uTest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirUrl implements Task {

    uTest openPage;

    public static AbrirUrl abrirNavegador() {
        return Tasks.instrumented(AbrirUrl.class);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(openPage));

    }
}
