package org.dianaromosan.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.dianaromosan.utils.BasePage;

@DefaultUrl("https://demoqa.com/radio-button")

public class RadioButtonPage extends BasePage {

    @FindBy(css = "#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(1) > div:nth-child(2) > label")
    private WebElementFacade yesRadioButton;
    @FindBy(css = "#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(1) > div:nth-child(3) > label")
    private WebElementFacade impressiveRadioButton;
    @FindBy(css = "##app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(1) > div.custom-control.disabled.custom-radio.custom-control-inline > label")
    private WebElementFacade noRadioButton;
    @FindBy(css = "div:nth-child(1) > p")
    private WebElementFacade yesConfirmationSelection;
    @FindBy(css = " div:nth-child(1) > p")
    private WebElementFacade impressiveConfirmationSelection;

    public void clickYesRadioButton() {

        clickOn(yesRadioButton);
    }

    public void verifyYesMsg(String yesMsg) {

        shouldContainText(yesMsg);
    }

    public void clickImpressiveRadioButton() {

        clickOn(impressiveRadioButton);
    }

    public void clickNoRadioButton() {

        clickOn(noRadioButton);
    }

    public void verifyImpressiveMsg(String impressiveMsg) {

        shouldContainText(impressiveMsg);
    }
}
