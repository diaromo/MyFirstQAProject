package org.dianaromosan.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.dianaromosan.utils.BasePage;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

@DefaultUrl("https://demoqa.com/buttons")

public class ButtonsPage extends BasePage {

    private Object DoubleClickAction;

    @FindBy(css = "#doubleClickBtn")
    private WebElementFacade doubleClickButton;
    @FindBy(css = "#doubleClickMessage")
    private WebElementFacade doubleClickMessage;
    @FindBy(css = "#rightClickBtn")
    private WebElementFacade rightClickButton;
    @FindBy(css = "#rightClickMessage")
    private WebElementFacade rightClickMessage;

    public void doubleClick() {

        doubleClick(doubleClickButton);
    }

    public void verifyDoubleClickMessage(String doubleClickMsg1) {
        Assert.assertEquals(doubleClickMsg1, doubleClickMessage.getText());
    }

    public void switchToRightClick() {
        moveToElement(rightClickButton);
    }

    public void rightClick() {
        rightClick(rightClickButton);
    }

    public void verifyRightClickMessage(String rightClickMsg) {
        Assert.assertEquals(rightClickMsg, rightClickMessage.getText());
    }
}
