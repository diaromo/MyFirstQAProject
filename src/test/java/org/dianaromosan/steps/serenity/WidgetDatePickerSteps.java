package org.dianaromosan.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.dianaromosan.pages.WidgetDatePickerPage;

public class WidgetDatePickerSteps {

    private WidgetDatePickerPage widgetDatePickerPage;

    @Step
    public void openDatePickerPage(){
        widgetDatePickerPage.openDatePikerPage();
    }
    @Step
    public void selectDate(){
        widgetDatePickerPage.selectDate();
    }
    @Step
    public void checkSelectedDate(String date){
        widgetDatePickerPage.checkDateIsCorrect(date);
    }
}
