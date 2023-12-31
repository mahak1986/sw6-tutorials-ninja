package com.tutorialsninja.pages;


import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class LaptopsAndNoteBooksPage extends Utility {
    @CacheLookup
    @FindBy(linkText = "Laptops & Notebooks")
    WebElement laptopsAndNoteBooks;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Show AllLaptops & Notebooks')]")
    WebElement showAllLaptopsAndNotebooks;

    @CacheLookup
    @FindBy(xpath = "//a[text()='Show AllLaptops & Notebooks']")
    WebElement clickOnShowAllLaptopsAndNotebooks1;


    @CacheLookup
    @FindBy(xpath = "//p[@class ='price']")
    WebElement productsPrices;

    @CacheLookup
    @FindBy(xpath = "//h4/a")
    WebElement productsList;
    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement sortBy;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Laptops & Notebooks')]")
    WebElement laptopsAndNotebooksText;

    public String verifyTheTextLaptopsAndNotebooksOnPage(){
        return getTextFromElement(laptopsAndNotebooksText);
}

    public void mouseHoverOnLaptopsAndNoteBooksAndClick() {
        clickOnElement(laptopsAndNoteBooks);
    }

    public void clickOnShowAllLaptopsAndNotebooks() {
        clickOnElement(showAllLaptopsAndNotebooks);
    }
    public void clickOnShowAllLaptopsAndNotebooks1() {
        clickOnElement(clickOnShowAllLaptopsAndNotebooks1);
    }

    public ArrayList<Double> getProductsPriceList() {
        List<WebElement> products = driver.findElements(By.xpath("//p[@class ='price']"));
        ArrayList<Double> originalProductsPrice = new ArrayList<>();
        for (WebElement e : products) {
            String[] arr = e.getText().split("Ex Tax:");
            originalProductsPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        return originalProductsPrice;
    }

    public void selectSortByOption(String option) {
        selectByVisibleTextFromDropDown(sortBy, option);
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

