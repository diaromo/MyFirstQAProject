package org.dianaromosan.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://demoqa.com/frames")

public class FramesPage extends PageObject {

    public void openFramesWindow(){open();}

    public void switchToFrameTextByIndex(){
        getDriver().switchTo().frame(0);
        WebElement frame1Heading = getDriver().findElement(By.cssSelector("#sampleHeading"));
        String frame1Text = frame1Heading.getText();
        System.out.println(frame1Text);

    }

    public void countNumberOfFrames(){
        int countIframesInPage = getDriver().findElements(By.tagName("iframe")).size();
        System.out.println("Number of Frames on a Page:" + countIframesInPage);


    }

}
