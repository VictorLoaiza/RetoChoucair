package co.com.choucair.inicial.tasks;

import co.com.choucair.inicial.model.FormularioDate;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import java.util.List;

import static co.com.choucair.inicial.userinterface.Formulario2.*;

public class InformacionPersonalDos implements Task {


        private List<FormularioDate> formularioDate;


        public InformacionPersonalDos(List<FormularioDate> formularioDate) {
            this.formularioDate = formularioDate;
        }

        public static InformacionPersonalDos personalInformacionDos(List<FormularioDate> formularioDate) {

            return Tasks.instrumented(InformacionPersonalDos.class, formularioDate);

        }

        @Override
        public <T extends Actor> void performAs(T actor) {


            actor.attemptsTo(
                    //Enter.theValue(formularioDate.get(0).getCity()).into(CITY),
                    Enter.theValue(formularioDate.get(0).getCdPostal()).into(CODE_POSTAL),
                    Click.on(DEPLOY_CLIC),
                    Click.on(COUNTRY),
                    Click.on(NEXT_BUTON));


        }

    }
