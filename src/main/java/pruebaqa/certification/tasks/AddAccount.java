package pruebaqa.certification.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import pruebaqa.certification.models.UserCredential;

import static pruebaqa.certification.interfaces.PrincipalPage.*;

public class AddAccount implements Task {
    private final String user;
    private final String password;

    public AddAccount (UserCredential credentials) {
        super();
        user = credentials.getUsername();
        password = credentials.getPassword();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitForVisibility.by(BTN_SIGN_IN_1, 20L),
                Click.on(BTN_SIGN_IN_1),
                WaitForVisibility.by(USER_NAME_SIGN_IN, 20L),
                Enter.theValue(user).into(USER_NAME_SIGN_IN),
                Enter.theValue(password).into(PASSWORD_SIGN_IN),
                WaitForVisibility.by(BTN_SIGN_IN_2, 20L),
                Click.on(BTN_SIGN_IN_2)

        );
    }
    public static AddAccount in(UserCredential credentials) {
        return Tasks.instrumented(AddAccount.class, credentials);
    }
}
