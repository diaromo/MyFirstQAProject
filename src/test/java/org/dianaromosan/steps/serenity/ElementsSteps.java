package org.dianaromosan.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.dianaromosan.pages.ElementsPage;
import org.dianaromosan.pages.HomePage;
import org.junit.Assert;

public class ElementsSteps {
    private HomePage homePage;
    private ElementsPage elementsPage;

    //Steps for Text Box Tests
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
    public void setUserName(String userName){ elementsPage.setUserNameField(userName); }
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
    @Step
    public void verifyTextBoxMsg(String message){
        elementsPage.verifyTextBoxPageMsg(message);
    }
    @Step
    public void verifyIfUserInfoIsDisplayed(String informationName){
        //Assert.assertTrue(elementsPage.verifyUserInfoIsDisplayed(informationName));
        elementsPage.verifyUserInformation(informationName);
    }

    //Steps for Check Box Tests
    @Step
    public void navigateToCheckBox(){
            homePage.open();
            homePage.clickElementsLink();
            elementsPage.clickCheckBoxLink();
    }
    @Step
    public void checkCheckBox(){
        elementsPage.checkCheckBoxIcon();
    }
    @Step
    public void verifyCheckBoxMsg(String checkBoxMsg){
        elementsPage.verifyCheckBoxMsg(checkBoxMsg);
    }
    @Step
    public void clickExpandButton(){elementsPage.clickExpandButton();}

    //Steps for Radio Buttons
    @Step
    public void navigateToRadioButtons(){
        homePage.open();
        homePage.clickElementsLink();
        elementsPage.clickRadioButtonLink();
    }
    @Step
    public void clickYesRadioButton(){elementsPage.clickYesRadioButton();}
    @Step
    public void clickImpressiveRadioButton(){elementsPage.clickImpressiveRadioButton();}
    @Step
    public void clickNoRadioButton(){elementsPage.clickNoRadioButton();}
    @Step
    public void verifyYesMsg(String yesMsg){elementsPage.verifyYesMsg(yesMsg);}

}
