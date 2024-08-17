package com.vtiger.objectreposeter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
//Declaration
	
@FindBy(xpath ="//input[@name='user_name']")private WebElement un;
@FindBy(xpath ="//input[@name='user_password']")private WebElement pwd;
@FindBy(xpath ="//input[@id='submitButton']")private WebElement loginbtn;

//Initialization

public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
//Utilization

public WebElement getUn() {
	return un;
}

public WebElement getPwd() {
	return pwd;
}

public WebElement getLoginbtn() {
	return loginbtn;
}
//Business Library
public void LogintoApp(String UN,String PWD) {
	un.sendKeys(UN);
	pwd.sendKeys(PWD);
	loginbtn.click();
}

}
