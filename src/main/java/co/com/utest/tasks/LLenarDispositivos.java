package co.com.utest.tasks;

import co.com.utest.model.UtestDatos;
import co.com.utest.userinterfaces.PaginaDispositivos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;
import static co.com.utest.userinterfaces.PaginaDispositivos.*;

public class LLenarDispositivos implements Task {

    public LLenarDispositivos(List<UtestDatos> datos) {
        this.datos = datos;
    }

    private List<UtestDatos> datos;

    public static LLenarDispositivos laPagina(List<UtestDatos> datos) {

        return Tasks.instrumented(LLenarDispositivos.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

                actor.attemptsTo(Click.on(CONTENEDOR_DISPOSITIVO_movil),
                Enter.theValue(datos.get(0).getStrDispositivo()).into(DISPOSITIVO_MOVIL).thenHit(Keys.ARROW_DOWN, Keys.ENTER),

                Click.on(CONTENEDOR_MODELO_MOVIL),
                Enter.theValue(datos.get(0).getStrModelo()).into(MODELO_MOVIL).thenHit(Keys.ARROW_DOWN, Keys.ENTER),

                Click.on(CONTENEDOR_SISTEMA_OPERATIVO),
                Enter.theValue(datos.get(0).getStrSistemaOperativo()).into(SISTEMA_OPERATIVO).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(BOTON_SECCION_FINA)


        );

    }
}
