package org.dianaromosan.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.dianaromosan.steps.serenity.ElementsSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class ElementsTest {

    @Managed(uniqueSession = false)
    private WebDriver webDriver;
    @Steps
    private ElementsSteps elementsSteps;

    //Go to Text Box Page, Fill in text fields with valid information
    @Test
    public void validCredentialTest(){
        elementsSteps.navigateToTextBox();
        elementsSteps.setUserInformationFields("Diana Romosan", "romosandiana@gmail.com", "Zorilor","Cluj");
    }

    //Go to Text Box Page, Leave all text fields blank and hit Submit button
    @Test
    public void invalidCredentialTest(){
        elementsSteps.navigateToTextBox();
        elementsSteps.clickSubmitButton();
    }
}
