package com.fidex.stepDefinitions;

import com.fidex.utilities.BrowserUtils;
import com.fidex.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

    @Before
    public void setUp() {

        Driver.get().manage().window().maximize();
       // Driver.get().manage().

    }

    @After
    public void tearDown(Scenario scenario) {
        // Driver.closeDriver();
    }

}
