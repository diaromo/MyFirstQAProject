package org.dianaromosan.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://demoqa.com/date-picker")

public class WidgetDatePickerPage extends PageObject {

    public void openDatePikerPage(){open();}

    public void selectDate() {
        WebElement datePicker = getDriver().findElement((By.cssSelector("#datePickerMonthYearInput")));
        datePicker.click();
        WebElement selectMonth = getDriver().findElement(By.cssSelector(".react-datepicker__month-select option:nth-child(12)"));
        selectMonth.click();
        WebElement selectYear = getDriver().findElement(By.cssSelector(".react-datepicker__year-select option:nth-child(89)"));
        selectYear.click();
        WebElement selectDay = getDriver().findElement(By.cssSelector(".react-datepicker__day--015"));
        selectDay.click();
    }

    public void checkDateIsCorrect(String date){
        WebElement selectedDate = getDriver().findElement(By.cssSelector("#datePickerMonthYearInput"));
        Assert.assertEquals(date,selectedDate.getText());

    }
}
