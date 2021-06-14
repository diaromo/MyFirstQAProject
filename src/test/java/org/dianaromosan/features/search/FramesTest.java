package org.dianaromosan.features.search;

import net.thucydides.core.annotations.Steps;
import org.dianaromosan.steps.serenity.FramesSteps;
import org.dianaromosan.utils.BaseTest;
import org.junit.Test;

public class FramesTest extends BaseTest {

    @Steps
    private FramesSteps framesSteps;

    @Test
    public void switchToFrameTextByIndex(){
        framesSteps.openFramesWindow();
        framesSteps.frameText();
    }

    @Test
    public void checkNumberOfFrames(){
        framesSteps.openFramesWindow();
        framesSteps.checkNumberOfFrames();
    }
}
