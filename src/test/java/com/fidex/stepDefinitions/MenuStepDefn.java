package com.fidex.stepDefinitions;

import com.fidex.pages.MenuPage;
import com.fidex.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class MenuStepDefn {
    MenuPage menuPage =new MenuPage();

    @When("The user see following options")
    public void the_user_see_following_options(List<String> expectedMenuList) {
        BrowserUtils.waitFor(4);

        List<String> actualMenuList=BrowserUtils.getElementsText(menuPage.menuList);

        if (menuPage.more.isDisplayed()){
            menuPage.more.click();
            BrowserUtils.waitFor(2);
            actualMenuList.addAll(BrowserUtils.getElementsText(menuPage.moreList));

        }
        System.out.println("actualMenuList = " + actualMenuList);
        Assert.assertEquals(expectedMenuList,actualMenuList);


    }

    @When("The user click to sales")
    public void the_user_click_to_sales() {
        BrowserUtils.waitFor(2);
        menuPage.sales.click();
        BrowserUtils.waitFor(3);
    }

    @Then("The user click to checkbox")
    public void the_user_click_to_checkbox() {

       // BrowserUtils.waitForClickablility(menuPage.salesCheckbox,10);
        BrowserUtils.waitFor(4);
        menuPage.salesCheckbox.click();

        Assert.assertTrue(menuPage.salesCheckbox.isSelected());

    }

    @Then("The user click to import")
    public void theUserClickToImport() {
        menuPage.ımport.click();
        System.out.println("menuPage.getImport.getText() = " + menuPage.getImport.getText());
        Assert.assertEquals(menuPage.getImport.getText(),"Import a File");
    }

    @When("The user click to {string}")
    public void theUserClickTo(String calendar) {

        menuPage.navigateMenu(calendar);
        BrowserUtils.waitFor(6);
    }

    @Then("The user click to list")
    public void theUserClickToList() {
        menuPage.buttonList.click();
        BrowserUtils.waitFor(2);
    }
}
