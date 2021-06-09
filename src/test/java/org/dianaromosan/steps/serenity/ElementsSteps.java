package org.dianaromosan.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.apache.http.conn.util.PublicSuffixList;
import org.dianaromosan.pages.ElementsPage;
import org.dianaromosan.pages.FormsPage;
import org.dianaromosan.pages.HomePage;
import org.junit.Assert;

public class ElementsSteps {
    private HomePage homePage;
    private ElementsPage elementsPage;
    private FormsPage formsPage;


    //Steps for Text Box Tests
    @Step
    public void navigateToTextBox(){
        homePage.open();
        homePage.clickElementsLink();
        elementsPage.clickTextBoxLink();
    }

    @Step
    public void clickSubmitButton(){
        elementsPage.clickSubmitButton();
    }
    @Step
    public void setUserName(String userName){ elementsPage.setUserNameField(userName); }
    @Step
    public void setUserEmail(String userEmail){
        elementsPage.setUserEmailField(userEmail);
    }
    @Step
    public void setCurrentAddress(String currentAddress){
        elementsPage.setCurrentAddressField(currentAddress);
    }
    @Step
    public void setPermanentAddress(String permanentAddress){
        elementsPage.setPermanentAddressField(permanentAddress);
    }

    @Step
    public void setUserInformationFields(String userName, String userEmail, String currentAddress, String permanentAddress) {
        setUserName(userName);
        setUserEmail(userEmail);
        setCurrentAddress(currentAddress);
        setPermanentAddress(permanentAddress);

    }
    @Step
    public void verifyTextBoxMsg(String message){
        elementsPage.verifyTextBoxPageMsg(message);
    }
    @Step
    public void verifyIfUserInfoIsDisplayed(String informationName){
        //Assert.assertTrue(elementsPage.verifyUserInfoIsDisplayed(informationName));
        elementsPage.verifyUserInformation(informationName);
    }

    //Steps for Check Box Tests
    @Step
    public void navigateToCheckBox(){
            homePage.open();
            homePage.clickElementsLink();
            elementsPage.clickCheckBoxLink();
    }
    @Step
    public void checkCheckBox(){ elementsPage.checkCheckBoxIcon();
    }
    @Step
    public void verifyCheckBoxMsg(String checkBoxMsg){
        elementsPage.verifyCheckBoxMsg(checkBoxMsg);
    }
    @Step
    public void clickExpandButton(){elementsPage.clickExpandButton();
    }
    @Step
    public void verifyTreeStructure(String treeStructure){
        elementsPage.verifyExpandedTreeMsg(treeStructure);
    }

    //Steps for Radio Buttons
    @Step
    public void navigateToRadioButtons(){
        homePage.open();
        homePage.clickElementsLink();
        elementsPage.clickRadioButtonLink();
    }
    @Step
    public void clickYesRadioButton(){elementsPage.clickYesRadioButton();
    }
    @Step
    public void clickImpressiveRadioButton(){elementsPage.clickImpressiveRadioButton();
    }
    @Step
    public void clickNoRadioButton(){elementsPage.clickNoRadioButton();
    }
    @Step
    public void verifyYesMsg(String yesMsg){elementsPage.verifyYesMsg(yesMsg);
    }
    @Step
    public void verifyImpressiveMsg(String impressiveMsg){elementsPage.verifyImpressiveMsg(impressiveMsg);
    }

    //Steps for Web Tables
    @Step
    public void clickWebTablesLink(){elementsPage.clickWebTablesLink();}
    @Step
    public void clickAddButton(){elementsPage.clickAddButton();}
    @Step
    public void setUserFirstNameReg(String firstNameReg){elementsPage.setUserFirstNameReg(firstNameReg);}
    @Step
    public void setUserLastNameReg(String lastNameReg){elementsPage.setUserLastNameReg(lastNameReg);}
    @Step
    public void setUserEmailReg(String emailReg){elementsPage.setUserEmailReg(emailReg);}
    @Step
    public void setUserAgeReg(String ageReg){elementsPage.setUserAgeReg(ageReg);}
    @Step
    public void setSalaryReg(String salaryReg){elementsPage.setSalaryReg(salaryReg);}
    @Step
    public void setDepartmentReg(String departmentReg){elementsPage.setDepartmentReg(departmentReg);}
    @Step
    public void clickSubmitRegButton(){elementsPage.clickSubmitRegButton();}
    @Step
    public void navigateToWebTableAndAdd(){
        homePage.open();
        homePage.clickElementsLink();
        elementsPage.clickWebTablesLink();
        elementsPage.clickAddButton();
    }
    @Step
    public void fillInWebTableUserInfo(String firstName, String lastName, String emailReg, String age, String salary, String department) {
        setUserFirstNameReg(firstName);
        setUserLastNameReg(lastName);
        setUserEmailReg(emailReg);
        setUserAgeReg(age);
        setSalaryReg(salary);
        setDepartmentReg(department);
    }

    @Step
    public void verifyIfNameIsAddedToWebTable(String firstName, String lastName){
        Assert.assertTrue(elementsPage.verifyNameIsAddedToWebTable(firstName,lastName));
    }

    @Step
    public void navigateToButtonsLink(){
        homePage.open();
        homePage.clickElementsLink();
        elementsPage.clickButtonsLink();}
    @Step
    public void doubleClick(){elementsPage.doubleClick();}
    @Step
    public void doubleClickMsgIsEqual(String doubleClickMsg1){elementsPage.doubleClickMsgisEqual(doubleClickMsg1);}
    @Step
    public void switchToRightClickButton(){
        elementsPage.switchToRightClick();
    }
    @Step
    public void rightClick(){
        elementsPage.rightClick();
    }
    @Step
    public void rightClickMsgIsEqual(String rightClickMsg1){elementsPage.rightClickMsgIsEqual(rightClickMsg1);}

    //Links Steps

    @Step
    public void navigateToLink(){
        homePage.open();
        homePage.clickElementsLink();
        elementsPage.clickLinkButton();

    }

    @Step
    public void clickHomeButton(){
        elementsPage.clickHomeButton();
    }
    @Step
    public void checkNewTabOpens(){
        elementsPage.switchNewTab();
    }

    //Broken links - Images
    //@Step
    //public void navigateToBrokenLinksAndImg(){
        //homePage.open();
        //homePage.clickElementsLink();
        //elementsPage.clickBrokenLinksAndImg();}


    /*@Step
    public void checkBrokenLinks(){
        elementsPage.getDriver();
        elementsPage.linkIsValidOrNot();
        elementsPage.verifyLinks;}*/

    //Download File Steps
    @Step
    public void navigateToDownloadAndUpload(){
        homePage.open();
        homePage.clickElementsLink();
        elementsPage.clickUploadAndDownloadLink();}

    @Step
    public void clickDownloadButton(){
        elementsPage.clickDownloadButton(); }
    @Step
    public void verifyFileIsDownloaded(String downloadPath, String fileName){
        elementsPage.isFileDownloaded(downloadPath,fileName);
    }
    //Upload File Steps
    @Step
    public void clickUploadButton(){
        elementsPage.sendKeysUpload();
    }

    //Forms Steps
    @Step
    public void navigateToPracticeForms(){
        homePage.open();
        homePage.clickFormsLink();
        formsPage.clickPracticeFormsLink();
    }

}
