package org.dianaromosan.features;

import net.thucydides.core.annotations.Steps;
import org.dianaromosan.steps.WidgetDatePickerSteps;
import org.dianaromosan.utils.BaseTest;
import org.junit.Test;

public class DatePickerTest extends BaseTest {


    @Steps
    private WidgetDatePickerSteps widgetDatePickerSteps;

    @Test
    public void dateSelection(){
        widgetDatePickerSteps.openDatePickerPage();
        widgetDatePickerSteps.selectDate();
        widgetDatePickerSteps.checkSelectedDate("12/15/1988");

    }
}
