package org.dianaromosan.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import net.serenitybdd.core.annotations.findby.FindBy;

@DefaultUrl("https://demoqa.com/alertsWindows")

    public class WindowsPage extends PageObject {

    //Windows
    @FindBy(css = "li#item-0.btn.btn-light.active")
    private WebElementFacade windowsLink;

    public void clickBrowserWindowsLink(){ clickOn(windowsLink);
    }







}
