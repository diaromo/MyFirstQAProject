package org.dianaromosan.pages;

import groovy.time.BaseDuration;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@DefaultUrl("https://demoqa.com/alerts")

public class AlertsPage extends PageObject {

    //See Alert Test
    public void openAlertPage(){open();}

    public void selectSeeAlertButton(){
        getDriver().findElement(By.cssSelector("#alertButton")).click();
    }


    public void checkAlert(){
        waitFor(ExpectedConditions.alertIsPresent());
        Alert alert = getDriver().switchTo().alert();
        System.out.println(alert.getText());

    }

    //Alert shows up after 5 seconds

    public void alertAfterFiveSec(){
        getDriver().findElement(By.cssSelector("#timerAlertButton")).click();
        withTimeoutOf(Duration.ofSeconds(5)).waitFor(ExpectedConditions.alertIsPresent());
        System.out.println(getDriver().switchTo().alert().getText());
        getDriver().switchTo().alert().accept();

    }
    //Confirm Alert box shows up
    public void AlertBoxShowsUp(){
        getDriver().findElement((By.cssSelector("#confirmButton"))).click();
        System.out.println(getDriver().switchTo().alert().getText());
        getDriver().switchTo().alert().accept();
        getDriver().findElement(By.cssSelector("#confirmResult")).isDisplayed();

    }
    //Alert shows up after 5 seconds

    public void promptBoxAppears(String name){
        getDriver().findElement(By.cssSelector("#promtButton")).click();
        System.out.println(getDriver().switchTo().alert().getText());
        getDriver().switchTo().alert().sendKeys(name);
        getDriver().switchTo().alert().accept();
        getDriver().findElement(By.cssSelector("#promptResult")).isDisplayed();
    }

}
