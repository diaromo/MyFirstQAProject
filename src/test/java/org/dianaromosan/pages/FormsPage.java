package org.dianaromosan.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://demoqa.com/forms")

public class FormsPage extends PageObject {

    //Forms - Practice forms
    @FindBy(css = "#app > div > div > div.row > div:nth-child(1) > div > div > div:nth-child(2) > div > ul")
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
    @FindBy(css = "#hobbiesWrapper > div.col-md-9.col-sm-12 > div:nth-child(2) > label")
    private WebElementFacade readingHobbies;
    //Picture
    @FindBy(css = "#currentAddress")
    private WebElementFacade formAddress;


    public void clickPracticeFormsLink(){
        clickOn(practiceFormsLink);
    }
    public void setFormFirstName(String firstNameForm){typeInto(formFirstName, firstNameForm);}
    public void setFormLastName(String lastNameForm){typeInto(formLastname, lastNameForm);}
    public void setFormEmail(String emailForm){typeInto(formEmail, emailForm);}
  }

