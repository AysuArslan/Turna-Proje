package com.testinium.turna;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {

    WebDriver driver;

    @Before
    public void baglantiSagla(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\testinium\\IdeaProjects\\sample-java-project-1\\src\\test\\java\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();

    }

    @After
    public void baglantiKes() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    public void setById(String id, String value){
        driver.findElement(By.id(id)).clear();
        driver.findElement(By.id(id)).sendKeys(value);
    }

    public void setByclassName(String className, String value){
        driver.findElement(By.className(className)).clear();
        driver.findElement(By.className(className)).sendKeys(value);
    }

    public void setByName(String name, String value){
        driver.findElement(By.name(name)).sendKeys(value);

    }

    public void select(String id, String value){
        Select selectItem = new Select(driver.findElement(By.id(id)));
        selectItem.selectByValue(value);
    }

    public void selectClassName(String className, String value){
        Select selectItem = new Select(driver.findElement(By.className(className)));
        selectItem.selectByValue(value);
    }

    public void selectxPath(String xPath, String value){
        Select selectItem = new Select(driver.findElement(By.xpath(xPath)));
        selectItem.selectByValue(value);
    }

    public void clickById(String id){
        driver.findElement(By.id(id)).click();
    }

    public void clickByXpath(String xpath){
        WebDriverWait wait2 = new WebDriverWait(driver, 10);
        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        driver.findElement(By.xpath(xpath)).click();

    }




    public void getURL(String URL){
        driver.get(URL);
    }

    public void clickByClassname(String classname){

        driver.findElement(By.className(classname)).click();
    }

    public void setByXPath(String xPath, String value){
        WebElement element = new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xPath)));
        element.clear();
        element.sendKeys(value);
    }



}
