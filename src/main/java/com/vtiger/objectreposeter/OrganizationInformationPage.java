package com.vtiger.objectreposeter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationInformationPage {

//Declaration
@FindBy(xpath ="//span[@class='dvHeaderText']")
private WebElement OrgHeaderText;

//Initialization
public OrganizationInformationPage(WebDriver driver) {
PageFactory.initElements(driver,this);
}

//Utilization
public WebElement getOrgHeaderText() {
	return OrgHeaderText;
}
//Business Library
public String getHeader() {
	return OrgHeaderText.getText();
}
}
