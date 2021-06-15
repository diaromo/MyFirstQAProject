package org.dianaromosan.steps;

import net.thucydides.core.annotations.Step;
import org.dianaromosan.pages.AlertsPage;
import org.dianaromosan.pages.FramesPage;
import org.dianaromosan.pages.ModalDialogPage;

public class AlertsFramesModalSteps {

    private AlertsPage alertsPage;
    private FramesPage framesPage;
    private ModalDialogPage modalDialogPage;

    //Alerts
    @Step
    public void openAlertPage(){
        alertsPage.open();
    }
    @Step
    public void selectSeeAlertButton(){
        alertsPage.selectSeeAlertButton();
    }
    @Step
    public void checkAlert(){
        alertsPage.checkAlert();
    }
    @Step
    public void checkAlertAfterFiveSec(){
        alertsPage.alertAfterFiveSec();
    }
    @Step
    public void alertBoxShowsUp(String alertBoxMsg){
        alertsPage.AlertBoxShowsUp();
    }
    @Step
    public void promptBoxAppears(String name){
        alertsPage.promptBoxAppears(name);
    }

    //Frames
    @Step
    public void openFramesWindow(){
        framesPage.open();
    }

    @Step
    public void frameText(){
        framesPage.switchToFrameTextByIndex();
    }

    @Step
    public void checkNumberOfFrames(){
        framesPage.countNumberOfFrames();
    }

    //Modal Dialogs
    @Step
    public void openModalPage(){
        modalDialogPage.openModalPage();
    }

    @Step
    public void smallModal(){
        modalDialogPage.smallModal();
    }
}
