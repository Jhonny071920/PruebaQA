package pruebaqa.certification.tasks;

import pruebaqa.certification.models.UserCredential;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import pruebaqa.certification.interfaces.DashboardPage;
import pruebaqa.certification.interfaces.PrincipalPage;

public class Login implements Task {

    private final String user;
    private final String password;

    public Login(UserCredential credentials) {
        super();
        user = credentials.getUsername();
        password = credentials.getPassword();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitForVisibility.by(PrincipalPage.BTN_LOGIN_1, 20L),
                Click.on(PrincipalPage.BTN_LOGIN_1),
                WaitForVisibility.by(PrincipalPage.LBL_TITULO_LOGIN, 20L),
                Enter.theValue(user).into(PrincipalPage.USER_NAME),
                Enter.theValue(password).into(PrincipalPage.PASSWORD),
                WaitForVisibility.by(PrincipalPage.BTN_LOGIN_2, 20L),
                Click.on(PrincipalPage.BTN_LOGIN_2),
                WaitForVisibility.by(DashboardPage.TITLE_DASHBOARD, 20L)
        );
    }

    public static Login in(UserCredential credentials) {
        return Tasks.instrumented(Login.class, credentials);
    }

}
