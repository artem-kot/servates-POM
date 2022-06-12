import static com.codeborne.selenide.Selenide.open;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import net.servates.ikbened.steps.LoginPageSteps;
import org.junit.Test;



public class LoginTest extends BaseTestData {
    @Test
    public void testLoginPageIsWorking() {
        assertThat(open(URL, LoginPageSteps.class)
                        .loginTitleText()
                , containsString("Aanmelden / Servates"));
    }

    @Test
    public void testLoginPageErrors() {
        LoginPageSteps page = open(URL, LoginPageSteps.class);
        assertThat(page
                .loginSignUpWithInvalidCredentials(emptyValue, emptyValue)
                .loginTitleText(), is(loginPageTitle));
        assertThat(page
                .loginSignUpWithInvalidCredentials(invalidEmail, emptyValue)
                .loginTitleText(), is(loginPageTitle));
        assertThat(page
                .loginSignUpWithInvalidCredentials(unknownEmail, emptyValue)
                .loginTitleText(), is(loginPageTitle));
        assertThat(page
                .loginSignUpWithInvalidCredentials(emptyValue, invalidPassword)
                .loginTitleText(), is(loginPageTitle));
        assertThat(page
                .loginSignUpWithInvalidCredentials(invalidEmail, invalidPassword)
                .loginTitleText(), is(loginPageTitle));
        assertThat(page
                .loginSignUpWithInvalidCredentials(unknownEmail, invalidPassword)
                .getInvalidCredentialsErrorMessage(), is(invalidCredentialsErrorMessage));
    }



    @Test
    public void testRedirectToForgotPassword() {
        LoginPageSteps page = open(URL, LoginPageSteps.class);
        assertThat(page.loginTitleText(), is(loginPageTitle));
        assertThat(page.loginRedirectToForgotPasswordPage()
                .forgotPasswordTitleText(), is(forgotPageTitle));
    }

    @Test
    public void testRedirectsForSignUp() {
        assertThat(open(URL, LoginPageSteps.class)
                .loginRedirectToForgotPasswordPage()
                .forgotPasswordRedirectToLoginPage()
                .loginTitleText(), is(loginPageTitle));
    }

    @Test
    public void testForgotPasswordFlow() {
        assertThat(open(URL, LoginPageSteps.class)
                .loginRedirectToForgotPasswordPage()
                .forgotPasswordReset(unknownEmail)
                .forgotPasswordTitleText(), is(forgotPageTitle));
    }
}
