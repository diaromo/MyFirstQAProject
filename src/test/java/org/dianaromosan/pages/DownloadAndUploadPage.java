package org.dianaromosan.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.dianaromosan.utils.BasePage;

import java.io.File;
import java.util.Objects;

@DefaultUrl("https://demoqa.com/upload-download")

public class DownloadAndUploadPage extends BasePage {

    @FindBy(css = "#downloadButton")
    private WebElementFacade downloadButton;
    @FindBy(id = "uploadFile")
    private WebElementFacade uploadButton;

    //Download
    public void clickDownloadButton() {

        clickOn(downloadButton);
    }

    public boolean isFileDownloaded(String downloadPath, String fileName) {
        File dir = new File(downloadPath);
        File[] dirContents = dir.listFiles();

        for (int i = 0; i < Objects.requireNonNull(dirContents).length; i++) {
            if (dirContents[i].getName().equals(fileName)) {
                // File has been found, it can now be deleted:
                dirContents[i].delete();
                return true;
            }
        }
        return false;
    }

    //Upload -> Need to continue
    public void sendKeysUpload() {

        upload("src/test/resources/files/text.txt").to(uploadButton);
    }
}

