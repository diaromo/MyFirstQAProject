package org.dianaromosan.steps;

import net.thucydides.core.annotations.Step;
import org.dianaromosan.pages.*;
import org.junit.Assert;

public class ElementsSteps {

    private TextBoxPage textBoxPage;
    private CheckBoxPage checkBoxPage;
    private RadioButtonPage radioButtonPage;
    private WebTablesPage webTablesPage;
    private ButtonsPage buttonsPage;
    private LinksPage linksPage;
    private DownloadAndUploadPage downloadAndUploadPage;

    //Text box
    @Step
    public void navigateToTextBox(){
        textBoxPage.open();
    }

    @Step
    public void setUserName(String userName){
        textBoxPage.setUserName(userName);
    }

    @Step
    public void setUserEmail(String userEmail){
        textBoxPage.setUserEmail(userEmail);
    }

    @Step
    public void setCurrentAddress(String currentAddress){
        textBoxPage.setCurrentAddress(currentAddress);
    }

    @Step
    public void setPermanentAddress(String permanentAddress){
        textBoxPage.setPermanentAddress(permanentAddress);
    }

    @Step
    public void setUserInformationFields(String userName, String userEmail, String currentAddress, String permanentAddress) {
        setUserName(userName);
        setUserEmail(userEmail);
        setCurrentAddress(currentAddress);
        setPermanentAddress(permanentAddress);
    }

    @Step
    public void clickSubmitButton(){
        textBoxPage.clickSubmit();
    }

    @Step
    public void verifyForm(String name, String currentAddress, String permanentAddress){
        Assert.assertTrue(textBoxPage.verifyForm(name, currentAddress,permanentAddress));
    }


    //Check box
    @Step
    public void navigateToCheckBox(){
        checkBoxPage.open();
    }

    @Step
    public void checkCheckBox(){
        checkBoxPage.checkCheckBoxIcon();
    }

    @Step
    public void verifyCheckBoxMsg(String checkBoxMsg){
        checkBoxPage.verifyCheckBoxMsg(checkBoxMsg);
    }

    @Step
    public void clickExpandButton(){
        checkBoxPage.clickExpandButton();
    }

    @Step
    public void verifyTreeStructure(String treeStructure){
        checkBoxPage.verifyExpandedTreeMsg(treeStructure);
    }

    //Radio button
    @Step
    public void navigateToRadioButtons(){
        radioButtonPage.open();
    }

    @Step
    public void clickYesRadioButton(){
        radioButtonPage.clickYesRadioButton();
    }

    @Step
    public void clickImpressiveRadioButton(){
        radioButtonPage.clickImpressiveRadioButton();
    }

    @Step
    public void clickNoRadioButton() {
        radioButtonPage.clickNoRadioButton();
    }

    @Step
    public void verifyYesMsg(String yesMsg){
        radioButtonPage.verifyYesMsg(yesMsg);
    }

    @Step
    public void verifyImpressiveMsg(String impressiveMsg){
        radioButtonPage.verifyImpressiveMsg(impressiveMsg);
    }

    //Web Tables
    @Step
    public void navigateToWebTableLink(){
        webTablesPage.open();
    }

    @Step
    public void clickAddButton(){
        webTablesPage.clickAddButton();
    }

    @Step
    public void setUserFirstNameReg(String firstNameReg){
        webTablesPage.setUserFirstNameReg(firstNameReg);
    }

    @Step
    public void setUserLastNameReg(String lastNameReg){
        webTablesPage.setUserLastNameReg(lastNameReg);
    }

    @Step
    public void setUserEmailReg(String emailReg){
        webTablesPage.setUserEmailReg(emailReg);
    }

    @Step
    public void setUserAgeReg(String ageReg){
        webTablesPage.setUserAgeReg(ageReg);
    }

    @Step
    public void setSalaryReg(String salaryReg){
        webTablesPage.setSalaryReg(salaryReg);
    }

    @Step
    public void setDepartmentReg(String departmentReg){
        webTablesPage.setDepartmentReg(departmentReg);
    }

    @Step
    public void clickSubmitRegButton(){
        webTablesPage.clickSubmitRegButton();
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
    public void verifyIfNameIsAddedToWebTable(String firstName, String lastName) {
        Assert.assertTrue(webTablesPage.verifyNameIsAddedToWebTable(firstName, lastName));
    }

    //Buttons
    @Step
    public void navigateToButtonsLink(){
        buttonsPage.open();
    }

    @Step
    public void doubleClick() {
        buttonsPage.doubleClick();
    }

    @Step
    public void doubleClickMsgIsEqual(String doubleClickMsg1) {
        buttonsPage.verifyDoubleClickMessage(doubleClickMsg1);
    }

    @Step
    public void switchToRightClickButton() {
        buttonsPage.switchToRightClick();
    }

    @Step
    public void rightClick() {
        buttonsPage.rightClick();
    }

    @Step
    public void rightClickMsgIsEqual(String rightClickMsg1) {
        buttonsPage.verifyRightClickMessage(rightClickMsg1);
    }

    //Links
    @Step
    public void navigateToLink() {
        linksPage.open();
    }

    @Step
    public void clickHomeButton() {
        linksPage.clickHomeButton();
    }

    @Step
    public void checkNewTabOpens() {
        linksPage.switchNewTab();
    }

    //Download and Upload
    @Step
    public void navigateToDownloadAndUpload() {
        downloadAndUploadPage.open();
    }

    @Step
    public void clickDownloadButton() {
        downloadAndUploadPage.clickDownloadButton();
    }

    @Step
    public void verifyFileIsDownloaded(String downloadPath, String fileName) {
        Assert.assertTrue(downloadAndUploadPage.isFileDownloaded(downloadPath, fileName));
    }

    @Step
    public void clickUploadButton() {
        downloadAndUploadPage.sendKeysUpload();
    }
}
