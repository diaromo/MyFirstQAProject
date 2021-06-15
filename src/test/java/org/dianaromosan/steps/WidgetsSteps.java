package org.dianaromosan.steps;

import net.thucydides.core.annotations.Step;
import org.dianaromosan.pages.WidgetAccordianPage;
import org.dianaromosan.pages.WidgetDatePickerPage;
import org.dianaromosan.pages.WidgetsAutoCompletePage;

public class WidgetsSteps {

    private WidgetAccordianPage widgetAccordianPage;
    private WidgetsAutoCompletePage widgetsAutoCompletePage;
    private WidgetDatePickerPage widgetDatePickerPage;

    //Accordian
    @Step
    public void openAcccordianPage(){
        widgetAccordianPage.open();
    }
    @Step
    public void accordianIsCollapsed(){
        widgetAccordianPage.verifyAccordianIsCollapsed();
    }

    //Autocomplete
    @Step
    public void openAutoCompletePage(){
        widgetsAutoCompletePage.openAutoComplete();
    }

    @Step
    public void selectColor(String color){
        widgetsAutoCompletePage.openAutoComplete();
        widgetsAutoCompletePage.selectColor(color);
    }
    @Step
    public void verifyColorGreenIsSelected(String displayedColor){
        widgetsAutoCompletePage.verifyColorIsSelected(displayedColor);
    }

    //Date Picker
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
