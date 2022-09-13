package co.com.choucair.inicial.stepdefinitions;

import co.com.choucair.inicial.model.FormularioDate;
import co.com.choucair.inicial.questions.Validacion;
import co.com.choucair.inicial.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class InicialStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^The user is on the web page$")
    public void theUserIsOnTheWebPage() {

        OnStage.theActorCalled("Victor").wasAbleTo(AbrirUrl.abrirNavegador());

    }

    @When("^The user fills out the form with all the required information$")
    public void theUserFillsOutTheFormWithAllTheRequiredInformation(List<FormularioDate> formularioDate) {

        OnStage.theActorCalled("Victor").attemptsTo(ClickInicial.inicioClick(),
                InformacionPersonal.personalInformacion(formularioDate),
                InformacionPersonalDos.personalInformacionDos(formularioDate),
                InformacionPersonalTre.deviceInformation(),
                InformacionPersonalCuatr.personalInformacionCuatr(formularioDate)





                );




    }

    @Then("^Verify that the user was created successfully$")
    public void verifyThatTheUserWasCreatedSuccessfully(List<FormularioDate> formularioDate) {


        OnStage.theActorInTheSpotlight().should(seeThat(Validacion.elResultado(formularioDate)));

    }

}
