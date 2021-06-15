package org.dianaromosan.features;

import net.thucydides.core.annotations.Steps;
import org.dianaromosan.steps.WidgetAutoCompleteSteps;
import org.dianaromosan.utils.BaseTest;
import org.junit.Test;

public class WidgetAutoCompleteTest extends BaseTest {

    @Steps
    private WidgetAutoCompleteSteps widgetAutoCompleteSteps;

    @Test
    public void selectAutocompleteColor() throws InterruptedException {
        widgetAutoCompleteSteps.openAutoCompletePage();
        widgetAutoCompleteSteps.selectColor("Green");
        widgetAutoCompleteSteps.verifyColorGreenIsSelected("Green");
    }
}