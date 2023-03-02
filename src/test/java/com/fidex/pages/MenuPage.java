package com.fidex.pages;

import com.fidex.utilities.BrowserUtils;
import com.fidex.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MenuPage extends BasePage{

    @FindBy(css = ".nav.navbar-nav.navbar-left.oe_application_menu_placeholder>li>a>span")
    public List<WebElement> menuList;

    @FindBy(css = "#menu_more_container>a")
    public WebElement more;

    @FindBy(css = "#menu_more>li")
    public List<WebElement> moreList;

    @FindBy(xpath = "(//span[contains(text(),'Sales')])[1]")
    public WebElement sales;

    @FindBy(xpath = "(//span[contains(text(),'Calendar')])[1]")
    public WebElement calendar;

    @FindBy(xpath = "Then The user click to import")
    public WebElement buttonList;

    @FindBy(xpath = "//table/thead/tr/th/div/input")
    public WebElement salesCheckbox;

    @FindBy(css = ".btn.btn-sm.btn-default.o_button_import")
    public WebElement ımport;

    @FindBy(xpath = "//li[text()='Import a File']")
    public WebElement getImport;

    @FindBy(xpath = "//span[contains(text(),'Vehicles')]")
    public List<WebElement> vehicleList;

    public void navigateMenu(String menu){
        WebElement locat= Driver.get().findElement(By.xpath("//span[contains(text(),'"+menu+"')]"));

        locat.click();
    }








}
