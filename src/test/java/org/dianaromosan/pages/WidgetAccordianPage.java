package org.dianaromosan.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;

@DefaultUrl("https://demoqa.com/accordian")

public class WidgetAccordianPage extends PageObject {

    public void openAccordianPage(){open();}

    public void verifyAccordianIsCollapsed(){
        getDriver().findElement(By.cssSelector("#section2Heading")).click();
        String className = getDriver().findElement(By.cssSelector("#accordianContainer > div > div:nth-child(2) > div.collapse.show")).getAttribute("class");
        System.out.println(className);
        if(className.contains("collapse show")){
            Assert.assertTrue("VerifyAccordianIsOpen",true);
        }
        else{
            Assert.assertTrue("VerifyAccordianIsClosed",false);
        }
    }
}
