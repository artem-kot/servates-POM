package net.servates.ikbened.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
    @FindBy(how= How.XPATH,using = "//h4[contains(text(),'Aanmelden')]")
    protected SelenideElement singUpFormHeader;

    @FindBy(how=How.ID,using = "Email")
    protected SelenideElement emailInputBox;

    @FindBy(how=How.ID,using = "Password")
    protected SelenideElement passwordInputBox;

    @FindBy(how=How.XPATH,using = "//button[text()='Aanmelden']")
    protected SelenideElement signUpButton;

    @FindBy(how=How.XPATH,using = "//a[text()='Wachtwoord vergeten']")
    protected SelenideElement forgotPasswordLink;

    @FindBy(how=How.XPATH,using = "//img[@alt='Servates']")
    protected SelenideElement servatesLogo;

    @FindBy(how=How.XPATH,using = "//*[contains(text(),'Ongeldige gebruikersnaam of wachtwoord')]")
    protected SelenideElement invalidCredentialsErrorMessage;
}
