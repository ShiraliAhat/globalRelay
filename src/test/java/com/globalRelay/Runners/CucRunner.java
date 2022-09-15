package com.globalRelay.Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"json:target/cucumber.json","html:target/cucumber.html"},
        features = "src/test/resources/Features",
        glue = "com/globalRelay/step_definitions",
        dryRun = false




)
public class CucRunner {





}
