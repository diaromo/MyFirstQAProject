package org.dianaromosan.features.search;

import org.dianaromosan.steps.serenity.WindowsSteps;
import org.dianaromosan.utils.BaseTest;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;

public class WindowsTest extends BaseTest {

    @Steps
    private WindowsSteps alertsFrameAndWindowsPage;
    @Steps
    private ElementsTest elementsTest;

    @Test
    public void newWindowOpensTest(){
        alertsFrameAndWindowsPage.navigateToWindows();
    }

}
