package com.fidex.pages;

import com.fidex.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class VehiclesPage extends BasePage{



    @FindBy(xpath = "//span[contains(text(),'Fleet')]")
    public WebElement fleet;

    @FindBy(xpath = "//span[contains(text(),'Discuss')]")
    public WebElement discuss;


    @FindBy(xpath = "//span[contains(text(),'Vehicles')]")
    public List<WebElement> vehicleList;

    public void navigateMenu(String menu){
        WebElement locat= Driver.get().findElement(By.xpath("//span[contains(text(),'"+menu+"')]"));

        locat.click();
    }



}
