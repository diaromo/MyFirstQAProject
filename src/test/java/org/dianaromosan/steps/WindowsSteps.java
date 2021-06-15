package org.dianaromosan.steps;

import net.thucydides.core.annotations.Step;
import org.dianaromosan.pages.WindowsPage;
import org.dianaromosan.pages.HomePage;

public class WindowsSteps {

    private HomePage homePage;
    private WindowsPage alertsFrameAndWindowsPage;

    @Step
    public void navigateToWindows(){
        homePage.open();
        homePage.clickAlertsFrameAndWindowsLink();
        alertsFrameAndWindowsPage.clickBrowserWindowsLink();

    }

}
