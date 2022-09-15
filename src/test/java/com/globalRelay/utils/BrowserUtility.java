package com.globalRelay.utils;

import java.util.Set;

public class BrowserUtility {


    public static void switchToWindow(String targetTitle){
        String origin = Driver.getDriver().getWindowHandle();

        Set<String> windowHandles = Driver.getDriver().getWindowHandles();

        for (String each:windowHandles) {
            Driver.getDriver().switchTo().window(each);
            if (Driver.getDriver().getTitle().equals(targetTitle)){
               return;
            }

        }
        Driver.getDriver().switchTo().window(origin);


    }


}
