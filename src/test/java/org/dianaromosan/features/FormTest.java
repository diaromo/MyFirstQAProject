package org.dianaromosan.features;

import net.thucydides.core.annotations.Steps;
import org.dianaromosan.steps.FormSteps;
import org.dianaromosan.utils.BaseTest;
import org.junit.Test;

public class FormTest extends BaseTest{

    @Steps
    private FormSteps formSteps;

    //Forms Tests
    @Test
    public void validCredentialFormTest(){
        formSteps.navigateToForms();
        formSteps.setFromFirstName("Diana");
        formSteps.setFromLastName("Romosan");
        formSteps.setFromEmail("dianaromosan@gmail.com");
        formSteps.clickFemaleGender();
        formSteps.setFromNumber("0748569874");
        formSteps.clickDateBirthWidget();
        formSteps.selectBirthMonth();
        formSteps.clickReadingHobbies();
        formSteps.uploadPicture();
        formSteps.setFromAddress("Zorilor");
        //formSteps.selectState();
        //formSteps.selectCity();
        formSteps.clickSubmit();
        formSteps.verifyFormIsSubmitted("Thanks for submitting the form");
    }
}
