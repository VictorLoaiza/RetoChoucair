package co.com.choucair.inicial.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.inicial.userinterface.Formulario3.*;


public class InformacionPersonalTre implements Task {

    public static InformacionPersonalTre deviceInformation() {
        return Tasks.instrumented(InformacionPersonalTre.class);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(COMPUTERSELEC_CLIC),
                Click.on(COMPUTER),
                Click.on(VERSIONSELEC_CLIC),
                Click.on(VERSION),
                Click.on(LANGUAGESELEC_CLIC),
                Click.on(LANGUAGE),
                Click.on(MOBILESELEC_CLIC),
                Click.on(MOBILE),
                Click.on(MODELSELEC_CLIC),
                Click.on(MODEL),
                Click.on(SYSTEMSELEC_CLIC),
                Click.on(SYSTEM),
                Click.on(NEXT_LAST_STEP));

    }

    }
