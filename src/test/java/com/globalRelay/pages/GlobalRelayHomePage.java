package com.globalRelay.pages;

import com.globalRelay.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GlobalRelayHomePage {

    public GlobalRelayHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='user-icon login-link']")
    public WebElement LoginBtn;
}
