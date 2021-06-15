package org.dianaromosan.features;

import net.thucydides.core.annotations.Steps;
import org.dianaromosan.steps.AlertsFramesModalSteps;
import org.dianaromosan.utils.BaseTest;
import org.junit.Test;

public class AlertsFramesModalTest extends BaseTest {
    
    @Steps
    private AlertsFramesModalSteps alertsFramesModalSteps;
    
    //Alerts
    @Test
    public void seeAlertButtonWorks(){
        alertsFramesModalSteps.openAlertPage();
        alertsFramesModalSteps.selectSeeAlertButton();
        alertsFramesModalSteps.checkAlert();

    }
    @Test
    public void seeAlertAfterFiveSecondsWorks(){
        alertsFramesModalSteps.openAlertPage();
        alertsFramesModalSteps.checkAlertAfterFiveSec();
    }
    @Test
    public void alertBoxMsgShowsUp(){
        alertsFramesModalSteps.openAlertPage();
        alertsFramesModalSteps.alertBoxShowsUp("You selected Ok");
    }
    @Test
    public void enterTextInPromptBoxWorks(){
        alertsFramesModalSteps.openAlertPage();
        alertsFramesModalSteps.promptBoxAppears("Diana");
    }
    
    //Frames
    @Test
    public void switchToFrameTextByIndex(){
        alertsFramesModalSteps.openFramesWindow();
        alertsFramesModalSteps.frameText();
    }

    @Test
    public void checkNumberOfFrames(){
        alertsFramesModalSteps.openFramesWindow();
        alertsFramesModalSteps.checkNumberOfFrames();
    }
    
    //Modal dialogs
    @Test
    public void smallModalWorks(){
        alertsFramesModalSteps.openModalPage();
        alertsFramesModalSteps.smallModal();
    }
}
