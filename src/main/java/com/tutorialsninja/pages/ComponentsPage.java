package com.tutorialsninja.pages;


import com.tutorialsninja.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ComponentsPage extends Utility {
    private static final Logger log = LogManager.getLogger(ComponentsPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[3]/a[1]")
    WebElement components;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Show AllComponents')]")
    WebElement showAllComponents;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Components')]")
    WebElement componentText;

    public String verifyTheTextComponentsOnPage(){
        log.info("Verify components text on homepage : " + componentText.toString());
        return getTextFromElement(componentText);
    }

    public void mouseHoverOnComponentsAndClick(){
        clickOnElement(components);
        log.info("Mouse hover on components and click : " + components.toString());

    }
    public void clickOnShowAllComponents(){
        clickOnElement(showAllComponents);
        log.info("Click on show all components : " + showAllComponents.toString());

    }

}
