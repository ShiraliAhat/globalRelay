package com.globalRelay.pages;

import com.globalRelay.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GlobalRelayLoginPage {

    public GlobalRelayLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "loginId")
    public WebElement LoginID_InputBox;
}
