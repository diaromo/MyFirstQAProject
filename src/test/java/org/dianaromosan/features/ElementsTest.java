package org.dianaromosan.features;

import net.thucydides.core.annotations.Steps;
import org.dianaromosan.steps.ElementsSteps;
import org.dianaromosan.utils.BaseTest;
import org.dianaromosan.utils.EnvironmentConstants;
import org.junit.Test;

public class ElementsTest extends BaseTest {

    @Steps
    private ElementsSteps elementsSteps;

    //Text box
    @Test
    public void validCredentialTest(){
        elementsSteps.navigateToTextBox();
        elementsSteps.setUserInformationFields(EnvironmentConstants.FIRST_NAME, EnvironmentConstants.USER_EMAIL, EnvironmentConstants.ADDRESS,"Cluj");
        elementsSteps.clickSubmitButton();
        elementsSteps.verifyForm(EnvironmentConstants.FIRST_NAME,EnvironmentConstants.ADDRESS,"Cluj");
        //Need to fix assert - invalid Element?
    }

    //Check box
    @Test
    public void homeCheckBoxIsChecked(){
        elementsSteps.navigateToCheckBox();
        elementsSteps.checkCheckBox();
        elementsSteps.verifyCheckBoxMsg("home");

    }
    @Test
    public void checkExpandButton(){
        elementsSteps.navigateToCheckBox();
        elementsSteps.clickExpandButton();
        elementsSteps.verifyTreeStructure("Office");
    }
    //Radio button
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
        elementsSteps.clickNoRadioButton();
        //No button doesn't work - how to assert?
    }
    
    //Web Tables
    @Test
    public void validAddPeopleToWebTable() {
        elementsSteps.navigateToWebTableLink();
        elementsSteps.clickAddButton();
        elementsSteps.fillInWebTableUserInfo(EnvironmentConstants.FIRST_NAME, EnvironmentConstants.LAST_NAME, EnvironmentConstants.USER_EMAIL, "25", "20", "OFA");
        elementsSteps.clickSubmitRegButton();
        elementsSteps.verifyIfNameIsAddedToWebTable(EnvironmentConstants.FIRST_NAME, EnvironmentConstants.LAST_NAME);
    }
    
    //Buttons
    @Test
    public void validDoubleAndRightButtonsTest() {

        elementsSteps.navigateToButtonsLink();
        elementsSteps.doubleClick();
        elementsSteps.doubleClickMsgIsEqual("You have done a double click");
        elementsSteps.switchToRightClickButton();
        elementsSteps.rightClick();
        elementsSteps.rightClickMsgIsEqual("You have done a right click");
    }
    
    //Links
    @Test
    public void validHomeLink(){
        elementsSteps.navigateToLink();
        elementsSteps.clickHomeButton();
        elementsSteps.checkNewTabOpens();
    }
    
    //Download and Upload
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
}
