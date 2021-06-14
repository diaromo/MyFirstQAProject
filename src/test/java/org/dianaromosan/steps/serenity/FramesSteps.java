package org.dianaromosan.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.dianaromosan.pages.FramesPage;

public class FramesSteps {

    private FramesPage framesPage;

    @Step
    public void openFramesWindow(){
        framesPage.open();
    }

    @Step
    public void frameText(){framesPage.switchToFrameTextByIndex();}

    @Step
    public void checkNumberOfFrames(){framesPage.countNumberOfFrames();}

}
