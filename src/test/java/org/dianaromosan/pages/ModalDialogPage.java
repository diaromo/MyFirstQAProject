package org.dianaromosan.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.dianaromosan.utils.BasePage;
import org.openqa.selenium.By;


@DefaultUrl("https://demoqa.com/modal-dialogs")

public class ModalDialogPage extends BasePage {

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


