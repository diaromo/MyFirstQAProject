package org.dianaromosan.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://demoqa.com/elements")

public class ElementsPage extends PageObject {

    @FindBy(css = "#item-0")
    private WebElementFacade textBoxLink;

    @FindBy(css = "#userName")
    private WebElementFacade userNameField;
    @FindBy(css = "#userEmail")
    private WebElementFacade userEmailField;
    @FindBy(css = "#currentAddress")
    private WebElementFacade currentAddressField;
    @FindBy(css = "#permanentAddress")
    private WebElementFacade permanentAddressField;

    @FindBy (css = "#submit")
    private WebElementFacade submitButton;

    public void clickTextBoxLink(){clickOn(textBoxLink);}
    public void setUserNameField(String userName){typeInto(userEmailField, userName);}
    public void setUserEmailField(String userEmail){typeInto(userEmailField,userEmail);}
    public void setCurrentAddressField(String currentAddress){typeInto(currentAddressField, currentAddress );}
    public void setPermanentAddressField(String permanentAddress){typeInto(permanentAddressField,permanentAddress);}
    public void clickSubmitButton(){clickOn(submitButton);}


}
