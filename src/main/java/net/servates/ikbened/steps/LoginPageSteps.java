package net.servates.ikbened.steps;

import net.servates.ikbened.pages.LoginPage;

import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.Selenide.title;

public class LoginPageSteps extends LoginPage {
    /**
     * Method helps to clarify user is on the sign up page
     * @return sign up form header text
     */
    public String loginGetHeaderText() {
        return singUpFormHeader.getText();
    }

    /**
     * Method returns page title
     * @return String
     */
    public String loginTitleText() {
        return title();
    }

    /**
     * Fills in credentials in the sign up form
     * @param email String
     * @param password String
     */
    public LoginPageSteps loginFillCredentials(String email, String password) {
        emailInputBox.clear();
        emailInputBox.sendKeys(email);
        passwordInputBox.clear();
        passwordInputBox.sendKeys(password);
        return page(LoginPageSteps.class);
    }

    /**
     * Clicks sign up button
     * @return same page as an object
     */
    public LoginPageSteps loginInvalidAttempt() {
        signUpButton.click();
        return page(LoginPageSteps.class);
    }

    /**
     * Adds incorrect values, clicks sign up button
     * @return same page as an object
     */
    public LoginPageSteps loginSignUpWithInvalidCredentials(String email, String password) {
        loginFillCredentials(email, password);
        loginInvalidAttempt();
        return page(LoginPageSteps.class);
    }

    /**
     * Returns error message text
     * @return String
     */
    public String getInvalidCredentialsErrorMessage() {
        return invalidCredentialsErrorMessage.getText();
    }

    /**
     * Clicks sign up button
     * @return dashboard page as an object
     */
    public DashboardPageSteps loginValidAttempt() {
        signUpButton.click();
        return page(DashboardPageSteps.class);
    }

    /**
     * Redirects user to Forgot Password page
     * @return ForgotPasswordPage object
     */
    public ForgotPasswordPageSteps loginRedirectToForgotPasswordPage() {
        forgotPasswordLink.click();
        return page(ForgotPasswordPageSteps.class);
    }
}
