package com.vtiger.objectreposeter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatenewOrganizationPage {

//Declaration
@FindBy(xpath ="//input[@name='accountname']")private WebElement orgname;
@FindBy(xpath ="//input[@title='Save [Alt+S]']")private WebElement savebtn;

//Initialization
public CreatenewOrganizationPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

//Utilization
public WebElement getOrgname() {
	return orgname;
}

public WebElement getSavebtn() {
	return savebtn;
}
//Business Library
public void createNewOrgName(String ORGNAME) {
	orgname.sendKeys(ORGNAME);
	savebtn.click();
}
}
