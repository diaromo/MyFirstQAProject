package org.dianaromosan.features;

import net.thucydides.core.annotations.Steps;
import org.dianaromosan.steps.ModalDialogSteps;
import org.dianaromosan.utils.BaseTest;
import org.junit.Test;

public class ModalDialogTest extends BaseTest {

    @Steps

    private ModalDialogSteps modalDialogSteps;

    @Test
    public void smallModalWorks(){
        modalDialogSteps.openModalPage();
        modalDialogSteps.smallModal();

    }
}
