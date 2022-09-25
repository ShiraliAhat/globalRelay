package com.globalRelay.Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"json:target/cucumber.json",
                "html:target/cucumber.html",
                "rerun:target/rerun.txt"},
        features = "src/test/resources/Features/UI",
        glue = "com/globalRelay/step_definitions",
        tags = "",
        dryRun = false




)
public class CukesRunner {

}
