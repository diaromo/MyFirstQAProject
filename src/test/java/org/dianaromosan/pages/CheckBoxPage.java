package org.dianaromosan.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.dianaromosan.utils.BasePage;

@DefaultUrl("https://demoqa.com/checkbox")

public class CheckBoxPage extends BasePage {

    @FindBy(css = ".rct-checkbox")
    private WebElementFacade checkBoxResult;
    @FindBy(css = "#result")
    private WebElementFacade checkBoxMsg;
    @FindBy(css = ".rct-icon-expand-all")
    private WebElementFacade expandButtonTree;
    @FindBy(css = "#tree-node")
    private WebElementFacade expandedTree;

    //Checkbox Methods
    public void checkCheckBoxIcon() {
        clickOn(checkBoxResult);
    }

    public void verifyCheckBoxMsg(String checkBoxMessage) {
        shouldContainText(checkBoxMessage);
    }

    public void clickExpandButton() {
        clickOn(expandButtonTree);
    }

    public void verifyExpandedTreeMsg(String expandedTreeStructure) {
        shouldContainText(expandedTreeStructure);
    }
}
