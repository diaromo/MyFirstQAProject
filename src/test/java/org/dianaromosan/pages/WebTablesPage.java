package org.dianaromosan.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.dianaromosan.utils.BasePage;
import org.openqa.selenium.By;

import java.util.List;

@DefaultUrl("https://demoqa.com/webtables")

public class WebTablesPage extends BasePage {

    @FindBy(css = "#addNewRecordButton")
    private WebElementFacade addButton;
    @FindBy(css = "#firstName")
    private WebElementFacade firstNameRegForm;
    @FindBy(css = "#lastName")
    private WebElementFacade lastNameRegForm;
    @FindBy(css = "#userEmail")
    private WebElementFacade userEmailRegForm;
    @FindBy(css = "#age")
    private WebElementFacade ageRegForm;
    @FindBy(css = "#salary")
    private WebElementFacade salaryRegForm;
    @FindBy(css = "#department")
    private WebElementFacade departmentRegForm;
    @FindBy(css = "#submit")
    private WebElementFacade submitRegButton;
    @FindBy(css = ".rt-tbody .rt-tr:not(.-padRow)")
    private List<WebElementFacade> table;

    public void clickAddButton() {
        clickOn(addButton);
    }

    public void setUserFirstNameReg(String firstNameReg) {
        typeInto(firstNameRegForm, firstNameReg);
    }

    public void setUserLastNameReg(String lastNameReg) {
        typeInto(lastNameRegForm, lastNameReg);
    }

    public void setUserEmailReg(String EmailReg) {
        typeInto(userEmailRegForm, EmailReg);
    }

    public void setUserAgeReg(String ageReg) {
        typeInto(ageRegForm, ageReg);
    }

    public void setSalaryReg(String salaryReg) {
        typeInto(salaryRegForm, salaryReg);
    }

    public void setDepartmentReg(String departmentReg) {
        typeInto(departmentRegForm, departmentReg);
    }

    public void clickSubmitRegButton() {
        clickOn(submitRegButton);
    }

    public boolean verifyNameIsAddedToWebTable(String firstName, String lastName) {
        for (WebElementFacade webElementFacade : table) {
            if (webElementFacade.findElement(By.cssSelector(".rt-td:nth-child(1)")).getText().equals(firstName) &&
                    webElementFacade.findElement(By.cssSelector(".rt-td:nth-child(2)")).getText().equals(lastName)) {
                return true;
            }
        }
        return false;
    }
}
