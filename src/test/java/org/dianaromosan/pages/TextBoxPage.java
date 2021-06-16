package org.dianaromosan.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.dianaromosan.utils.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;

@DefaultUrl("https://demoqa.com/text-box")

public class TextBoxPage extends BasePage{

    @FindBy(css = "#userName")
    private WebElementFacade userNameField;
    @FindBy(css = "#userEmail")
    private WebElementFacade userEmailField;
    @FindBy(css = "#currentAddress")
    private WebElementFacade currentAddressField;
    @FindBy(css = "#permanentAddress")
    private WebElementFacade permanentAddressField;
    @FindBy(css = "#submit")
    private WebElementFacade submitButton;
    @FindBy(css=".border p")
    private List<WebElementFacade> form;


    public void setUserName(String userName){
        typeInto(userNameField, userName);
    }

    public void setUserEmail(String userEmail){
        typeInto(userEmailField, userEmail);
    }

    public void setCurrentAddress(String currentAddress){
        typeInto(currentAddressField, currentAddress);
    }

    public void setPermanentAddress(String permanentAddress){
        typeInto(permanentAddressField, permanentAddress);
    }

    public void clickSubmit(){
        clickOn(submitButton);
    }

    public boolean verifyForm(String name, String currentAddress, String permanentAddress){
        for(WebElementFacade webElementFacade:form){
            if(webElementFacade.findElement(By.cssSelector(".border p:first-child")).getText().contains(name)&&
                    webElementFacade.findElement(By.cssSelector(".border p:nth-child(3)")).getText().contains(currentAddress)&&
                    webElementFacade.findElement(By.cssSelector(".border p:nth-child(4)")).getText().contains(permanentAddress));
            return true;
        }
        return false;
    }

}
