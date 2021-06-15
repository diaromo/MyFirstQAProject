package org.dianaromosan.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.dianaromosan.pages.WidgetsAutoCompletePage;

public class WidgetAutoCompleteSteps {

    private WidgetsAutoCompletePage widgetsAutoCompletePage;

    @Step
    public void openAutoCompletePage(){widgetsAutoCompletePage.openAutoComplete();}

    @Step
    public void selectColor(String color) throws InterruptedException {
        widgetsAutoCompletePage.openAutoComplete();
        widgetsAutoCompletePage.selectColor(color);
    }
    @Step
    public void verifyColorGreenIsSelected(String displayedColor){
        widgetsAutoCompletePage.verifyColorIsSelected(displayedColor);
    }
}
