package co.com.choucair.inicial.questions;

import co.com.choucair.inicial.model.FormularioDate;
import co.com.choucair.inicial.userinterface.FormularioValidacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Validacion implements Question<Boolean> {

    public Validacion(List<FormularioDate> formularioDate) {
        this.formularioDate = formularioDate;
    }

    private List<FormularioDate> formularioDate;

    public static Validacion elResultado(List<FormularioDate> formularioDate) {

        return new Validacion(formularioDate);

    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean resultado;

        String confirmationUser = Text.of(FormularioValidacion.VALIDATION).viewedBy(actor).asString();

        if (formularioDate.get(0).getValidar().equals(confirmationUser)){
            resultado = true;
        }else {
            resultado = false;
        }

        return resultado;

    }


}
