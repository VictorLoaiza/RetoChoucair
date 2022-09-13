package co.com.choucair.inicial.tasks;

import co.com.choucair.inicial.model.FormularioDate;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import java.util.List;
import static co.com.choucair.inicial.userinterface.Formulario1.*;

public class InformacionPersonal implements Task {

    private List<FormularioDate> formularioDate;

    public InformacionPersonal(List<FormularioDate> formularioDate) {
        this.formularioDate = formularioDate;
    }

    public static InformacionPersonal personalInformacion(List<FormularioDate> formularioDate) {

        return Tasks.instrumented(InformacionPersonal.class, formularioDate);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(Scroll.to(NEXT),
                Enter.theValue(formularioDate.get(0).getFirstName()).into(FIRST_NAME),
                Enter.theValue(formularioDate.get(0).getLastName()).into(LAST_NAME),
                Enter.theValue(formularioDate.get(0).getEmail()).into(EMAIL),
                Click.on(MONTH),
                Click.on(DAY),
                Click.on(YEAR),
                Click.on(NEXT));


    }
}
