package org.example;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {

    @FindBy(id = "Email")
    private WebElement EmailInput;

    @FindBy(id = "Password")
    private WebElement PasswordInput;
}
