package org.dianaromosan.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.dianaromosan.pages.WidgetAccordianPage;

public class WidgetAccordianSteps {

    private WidgetAccordianPage widgetAccordianPage;

    @Step
    public void openAcccordianPage(){widgetAccordianPage.open();}
    @Step
    public void accordianIsCollapsed(){widgetAccordianPage.verifyAccordianIsCollapsed();}
}
