package com.fidex.stepDefinitions;

import com.fidex.pages.MenuPage;
import com.fidex.pages.VehiclesPage;
import com.fidex.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class VehicleStepDefn {
    VehiclesPage vehiclesPage=new VehiclesPage();
    MenuPage menuPage =new MenuPage();
    @When("The user click {string}")
    public void the_user_click(String fleet) {
         menuPage.more.click();
        vehiclesPage.navigateMenu(fleet);
        //vehiclesPage.fleet.click();
       // BrowserUtils.clickWithJS(vehiclesPage.fleet);
        BrowserUtils.waitFor(6);

    }

    @Then("The user see following option")
    public void the_user_see_following_option(List<String> expectedList) {
        System.out.println("expectedList = " + expectedList);
        List<String> actualVehicleList= BrowserUtils.getElementsText(vehiclesPage.vehicleList);
        System.out.println("actualVehicleList = " + actualVehicleList);
        BrowserUtils.waitFor(3);
        Assert.assertEquals(expectedList,actualVehicleList);
    }


}
