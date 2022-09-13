package co.com.choucair.inicial.tasks;

import co.com.choucair.inicial.model.FormularioDate;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.choucair.inicial.userinterface.Formulario4.*;



public class InformacionPersonalCuatr implements Task {

    private List<FormularioDate> formularioDate;

    public InformacionPersonalCuatr(List<FormularioDate> formularioDate) {this.formularioDate = formularioDate;}

    public static InformacionPersonalCuatr personalInformacionCuatr(List<FormularioDate> formularioDate) {

        return Tasks.instrumented(InformacionPersonalCuatr.class, formularioDate);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                Enter.theValue(formularioDate.get(0).getCreateKey()).into(PASSWORD),
                Enter.theValue(formularioDate.get(0).getCreateKey()).into(REPASSWORD),
                Click.on(FINISH_ONE),
                Click.on(FINISH_TWO),
                Click.on(FINISH_THREE)
                 );


    }

}
