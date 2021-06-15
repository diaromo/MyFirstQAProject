package org.dianaromosan.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

@DefaultUrl("https://demoqa.com/forms")

public class FormPage extends PageObject {

    //Forms - Practice forms

    @FindBy(css = "#app > div > div > div.row > div:nth-child(1) > div > div > div:nth-child(2) > div")
    private WebElementFacade practiceFormsLink;
    @FindBy(css = "#firstName")
    private WebElementFacade formFirstName;
    @FindBy(css = "#lastName")
    private WebElementFacade formLastname;
    @FindBy(css = "#userEmail")
    private WebElementFacade formEmail;
    @FindBy(css = "#genterWrapper > div.col-md-9.col-sm-12 > div:nth-child(2) > label")
    private WebElementFacade formFemaleGender;
    @FindBy(css = "#userNumber")
    private WebElementFacade formUserNumber;
    @FindBy(css = "#dateOfBirthInput")
    private WebElementFacade DateBirthWidget;
    @FindBy(css = "#hobbiesWrapper > div.col-md-9.col-sm-12 > div:nth-child(2) > label")
    private WebElementFacade readingHobbies;
    //Picture
    @FindBy(css = "#currentAddress")
    private WebElementFacade formAddress;


    public void clickPracticeFormsLink(){ clickOn(practiceFormsLink); }
    public void setFormFirstName(String firstNameForm){typeInto(formFirstName, firstNameForm);}
    public void setFormLastName(String lastNameForm){typeInto(formLastname, lastNameForm);}
    public void setFormEmail(String emailForm){typeInto(formEmail, emailForm);}
    public void clickFemaleGender(){ clickOn(formFemaleGender); }
    public void setFormNumber(String numberForm){typeInto(formUserNumber, numberForm);}
    public void clickDateOfBirthWidget(){clickOn(DateBirthWidget);}
    public void selectBirthDate(){
        getDriver().findElement(By.cssSelector(".react-datepicker__month-select option:nth-child(12)")).click();
        getDriver().findElement(By.cssSelector(".react-datepicker__year-select option:nth-child(89)")).click();
        getDriver().findElement(By.cssSelector(".react-datepicker__day--015")).click();

    }
    public void clickReadingHobbies(){ clickOn(readingHobbies); }
    public void uploadPicture(){
        //getDriver().findElement(By.cssSelector("#userForm > div:nth-child(8) > div.col-md-9.col-sm-12 > div > label")).click();
        upload("C:\\Users\\dianaromosan\\Downloads\\Cat");
        }

    public void setFormAddress(String addressForm){typeInto(formAddress, addressForm);}
    public void selectState(){
        Select select = new Select(getDriver().findElement(By.cssSelector(" .css-1uccc91-singleValue")));
        select.selectByVisibleText("Haryana");

    }
    public void selectCity(){
        //selectByVisibleText(String arg0): void
        Select select = new Select(getDriver().findElement(By.cssSelector(" .css-1uccc91-singleValue")));
        select.selectByVisibleText("Panipat");
    }
    public void clickSubmit(){
        getDriver().findElement(By.cssSelector("#submit")).click();
    }
    public void verifyFormIsSubmitted(String submitConfirmationMsg){
        getDriver().findElement(By.cssSelector("#example-modal-sizes-title-lg")).isDisplayed();
    }
  }

