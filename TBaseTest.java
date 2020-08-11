package com.testinium.turna;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class TBaseTest extends BaseTest {
    protected WebDriver driver;

    @Test
    public void homePage() throws InterruptedException {
        getURL("https://www.turna.com");
        clickById("lb-way");
        TimeUnit.SECONDS.sleep(1);
        clickById("reSearchPassenger");
        TimeUnit.SECONDS.sleep(1);
        select ("select-list","2");
        TimeUnit.SECONDS.sleep(1);
        clickByXpath("//*[@id=\"flight-passenger-popup\"]/div[2]/div[3]/div[2]/div/span[2]/button");
        TimeUnit.SECONDS.sleep(1);
        clickByXpath("//*[@id=\"flight-passenger-popup\"]/div[2]/div[4]/div[2]/div/span[2]/button");
        TimeUnit.SECONDS.sleep(1);
        clickByXpath("//*[@id=\"flight-passenger-popup\"]/div[2]/div[5]/div[2]/div/span[2]/button");
        TimeUnit.SECONDS.sleep(1);
        clickByXpath("//*[@id=\"flight-passenger-popup\"]/div[2]/div[6]/div[2]/div/span[2]/button");
        TimeUnit.SECONDS.sleep(1);
        clickById("flight-from");
        TimeUnit.SECONDS.sleep(1);
        setById("flight-from", "istanbul");
        TimeUnit.SECONDS.sleep(1);
        clickById("flight-to");
        TimeUnit.SECONDS.sleep(1);
        setById("flight-to", "antalya");
        TimeUnit.SECONDS.sleep(1);
        clickByXpath("/html/body/div[1]/section[2]/form/div[1]/div/div[2]/div[2]/div[1]/input[1]");
        TimeUnit.SECONDS.sleep(1);
        clickByXpath("/html/body/div[1]/section[2]/form/div[1]/div/div[2]/div[2]/div[1]/input[1]");
        TimeUnit.SECONDS.sleep(1);
        clickByXpath("/html/body/div[17]/div[1]/table/tbody/tr[5]/td[6]/a");
        TimeUnit.SECONDS.sleep(1);
        clickByXpath("/html/body/div[17]/div[2]/table/tbody/tr[3]/td[2]/a");
        TimeUnit.SECONDS.sleep(1);
        clickById("btnSearch");
        TimeUnit.SECONDS.sleep(3);
        //Bilet Secimi
        clickByXpath("/html/body/div[1]/div[7]/div[2]/div[2]/div[4]/div[2]/div[2]/input");
        TimeUnit.SECONDS.sleep(1);
        clickByXpath("/html/body/div[1]/div[7]/div[2]/div[3]/div[2]/div[2]/div[2]/input");
        TimeUnit.SECONDS.sleep(1);
        clickByClassname("bt-choose");
        TimeUnit.SECONDS.sleep(1);
        //Yolcu Bilgileri
        //1.YOLCU
        clickByXpath("/html/body/div[1]/div[1]/div[5]/div[2]/div[1]/div[2]/div[2]/div/div[2]/label[2]/span");
        TimeUnit.SECONDS.sleep(3);
        setByXPath("/html/body/div[1]/div[1]/div[5]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/input","Aysu");
        TimeUnit.SECONDS.sleep(1);
        setByXPath("/html/body/div[1]/div[1]/div[5]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/input","Arslan");
        TimeUnit.SECONDS.sleep(1);
        selectxPath("/html/body/div[1]/div[1]/div[5]/div[2]/div[1]/div[2]/div[3]/div[2]/div/div[2]/div[1]/select","15");
        TimeUnit.SECONDS.sleep(1);
        selectxPath("/html/body/div[1]/div[1]/div[5]/div[2]/div[1]/div[2]/div[3]/div[2]/div/div[2]/div[2]/select","09");
        TimeUnit.SECONDS.sleep(1);
        selectxPath("/html/body/div[1]/div[1]/div[5]/div[2]/div[1]/div[2]/div[3]/div[2]/div/div[2]/div[3]/select","1991");
        TimeUnit.SECONDS.sleep(1);
        setByXPath("/html/body/div[1]/div[1]/div[5]/div[2]/div[1]/div[2]/div[4]/div[1]/div[2]/input","11111111111");
        TimeUnit.SECONDS.sleep(1);
        setByXPath("/html/body/div[1]/div[1]/div[5]/div[2]/div[1]/div[2]/div[4]/div[1]/div[3]/input","111111");
        TimeUnit.SECONDS.sleep(1);
        setById("txtPhone","5555555555");
        TimeUnit.SECONDS.sleep(1);
        setById("txtEmail","deneme@gmail.com");


    }



}
