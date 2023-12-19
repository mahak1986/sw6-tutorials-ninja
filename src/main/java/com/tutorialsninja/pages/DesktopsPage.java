package com.tutorialsninja.pages;


import com.tutorialsninja.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class DesktopsPage extends Utility {
    private static final Logger log = LogManager.getLogger(DesktopsPage.class.getName());
    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement lookUpDesktops;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Show AllDesktops')]")
    WebElement showAllDesktops;

    @CacheLookup
    @FindBy(xpath = "//select[@id='input-sort']")
    WebElement sortByPosition;

    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement sortByPosition1;

    @CacheLookup
    @FindBy(xpath = "//h4/a")
    WebElement productsList;

    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement sortBy;

    @CacheLookup
    @FindBy(xpath= "//h2[normalize-space()='Desktops']")
    WebElement verifyDesktopsText;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='product-category']/div[@class='row']/div[@id='content']")
    WebElement products;

    public void selectProduct(String product) {
        mouseHoverToElementAndClick(products);
        log.info("Select product : " + products.toString());
}

    public String verifyDesktopsText(){
        log.info("Verify desktops text : " + verifyDesktopsText.toString());
        return getTextFromElement(verifyDesktopsText);
    }



    public void mouseHoverOnDesktopsAndClick() {
        clickOnElement(lookUpDesktops);
        log.info("Mouse hover on desktops and click : " + lookUpDesktops.toString());

    }

    public void clickOnShowAllDeskTops() {
        clickOnElement(showAllDesktops);
        log.info("Click on show all desktops : " + showAllDesktops.toString());
    }

    public void sortingDesktopsFromZtoA(String name) {
        selectByVisibleTextFromDropDown(sortByPosition, name);
        log.info("Select drop drop from Z to A : " + sortByPosition.toString());

    }
    public void sortingDesktopsFromAtoZ(String name) {
        selectByVisibleTextFromDropDown(sortByPosition1, name);
        log.info("Select drop drop from A to Z  : " + sortByPosition1.toString());

    }

    public ArrayList<String> getProductsNameList() {
        List<WebElement> products = driver.findElements(By.xpath("//h4/a"));
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
            System.out.println(products);
        }
        return originalProductsName;
    }
    public void selectSortByOption(String option) {
        selectByVisibleTextFromDropDown(sortBy, option);
        log.info("Select sort by option : " + sortBy.toString());
    }

    public void selectProductByName(String product) {
        List<WebElement> products = driver.findElements(By.xpath("//h4/a"));
        for (WebElement e : products) {
            if (e.getText().equals(product)) {
                e.click();
                break;
            }
        }
    }
}

