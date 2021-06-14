package org.dianaromosan.steps.serenity;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import org.dianaromosan.pages.FormPage;
import org.dianaromosan.pages.HomePage;

@DefaultUrl("https://demoqa.com/automation-practice-form")

public class FormSteps {

        private HomePage homePage;
        private FormPage formPage;

    @Step
    public void clickPracticeForm(){
        formPage.clickPracticeFormsLink(); }
    @Step
    public void setFromFirstName(String formFirstname){
        formPage.setFormFirstName(formFirstname);}
    @Step
    public void setFromLastName(String formLastname){
        formPage.setFormLastName(formLastname);}
    @Step
    public void setFromEmail(String formEmail){
        formPage.setFormEmail(formEmail);}
    @Step
    public void clickFemaleGender(){
        formPage.clickFemaleGender();}
    @Step
    public void setFromNumber(String formNumber){
        formPage.setFormNumber(formNumber);}
    @Step
    public void clickDateBirthWidget(){
        formPage.clickDateOfBirthWidget();
    }
    @Step
    public void selectBirthMonth(){
        formPage.selectBirthMonth();
    }
    @Step
    public void clickReadingHobbies(){
        formPage.clickReadingHobbies();}
    @Step
    public void uploadPicture(){
        formPage.uploadPicture();
    }
    @Step
    public void setFromAddress(String formAddress){
        formPage.setFormAddress(formAddress);}
    @Step
    public void selectState(){
        formPage.selectState();
    }
    @Step
    public void selectCity(){
        formPage.selectCity();
    }
    @Step
    public void clickSubmit(){formPage.clickSubmit();}
    @Step
    public void verifyFormIsSubmitted(String submitConfirmationMsg){formPage.verifyFormIsSubmitted(submitConfirmationMsg);}

    @Step
    public void navigateToForms(){
        homePage.open();
        homePage.clickFormsLink();
        formPage.clickPracticeFormsLink();}



}
