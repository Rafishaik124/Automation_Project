package com.vtiger.objectreposeter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {

//Declaration
	
@FindBy(xpath ="//img[@src='themes/softed/images/btnL3Add.gif']")
private WebElement LookupImg;

//Initialization

public OrganizationPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

//Utilization

public WebElement getLookupImg() {
	return LookupImg;
}
//Business Library
public void clickOnOrgLookUpImg() {
	LookupImg.click();
}
}
