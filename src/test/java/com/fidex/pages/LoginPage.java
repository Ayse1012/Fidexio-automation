package com.fidex.pages;

import com.fidex.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    public LoginPage() {

        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "#login")
    public WebElement emailInput;

    @FindBy(css = "#password")
    public WebElement passwordInput;

    @FindBy(css = ".btn.btn-primary")
    public WebElement log_in;

   public void login(String email,String password){
       emailInput.sendKeys(email);
       passwordInput.sendKeys(password);
       log_in.click();
   }



}
