package org.dianaromosan.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.dianaromosan.utils.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

@DefaultUrl("https://demoqa.com/alerts")
public class AlertsPage extends BasePage {

    public void selectSeeAlertButton() {
        getDriver().findElement(By.cssSelector("#alertButton")).click();
    }


    public void checkAlert() {
        waitFor(ExpectedConditions.alertIsPresent());
        Alert alert = getDriver().switchTo().alert();

    }

    //Alert shows up after 5 seconds

    public void alertAfterFiveSec() {
        getDriver().findElement(By.cssSelector("#timerAlertButton")).click();
        withTimeoutOf(Duration.ofSeconds(5)).waitFor(ExpectedConditions.alertIsPresent());
        getDriver().switchTo().alert().accept();

    }

    //Confirm Alert box shows up
    public void AlertBoxShowsUp() {
        getDriver().findElement((By.cssSelector("#confirmButton"))).click();
        System.out.println(getDriver().switchTo().alert().getText());
        getDriver().switchTo().alert().accept();
        getDriver().findElement(By.cssSelector("#confirmResult")).isDisplayed();

    }
    //Alert shows up after 5 seconds

    public void promptBoxAppears(String name) {
        getDriver().findElement(By.cssSelector("#promtButton")).click();
        System.out.println(getDriver().switchTo().alert().getText());
        getDriver().switchTo().alert().sendKeys(name);
        getDriver().switchTo().alert().accept();
        getDriver().findElement(By.cssSelector("#promptResult")).isDisplayed();
    }

}
