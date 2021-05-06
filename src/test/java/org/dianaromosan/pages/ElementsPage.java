package org.dianaromosan.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

@DefaultUrl("https://demoqa.com/elements")

public class ElementsPage<myList> extends PageObject {

//CSS for Elements Text Box Tests

    @FindBy(css = "#item-0")
    private WebElementFacade textBoxLink;

    @FindBy(css = "#userName")
    private WebElementFacade userNameField;
    @FindBy(css = "#userEmail")
    private WebElementFacade userEmailField;
    @FindBy(css = "#currentAddress")
    private WebElementFacade currentAddressField;
    @FindBy(css = "#permanentAddress")
    private WebElementFacade permanentAddressField;

    @FindBy (css = "#submit")
    private WebElementFacade submitButton;

    @FindBy (css = "#app > div > div > div.pattern-backgound.playgound-header > div")
    private WebElementFacade textBoxPageMsg;

    @FindBy(css = "#output > div")
    private WebElementFacade userInformationList;

    /*public boolean verifyUserInfoIsDisplayed(String userInformation){
        for(WebElementFacade webElementFacade:userInformationList){
            if (webElementFacade.findElement(By.cssSelector(".mb-1")).getText().equals(userInformation));{
                return true;
            }
        }
        return false;
    }*/



    /*@FindBy (css = "#name")
    private WebElementFacade userNameConfirmation;

    @FindBy (css = "#email")
    private WebElementFacade userEmailConfirmation;

    @FindBy (css = "#currentAddress")
    private WebElementFacade userCurrentAddressConfirmation;

    @FindBy (css = "#permanentAddress")
    private WebElementFacade userPermanentAddressConfirmation;*/

      /*List<String> userInformationList = new ArrayList<String>();
    userInformationList.add("Name:Diana Romosan");
    userInformationList.add("Email:romosandiana@gmail.com");
    userInformationList.add("Current Address :Zorilor");
    userInformationList.add("Permananet Address :Cluj");*/

    //CSS for Elements Check Box Tests
    @FindBy(css = "#item-1")
    private WebElementFacade checkBoxLink;
    @FindBy(css = ".rct-checkbox")
    private WebElementFacade checkBox;
    @FindBy(css = "#result")
    private WebElementFacade checkBoxMsg;


    public void clickTextBoxLink(){clickOn(textBoxLink);}
    public void setUserNameField(String userName){typeInto(userNameField, userName);}
    public void setUserEmailField(String userEmail){typeInto(userEmailField,userEmail);}
    public void setCurrentAddressField(String currentAddress){typeInto(currentAddressField, currentAddress );}
    public void setPermanentAddressField(String permanentAddress){typeInto(permanentAddressField,permanentAddress);}
    public void clickSubmitButton(){clickOn(submitButton);}
    public void verifyTextBoxPageMsg(String message){ shouldContainText(message);}
    public void verifyUserInformation(String userInformation){shouldContainText(userInformation);}
    public void clickCheckBoxLink(){clickOn(checkBoxLink);}
    public void checkCheckBoxIcon(){clickOn(checkBox);}
    public void verifyCheckBoxMsg(String checkBoxMessage){shouldBeDisplayed();}







}
