package org.dianaromosan.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.dianaromosan.pages.ElementsPage;
import org.dianaromosan.pages.HomePage;

public class ElementsSteps {
    private HomePage homePage;
    private ElementsPage elementsPage;

    @Step
    public void navigateToTextBox(){
        homePage.open();
        homePage.clickElementsLink();
        elementsPage.clickTextBoxLink();
    }

    @Step
    public void clickSubmitButton(){
        elementsPage.clickSubmitButton();
    }
    @Step
    public void setUserName(String userName){
        elementsPage.setUserNameField(userName);
    }
    @Step
    public void setUserEmail(String userEmail){
        elementsPage.setUserEmailField(userEmail);
    }
    @Step
    public void setCurrentAddress(String currentAddress){
        elementsPage.setCurrentAddressField(currentAddress);
    }
    @Step
    public void setPermanentAddress(String permanentAddress){
        elementsPage.setPermanentAddressField(permanentAddress);
    }

    @Step
    public void setUserInformationFields(String userName, String userEmail, String currentAddress, String permanentAddress){
        setUserName(userName);
        setUserEmail(userEmail);
        setCurrentAddress(currentAddress);
        setPermanentAddress(permanentAddress);
    }
}
