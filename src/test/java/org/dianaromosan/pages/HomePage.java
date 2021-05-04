package org.dianaromosan.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://demoqa.com/")
public class HomePage extends PageObject {

    @FindBy(css = "#app > div > div > div.home-body > div > div:nth-child(1) > div > div.avatar.mx-auto.white > svg > path")
    private WebElementFacade elementsLink;
    @FindBy(css = "#app > div > div > div.home-body > div > div:nth-child(2) > div > div.avatar.mx-auto.white > svg")
    private WebElementFacade formsLink;
    @FindBy(css = "#app > div > div > div.home-body > div > div:nth-child(3) > div > div.avatar.mx-auto.white > svg")
    private WebElementFacade alertsFrameAndWindowsLink;
    @FindBy(css = "#app > div > div > div.home-body > div > div:nth-child(4) > div > div.avatar.mx-auto.white > svg > path")
    private WebElementFacade widgetsLink;
    @FindBy(css = "#app > div > div > div.home-body > div > div:nth-child(5) > div > div.avatar.mx-auto.white > svg")
    private WebElementFacade interactionsLink;
    @FindBy(css = "#app > div > div > div.home-body > div > div:nth-child(6) > div > div.avatar.mx-auto.white > svg")
    private WebElementFacade bookStoreApplicationLink;

    public void clickElementsLink(){clickOn(elementsLink);}
    public void clickFormsLink(){clickOn(formsLink);}
    public void clickAlertsFrameAndWindowsLink(){clickOn(alertsFrameAndWindowsLink);}
    public void clickWidgetsLink(){clickOn(widgetsLink);}
    public void clickInteractionsLink(){clickOn(interactionsLink);}
    public void clickBookStoreApplicationLink(){clickOn(bookStoreApplicationLink);}

}
