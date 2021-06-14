package org.dianaromosan.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

@DefaultUrl("https://demoqa.com/modal-dialogs")

public class ModalDialogPage extends PageObject {

    /*@FindBy(css = "#showSmallModal")
    private WebElementFacade smallModalButton;
    @FindBy(css = "body > div.fade.modal.show > div > div > div.modal-body")
    private WebElementFacade smallModalMessage;*/

    public void openModalPage(){open();}

    public void smallModal(){
        getDriver().findElement(By.cssSelector("#showSmallModal")).click();
        System.out.println(getDriver().switchTo().alert().getText());
        getDriver().switchTo().alert().accept();
        getDriver().findElement(By.cssSelector("body > div.fade.modal.show > div > div > div.modal-body")).isDisplayed();

    }

}


