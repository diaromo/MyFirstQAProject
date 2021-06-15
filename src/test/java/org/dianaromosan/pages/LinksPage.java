package org.dianaromosan.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.dianaromosan.utils.BasePage;
import org.openqa.selenium.By;

import java.util.ArrayList;

@DefaultUrl("https://demoqa.com/links")

public class LinksPage extends BasePage {

    @FindBy(css = "#simpleLink")
    private WebElementFacade homeButton;
    public void clickHomeButton() {

        clickOn(homeButton);
    }
    public void switchNewTab() {
        ArrayList<String> tabs2 = new ArrayList<String>(getDriver().getWindowHandles());

        getDriver().switchTo().window(tabs2.get(1));
        getDriver().findElement(By.cssSelector("#app > div > div > div.home-banner > a > img"));

        getDriver().close();
        getDriver().switchTo().window(tabs2.get(0));
    }
}
