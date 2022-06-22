package web.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.phptravels.net/login")
public class LoginObjects extends PageObject {
    public static Target EMAIL_FIELD = Target.the("email")
            .locatedBy("#email");
    public static Target PASSWORD_FIELD = Target.the("password")
            .locatedBy("#password");
    public static Target LOGIN_BUTTON = Target.the("login button")
            .locatedBy("#submit");
    public static Target LOGIN_Successfull = Target.the("login successfull")
            .locatedBy("//*[text()='Successfully logged in']");
    public static Target USER_NOT_FOUND = Target.the("user not found")
            .locatedBy("//*[text()='user not found']");
    public static Target PASSWORD_INCORRECT = Target.the("password incorrect")
            .locatedBy("//*[text()='password incorrect']");
}
