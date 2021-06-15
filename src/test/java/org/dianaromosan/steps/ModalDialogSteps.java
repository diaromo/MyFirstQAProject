package org.dianaromosan.steps;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import org.dianaromosan.pages.ModalDialogPage;


public class ModalDialogSteps {

    private ModalDialogPage modalDialogPage;

    @Step
    public void openModalPage(){modalDialogPage.openModalPage();}

    @Step
    public void smallModal(){modalDialogPage.smallModal();}
}
