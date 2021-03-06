package org.dianaromosan.utils;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.interactions.Actions;

public class BasePage extends PageObject {


    public void doubleClick(WebElementFacade element) {
        Actions action = new Actions(getDriver());
        action.doubleClick(element).perform();
    }

    public void moveToElement(WebElementFacade element) {
        Actions action = new Actions(getDriver());
        action.moveToElement(element).perform();
    }
    public void rightClick (WebElementFacade element){
        Actions action = new Actions(getDriver());
        action.contextClick(element).perform();
        }
    }
