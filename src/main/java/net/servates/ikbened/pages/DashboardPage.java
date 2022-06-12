package net.servates.ikbened.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage {
    @FindBy(how=How.XPATH,using = "//span[@class='avatar navatar ui-w-30 rounded-circle']")
    protected SelenideElement dashboardAvatarLogo;

    @FindBy(how=How.PARTIAL_LINK_TEXT,using = "Afmelden")
    protected SelenideElement afmelden;
}
