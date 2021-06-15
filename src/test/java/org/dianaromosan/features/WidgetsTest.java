package org.dianaromosan.features;

import net.thucydides.core.annotations.Steps;
import org.dianaromosan.steps.WidgetsSteps;
import org.dianaromosan.utils.BaseTest;
import org.junit.Test;

public class WidgetsTest extends BaseTest {

    @Steps
    private WidgetsSteps widgetsSteps;

    //Accordion
    @Test
    public void validAccordionTest(){
        widgetsSteps.openAcccordianPage();
        widgetsSteps.accordianIsCollapsed();
    }

    //Auto Complete
    @Test
    public void selectAutocompleteColor() throws InterruptedException {
        widgetsSteps.openAutoCompletePage();
        widgetsSteps.selectColor("Green");
        widgetsSteps.verifyColorGreenIsSelected("Green");
    }
    //Date picker
    @Test
    public void dateSelection(){
        widgetsSteps.openDatePickerPage();
        widgetsSteps.selectDate();
        widgetsSteps.checkSelectedDate("12/15/1988");

    }
}
