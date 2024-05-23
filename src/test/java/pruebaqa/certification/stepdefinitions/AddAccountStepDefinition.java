package pruebaqa.certification.stepdefinitions;
import io.cucumber.java.Before;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;
import pruebaqa.certification.models.UserCredential;
import pruebaqa.certification.tasks.AddAccount;


import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
public class AddAccountStepDefinition {
    @Before
    public void setup() {
        setTheStage(new OnlineCast());
    }

    @When("Se registra con las credenciales")
    public void seRegistraConLasCredenciales(UserCredential credentials) {
        theActorInTheSpotlight().attemptsTo(AddAccount.in(credentials));
    }

}
