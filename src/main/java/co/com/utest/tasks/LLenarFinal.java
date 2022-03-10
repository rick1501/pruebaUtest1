package co.com.utest.tasks;

import co.com.utest.model.UtestDatos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;
import static co.com.utest.userinterfaces.PaginaFinal.*;


public class LLenarFinal implements Task {
    private List<UtestDatos> datos;


    public LLenarFinal(List<UtestDatos> datos) {
        this.datos = datos;
    }



    public static LLenarFinal laPagina(List<UtestDatos> datos) {

        return Tasks.instrumented(LLenarFinal.class,datos );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(datos.get(0).getStrClave()).into(CLAVE),
                Enter.theValue(datos.get(0).getStrClave()).into(CLAVECONFIRMADA),
                Click.on(CHECKBOX_01),
                Click.on(CHECKBOX_02),
                Click.on(CHECKBOX_03),
                Click.on(BOTON_TERMINAR)





                );

    }
}
