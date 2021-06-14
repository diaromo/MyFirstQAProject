package org.dianaromosan.features.search;

import net.thucydides.core.annotations.Steps;
import org.dianaromosan.steps.serenity.AlertSteps;
import org.dianaromosan.utils.BaseTest;
import org.junit.Test;

public class AlertsTest extends BaseTest {

    @Steps
    private AlertSteps alertSteps;

    @Test
    public void SeeAlertButtonWorks(){
        alertSteps.openAlertPage();
        alertSteps.selectSeeAlertButton();
        alertSteps.checkAlert();

    }
    @Test
    public void seeAlertAfterFiveSecondsWorks(){
        alertSteps.openAlertPage();
        alertSteps.checkAlertAfterFiveSec();
    }
    @Test
    public void alertBoxMsgShowsUp(){
        alertSteps.openAlertPage();
        alertSteps.alertBoxShowsUp("You selected Ok");
    }
    @Test
    public void enterTextInPromptBoxWorks(){
        alertSteps.openAlertPage();
        alertSteps.promptBoxAppears("Diana");
    }
}
