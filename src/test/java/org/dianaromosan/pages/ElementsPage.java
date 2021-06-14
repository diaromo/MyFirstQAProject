package org.dianaromosan.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@DefaultUrl("https://demoqa.com")

public class  ElementsPage extends PageObject {

    //private WebDriver driver;

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
    private Object DoubleClickAction;

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

    //Text box Methods
    public void clickTextBoxLink(){clickOn(textBoxLink);}
    public void setUserNameField(String userName){typeInto(userNameField, userName);}
    public void setUserEmailField(String userEmail){typeInto(userEmailField,userEmail);}
    public void setCurrentAddressField(String currentAddress){typeInto(currentAddressField, currentAddress );}
    public void setPermanentAddressField(String permanentAddress){typeInto(permanentAddressField,permanentAddress);}
    public void clickSubmitButton(){clickOn(submitButton);}
    public void verifyTextBoxPageMsg(String message){ shouldContainText(message);}
    public void verifyUserInformation(String userInformation){shouldContainText(userInformation);}

    //CSS for Elements Check Box Tests
    @FindBy(css = "#item-1")
    private WebElementFacade checkBoxLink;
    @FindBy(css = ".rct-checkbox")
    private WebElementFacade checkBoxResult;
    @FindBy(css = "#result")
    private WebElementFacade checkBoxMsg;
    @FindBy (css = ".rct-icon-expand-all")
    private WebElementFacade expandButtonTree;
    @FindBy (css = "#tree-node")
    private WebElementFacade expandedTree;

    //Checkbox Methods
    public void clickCheckBoxLink(){clickOn(checkBoxLink);}
    public void checkCheckBoxIcon(){clickOn(checkBoxResult);}
    public void verifyCheckBoxMsg(String checkBoxMessage){shouldContainText(checkBoxMessage);}
    public void clickExpandButton(){clickOn(expandButtonTree);}
    public void verifyExpandedTreeMsg(String expandedTreeStructure){shouldContainText(expandedTreeStructure);}

    //CSS for Elements Radio Box Tests
    @FindBy(css = "#item-2")
    private WebElementFacade radioButtonLink;
    @FindBy(css = "#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(1) > div:nth-child(2) > label")
    private WebElementFacade yesRadioButton;
    @FindBy(css = "#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(1) > div:nth-child(3) > label")
    private WebElementFacade impressiveRadioButton;
    @FindBy(css ="##app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(1) > div.custom-control.disabled.custom-radio.custom-control-inline > label")
    private WebElementFacade noRadioButton;
    @FindBy(css = "div:nth-child(1) > p")
    private WebElementFacade yesConfirmationSelection;
    @FindBy (css = " div:nth-child(1) > p")
    private WebElementFacade impressiveConfirmationSelection;

    //Radio Buttons Methods
    public void clickRadioButtonLink(){clickOn(radioButtonLink);}
    public void clickYesRadioButton(){ clickOn(yesRadioButton);}
    public void verifyYesMsg(String yesMsg){shouldContainText(yesMsg);}
    public void clickImpressiveRadioButton(){clickOn(impressiveRadioButton);}
    public void clickNoRadioButton(){clickOn(noRadioButton);}
    public void verifyImpressiveMsg(String impressiveMsg){shouldContainText(impressiveMsg);}

    //CSS for WebTables Tests
    @FindBy(css = "#item-3")
    private WebElementFacade webTableButtonLink;
    @FindBy(css = "#addNewRecordButton")
    private WebElementFacade addButton;
    @FindBy (css = "#firstName")
    private WebElementFacade firstNameRegForm;
    @FindBy (css = "#lastName")
    private WebElementFacade lastNameRegForm;
    @FindBy (css = "#userEmail")
    private WebElementFacade userEmailRegForm;
    @FindBy (css = "#age")
    private WebElementFacade ageRegForm;
    @FindBy (css = "#salary")
    private WebElementFacade salaryRegForm;
    @FindBy (css = "#department")
    private WebElementFacade departmentRegForm;
    @FindBy (css = "#submit")
    private WebElementFacade submitRegButton;
    @FindBy(css=".rt-tbody .rt-tr:not(.-padRow)")
    private List<WebElementFacade> table;

    //Web Tables Methods
    public void clickWebTablesLink(){clickOn(webTableButtonLink);}
    public void clickAddButton(){clickOn(addButton);}
    public void setUserFirstNameReg(String firstNameReg){typeInto(firstNameRegForm, firstNameReg);}
    public void setUserLastNameReg(String lastNameReg){typeInto(lastNameRegForm, lastNameReg);}
    public void setUserEmailReg(String EmailReg){typeInto(userEmailRegForm, EmailReg);}
    public void setUserAgeReg(String ageReg){typeInto(ageRegForm, ageReg);}
    public void setSalaryReg(String salaryReg){typeInto(salaryRegForm, salaryReg);}
    public void setDepartmentReg(String departmentReg){typeInto(departmentRegForm, departmentReg);}
    public void clickSubmitRegButton(){clickOn(submitRegButton);}
    public boolean verifyNameIsAddedToWebTable(String firstName, String lastName) {
        for (WebElementFacade webElementFacade : table) {
            if (webElementFacade.findElement(By.cssSelector(".rt-td:nth-child(1)")).getText().equals(firstName) &&
                    webElementFacade.findElement(By.cssSelector(".rt-td:nth-child(2)")).getText().equals(lastName)) {
                return true;
            }
        }
        return false;
    }

    //CSS for Buttons
    //Double click
    @FindBy(css = "#item-4")
    private WebElementFacade buttonsLink;
    @FindBy(css = "#doubleClickBtn")
    private WebElementFacade doubleClick;
    @FindBy(css = "#doubleClickMessage")
    private WebElementFacade doubleClickMessage;
    //Right Click
    @FindBy(css = "#rightClickBtn")
    private WebElementFacade rightClickButton;
    @FindBy(css = "#rightClickMessage")
    private WebElementFacade rightClickMessage;
    //Continue with Click Me button


    public void clickButtonsLink(){clickOn(buttonsLink);}

    public void doubleClick(){
        Actions action = new Actions(getDriver());
        action.doubleClick(doubleClick).perform();

    }
    public void doubleClickMsgisEqual(String doubleClickMsg1){
        Assert.assertEquals(doubleClickMsg1, doubleClickMessage.getText());
    }

    public void switchToRightClick(){
        Actions action = new Actions(getDriver());
        action.moveToElement(rightClickButton).perform();
    }

    public void rightClick(){
        Actions action = new Actions(getDriver());
        action.contextClick(rightClickButton).perform();
    }
    public void rightClickMsgIsEqual(String rightClickMsg){
        Assert.assertEquals(rightClickMsg,rightClickMessage.getText());
    }

    //CSS Links
    @FindBy(css = "#item-5 > span")
    private WebElementFacade linksLink;
    @FindBy(css = "#simpleLink")
    private WebElementFacade homeButton;


    public void clickLinkButton(){clickOn(linksLink);}
    public void clickHomeButton(){clickOn(homeButton);}
    public void switchNewTab(){
            ArrayList<String> tabs2 = new ArrayList<String> (getDriver().getWindowHandles());
            System.out.println(tabs2);
            getDriver().switchTo().window(tabs2.get(1));
            getDriver().findElement(By.cssSelector("#app > div > div > div.home-banner > a > img"));
            getDriver().close();getDriver().switchTo().window(tabs2.get(0));}

    //Broken links - Images

    /*public void linkIsValidOrNot(){

        getDriver("https://demoqa.com/broken");

        List<WebElement> links = driver.findElements(By.tagName("a"));

        // This line will print the number of links and the count of links.
        System.out.println("No of links are "+ links.size());

        //checking the links fetched.
        for(int i=0;i<links.size();i++)
        {
            WebElement E1= links.get(i);
            String url= E1.getAttribute("href");
            verifyLinks(url);
        }

        driver.quit();

    }

    private void getDriver(String s) {
        driver.get("https://demoqa.com/broken");
    }

    public static void verifyLinks(String linkUrl)
    {
        try
        {
            URL url = new URL(linkUrl);

            //Now we will be creating url connection and getting the response code
            HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
            httpURLConnect.setConnectTimeout(5000);
            httpURLConnect.connect();
            if(httpURLConnect.getResponseCode()>=400)
            {
                System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage()+"is a broken link");
            }

            //Fetching and Printing the response code obtained
            else{
                System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
            }
        }catch (Exception e) {
        }
    }*/

    //CSS Download and Upload
    @FindBy(css = "#item-7 > span")
    private WebElementFacade uploadAndDownloadLink;
    @FindBy(css = "#downloadButton")
    private WebElementFacade downloadButton;
    @FindBy(css = "#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(1) > div.mt-3 > form > div > label")
    private WebElementFacade uploadButton;


    public void clickUploadAndDownloadLink(){clickOn(uploadAndDownloadLink);}
    //Download
    public void clickDownloadButton(){clickOn(downloadButton);}
    public boolean isFileDownloaded(String downloadPath, String fileName) {
        File dir = new File(downloadPath);
        File[] dirContents = dir.listFiles();

        for (int i = 0; i < dirContents.length; i++) {
            if (dirContents[i].getName().equals(fileName)) {
                // File has been found, it can now be deleted:
                dirContents[i].delete();
                return true;
            }
        }
        return false;
    }

    //Upload
    public void sendKeysUpload(){uploadButton.sendKeys("C:\\Users\\dianaromosan\\Downloads\\Diploma licenta Diana Romosan");}



}


















