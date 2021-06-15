package org.dianaromosan.features;

import net.thucydides.core.annotations.Steps;
import org.dianaromosan.steps.WidgetAccordianSteps;
import org.dianaromosan.utils.BaseTest;
import org.junit.Test;

public class AccordianTest extends BaseTest {

    @Steps
    private WidgetAccordianSteps widgetAccordianSteps;

    @Test
    public void accordianIsCollapsed(){
        widgetAccordianSteps.openAcccordianPage();
        widgetAccordianSteps.accordianIsCollapsed();
    }
}
