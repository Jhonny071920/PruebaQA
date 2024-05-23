package pruebaqa.certification.interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PrincipalPage {

    public static final Target LBL_TITULO_LOGIN = Target.the("Texto del titulo del login").locatedBy("id:logInModalLabel");
    public static final Target BTN_LOGIN_1 = Target.the("en el boton login").locatedBy("id:login2");
    public static final Target USER_NAME = Target.the("el nombre de usuario").locatedBy("id:loginusername");
    public static final Target PASSWORD = Target.the("el password de usuario").locatedBy("id:loginpassword");
    public static final Target BTN_LOGIN_2 = Target.the("en el boton login").locatedBy("//button[text() ='Log in']");

    public static final Target BTN_SIGN_IN_1 = Target.the("en el boton signin").locatedBy("id:signin2");
    public static final Target USER_NAME_SIGN_IN = Target.the("el nombre de usuario del signin").locatedBy("id:sign-username");
    public static final Target PASSWORD_SIGN_IN  = Target.the("el password de usuario del signin").locatedBy("id:sign-password");
    public static final Target BTN_SIGN_IN_2 = Target.the("en el boton Sign up").locatedBy("//button[text() ='Sign up']");

}
