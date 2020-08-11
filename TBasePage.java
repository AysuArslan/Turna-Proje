package com.testinium.turna;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import javax.xml.xpath.XPath;
import java.lang.reflect.Array;
import java.util.List;

public class TBasePage {
    WebDriver driver;
    WebDriverWait wait;

    public TBasePage(WebDriver driver){
        this.driver = driver;
    }




    public void setById(String id, String value){
        WebElement element = new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
        element.clear();
        element.sendKeys(value);
    }

    public void setByXPath(String xPath, String value){
        WebElement element = new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xPath)));
        element.clear();
        element.sendKeys(value);
    }

    public void setByclassName(String className, String value){
        WebElement element = new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.className(className)));
        element.clear();
        element.sendKeys(value);
    }

    public void clickById(String id){
        WebElement element = new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.id(id)));
        driver.findElement(By.id(id)).click();
    }



    public void select(String id,String value){
        Select select= new Select(driver.findElement (By.id (id)));
        select.selectByValue (value);
    }



    public void clickByXpath(String xpath){
        WebElement element = new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().build().perform();
    }





    public List<WebElement> findElements(By by) {
        return driver.findElements(by);
    }




    public List<WebElement> getElementsByXpath(String s) {
        return new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//*[contains(@id, 'item-info-block')]"))));
    }





}