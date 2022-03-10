package co.com.utest.stepdefinitions;

import co.com.utest.model.UtestDatos;
import co.com.utest.questions.Responder;
import co.com.utest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestStepDefinitions {


    /*1 preparamos el escenario*/
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^grego desea registrarse en Utest$")
    public void manuelDeseaRegistrarseEnUtest() {
        OnStage.theActorCalled("manuel").wasAbleTo(Abrir.laPagina());

    }


    @When("^el usuario ingresa los datos requeridos por el sistems$")
    public void elUsuarioIngresaLosDatosRequeridosPorElSistems(List<UtestDatos> datos) {

        OnStage.theActorInTheSpotlight().attemptsTo(Llenar.laPagina(datos), LLenardireccion.laPagina(datos),
                LLenarDispositivos.laPagina(datos), LLenarFinal.laPagina(datos)

        );

    }

    @Then("^el registro se completa al ver el boton de complete setup$")
    public void elRegistroSeCompletaAlVerElBotonDeCompleteSetup(List<UtestDatos> datos) throws Exception{
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Responder.aLos(datos)));



    }
}
