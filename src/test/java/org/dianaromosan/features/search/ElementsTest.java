package org.dianaromosan.features.search;

import net.thucydides.core.annotations.Steps;
import org.dianaromosan.steps.serenity.ElementsSteps;
import org.dianaromosan.utils.BaseTest;
import org.junit.Test;


public class ElementsTest extends BaseTest {

    @Steps
    private ElementsSteps elementsSteps;


    //Text Box Tests
    //Test 1 Go to Text Box Page, Fill in text fields with valid information and Submit
    @Test
    public void validCredentialTest(){
        elementsSteps.navigateToTextBox();
        elementsSteps.setUserInformationFields("Diana Romosan", "romosandiana@gmail.com", "Zorilor","Cluj");
        elementsSteps.clickSubmitButton();
    //Assert
        elementsSteps.verifyIfUserInfoIsDisplayed("Cluj");
    }

    //Test 2 Go to Text Box Page, Leave all text fields blank and hit Submit
    @Test
    public void invalidCredentialTest(){
        elementsSteps.navigateToTextBox();
        elementsSteps.clickSubmitButton();
    //Assert - WebPage is still TextBox Page
        elementsSteps.verifyTextBoxMsg("Text Box");
    }

    //Check Box Tests
    //Test 1 - Check Box is checked

    @Test
    public void checkCheckBox(){
        elementsSteps.navigateToCheckBox();
        elementsSteps.checkCheckBox();
    //Assert all categories are displayed in confirmation msg
        elementsSteps.verifyCheckBoxMsg("home");

    }

    //Test 2 - Check expand button works
    @Test
    public void checkExpandButton(){
        elementsSteps.navigateToCheckBox();
        elementsSteps.clickExpandButton();
    //Assert all tree structure names are displayed in confirmation msg
        elementsSteps.verifyTreeStructure("Office");
    }

    //Radio Button Tests
    //Test 1,2,3 - Check Radio Buttons Work
    @Test
    public void selectYesOption(){
        elementsSteps.navigateToRadioButtons();
        elementsSteps.clickYesRadioButton();
        elementsSteps.verifyYesMsg("You have selected Yes");
    }
    @Test
    public void selectImpressiveOption(){
        elementsSteps.navigateToRadioButtons();
        elementsSteps.clickImpressiveRadioButton();
        elementsSteps.verifyImpressiveMsg("You have selected Impressive");
    }
    @Test
    public void selectNoOption(){
        elementsSteps.navigateToRadioButtons();
        elementsSteps.clickNoRadioButton();}
        //No button doesn't work - how to assert?

    //WebTables Tests
    //Valid Add people to WebTableTest
    @Test
    public void validAddPeopleToWebTable() {
        elementsSteps.navigateToWebTableAndAdd();
        elementsSteps.fillInWebTableUserInfo("Diana", "Romosan", "romosandiana@gmail.com", "25", "20", "OFA");
        elementsSteps.clickSubmitButton();
        elementsSteps.verifyIfNameIsAddedToWebTable("Diana", "Romosan");}

    //Buttons - validate buttons are working
    @Test
    public void buttonsWork() throws InterruptedException {
        elementsSteps.navigateToButtonsLink();
        elementsSteps.doubleClick();
        elementsSteps.doubleClickMsgIsEqual("You have done a double click");
        elementsSteps.switchToRightClickButton();
        elementsSteps.rightClick();
        Thread.sleep(2000);
        elementsSteps.rightClickMsgIsEqual("You have done a right click");

    }
    //Links - Home Link is opening in new window
    @Test
    public void validHomeLink(){
        elementsSteps.navigateToLink();
        elementsSteps.clickHomeButton();
        elementsSteps.checkNewTabOpens();
    }
    //Broken Links - Images
    @Test
    public void BrokenLink(){
        //elementsSteps.navigateToBrokenLinksAndImg();

    }

    //Download and upload
    @Test
    public void downloadFileWorks(){
        elementsSteps.navigateToDownloadAndUpload();
        elementsSteps.clickDownloadButton();
        elementsSteps.verifyFileIsDownloaded("C:\\Users\\dianaromosan\\Downloads","sampleFile");
    }
    @Test
    public void uploadFileWorks(){
        elementsSteps.navigateToDownloadAndUpload();
        elementsSteps.clickUploadButton();
    }

    //Forms Tests
    @Test
    public void openForm(){
        elementsSteps.navigateToPracticeForms();
    }

}
