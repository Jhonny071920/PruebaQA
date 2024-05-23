package pruebaqa.certification.interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class DashboardPage {
    public static final Target TITLE_DASHBOARD = Target.the("titulo de bienvenida").locatedBy("id:nameofuser");
    public static final Target BTN_LOG_OUT = Target.the("boton de LOG OUT").locatedBy("id:logout2");

}
