/**
 * Abstract class with test data
 */

abstract public class BaseTestData extends BaseTest {
    protected final static String URL = "https://ikbened.servates.net";

    String validEmail = "ikbened@servates.nl";
    String invalidEmail = "ThisIsNotAnValidEmail";
    String unknownEmail = "unknown@servates.nl";
//    String validPassword = "not_shared_due_to_security_policy";
    String invalidPassword = "VeryIncorrectPassword";
    String emptyValue = "";

    String loginPageTitle = "Aanmelden / Servates";
    String forgotPageTitle = "Wachtwoord vergeten / Servates";
    String invalidCredentialsErrorMessage = "Ongeldige gebruikersnaam of wachtwoord";
    String passwordResetSuccessfulMessage = "Als wij uw e-mail adres herkennen, dan ontvangt u binnen enkele ogenblikken van ons een mail met instructies. Ontvangt u geen e-mail, neem dan contact op met uw beheerder.";
}