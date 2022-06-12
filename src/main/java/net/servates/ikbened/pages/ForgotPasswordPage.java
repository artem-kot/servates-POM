package net.servates.ikbened.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ForgotPasswordPage {
    @FindBy(how=How.XPATH,using = "//h4[contains(text(),'Wachtwoord vergeten')]")
    protected SelenideElement forgotPasswordFormHeader;

    @FindBy(how=How.ID,using = "Email")
    protected SelenideElement emailInputBox;

    @FindBy(how= How.XPATH,using = "//a[text()='Aanmelden']")
    protected SelenideElement signUpLink;

    @FindBy(how=How.XPATH,using = "//button[text()='Versturen']")
    protected SelenideElement sendPasswordResetButton;
}
