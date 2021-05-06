package org.dianaromosan.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.dianaromosan.steps.serenity.ElementsSteps;
import org.dianaromosan.utils.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;



public class ElementsTest extends BaseTest {



    private WebDriver webDriver;


    @Steps
    private ElementsSteps elementsSteps;

    //Text Box Tests
    //Test 1 Go to Text Box Page, Fill in text fields with valid information and Submit
    @Test
    public void validCredentialTest(){
        elementsSteps.navigateToTextBox();
        elementsSteps.setUserInformationFields("Diana Romosan", "romosandiana@gmail.com", "Zorilor","Cluj");
        elementsSteps.clickSubmitButton();
    //Assert
        elementsSteps.verifyIfUserInfoIsDisplayed("Cluj");
    }

    //Test 2 Go to Text Box Page, Leave all text fields blank and hit Submit
    @Test
    public void invalidCredentialTest(){
        elementsSteps.navigateToTextBox();
        elementsSteps.clickSubmitButton();
    //Assert - WebPage is still TextBox Page
        elementsSteps.verifyTextBoxMsg("Text Box");
    }

    //Check Box Tests
    //Test 1 - Check Box is checked

    @Test
    public void checkCheckBox(){
        elementsSteps.navigateToCheckBox();
        elementsSteps.checkCheckBox();
    //Assert all categories are displayed in confirmation msg
        elementsSteps.verifyCheckBoxMsg("desktp");//to check

    }
}
