package co.com.utest.tasks;

import co.com.utest.userinterfaces.PaginaUtest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task {

    private PaginaUtest pagina;

    public static Abrir laPagina() {

        return Tasks.instrumented(Abrir.class);


    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(pagina), Click.on(PaginaUtest.JOIN));

    }
}
