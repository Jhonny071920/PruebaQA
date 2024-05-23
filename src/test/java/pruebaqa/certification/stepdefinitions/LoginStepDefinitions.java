package pruebaqa.certification.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import pruebaqa.certification.models.UserCredential;
import pruebaqa.certification.questions.GetText;
import pruebaqa.certification.tasks.Login;
import pruebaqa.certification.interfaces.DashboardPage;

import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.core.StringContains.containsStringIgnoringCase;

public class LoginStepDefinitions {

@Before
    public void setup() {
       setTheStage(new OnlineCast());
    }

    @Given("{string} como usuario quiere ingresar a la plataforma {string}")
    public void comoUsuarioQuiereValidarLaSeguridadDeLaPlataforma(String actorName, String url) {
      theActorCalled(actorName).wasAbleTo(Open.url(url));
    }

    @When("Se Loguea con las credenciales")
    public void seLogueaConLasCredenciales(UserCredential credentials) {
        theActorInTheSpotlight().attemptsTo(Login.in(credentials));
    }
    @Then("verifica que el mensaje sea {string}")
    public void verificaQueElMensajeSea(String msg) {
    theActorInTheSpotlight()
            .should(GivenWhenThen.seeThat(GetText.theField(DashboardPage.TITLE_DASHBOARD), containsStringIgnoringCase(msg)));
        Click.on(DashboardPage.BTN_LOG_OUT);
    }


}
