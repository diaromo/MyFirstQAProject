package org.dianaromosan.steps;

import net.thucydides.core.annotations.Step;
import org.dianaromosan.pages.AlertsPage;

public class AlertSteps {

    private AlertsPage alertsPage;

    @Step
    public void openAlertPage(){alertsPage.open();}

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
}
