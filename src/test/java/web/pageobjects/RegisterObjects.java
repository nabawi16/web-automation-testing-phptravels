package web.pageobjects;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.phptravels.net/signup")
public class RegisterObjects {
    public static Target FULLNAME_FIELD = Target.the("fullname field")
            .locatedBy("#input-fullname");
    public static Target USERNAME_FIELD = Target.the("username field")
            .locatedBy("#input-username");
    public static Target EMAIL_FIELD = Target.the("email field")
            .locatedBy("#email");
    public static Target PHONE_NUMBER_FIELD = Target.the("phone number field")
            .locatedBy("#phone");
    public static Target PASSWORD_FIELD = Target.the("password field")
            .locatedBy("#password");
    public static Target CONFIRM_PASSWORD_FIELD = Target.the("confirm password field")
            .locatedBy("#input-confirm-password");
    public static Target REGISTER_BUTTON = Target.the("register button")
            .locatedBy("#register-button");
    public static Target REGISTER_FAILED = Target.the("register failed")
            .locatedBy("//*[text()='Register failed']");
    public static Target VALIDATE_EMAIL = Target.the("email tidak valid")
            .locatedBy("//*[text()='Email tidak valid']");
    public static Target REGISTER_SUCCESSFULL = Target.the("register successfull")
            .locatedBy("//*[text()='Successfully registered']");
    public static Target HOMEPAGE_MENU = Target.the("homepage menu")
            .locatedBy("#headlessui-menu-button-1");
    public static Target Register_MENU = Target.the("register menu")
            .locatedBy("//*[text()='Register']");
}
