package net.servates.ikbened.steps;

import net.servates.ikbened.pages.ForgotPasswordPage;
import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.Selenide.title;

public class ForgotPasswordPageSteps extends ForgotPasswordPage {
    /**
     * Method helps to clarify user is on the forgot password page
     * @return forgot password form header text
     */
    public String forgotPasswordGetFormHeaderText() {
        return forgotPasswordFormHeader.getText();
    }

    /**
     * Method returns page title
     * @return String
     */
    public String forgotPasswordTitleText() {
        return title();
    }

    /**
     * Fills in email in the forgot password form
     * @param email String
     */
    public ForgotPasswordPageSteps forgotPasswordFillEmail(String email) {
        emailInputBox.clear();
        emailInputBox.sendKeys(email);
        return page(ForgotPasswordPageSteps.class);
    }

    /**
     * Adds email value, clicks Send button
     * @param email
     * @return String
     */
    public ForgotPasswordPageSteps forgotPasswordReset(String email) {
        forgotPasswordFillEmail(email);
        forgotPasswordSendEmail();
        return page(ForgotPasswordPageSteps.class);
    }

    /**
     * Clicks Send button
     * @return same page as an object
     */
    public ForgotPasswordPageSteps forgotPasswordSendEmail() {
        sendPasswordResetButton.click();
        return page(ForgotPasswordPageSteps.class);
    }

    /**
     * Redirects user to Forgot Password page
     * @return ForgotPasswordPage object
     */
    public LoginPageSteps forgotPasswordRedirectToLoginPage() {
        signUpLink.click();
        return page(LoginPageSteps.class);
    }

}
