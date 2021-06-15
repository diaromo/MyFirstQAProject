package org.dianaromosan.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://demoqa.com/auto-complete")

public class WidgetsAutoCompletePage extends PageObject {

    public void openAutoComplete() {
        open();
    }

    public void selectColor(String color) throws InterruptedException {
        WebElement autoCompleteField = getDriver().findElement(By.cssSelector("#autoCompleteMultipleInput"));
        autoCompleteField.click();
        autoCompleteField.sendKeys(color);
        Thread.sleep(2000);
        autoCompleteField.sendKeys(Keys.ARROW_DOWN);
        autoCompleteField.sendKeys(Keys.ENTER);
    }

    public void verifyColorIsSelected(String displayedColor) {

        WebElement selectedColor = getDriver().findElement(By.cssSelector("div.css-12jo7m5.auto-complete__multi-value__label"));
        Assert.assertEquals(displayedColor,selectedColor.getText());
    }
}
