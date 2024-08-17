package com.vtiger.objectreposeter;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.genericutilities.WebDriverUtility;

public class HomePage extends WebDriverUtility{

//Declaration
	
@FindBy(linkText ="Organizations")
private WebElement organizationsLnk;

@FindBy(linkText ="Contacts")
private WebElement contactsLnk;

@FindBy(linkText ="Opportunities")
private WebElement opportunitiesLnk;

@FindBy(xpath ="//img[@src='themes/softed/images/user.PNG']")
private WebElement AdministratorImg;

@FindBy(linkText ="Sign Out")
private WebElement SignoutLnk;

//initialization

public HomePage(WebDriver driver) {
PageFactory.initElements(driver,this);
}

//Utilization

public WebElement getOrganizationsLnk() {
	return organizationsLnk;
}

public WebElement getContactsLnk() {
	return contactsLnk;
}

public WebElement getOpportunitiesLnk() {
	return opportunitiesLnk;
}

public WebElement getAdministratorImg() {
	return AdministratorImg;
}

public WebElement getSignoutLnk() {
	return SignoutLnk;
}
//Business Library
public void clickOnOrgLnk() {
	organizationsLnk.click();
}
public void clickOnContactLnk() {
	contactsLnk.click();
}
public void clickOnOpportunitiesLnk() {
	opportunitiesLnk.click();
}
public void logoutFromApp(WebDriver driver) {
	moveToElement(driver, AdministratorImg);
	SignoutLnk.click();
}
}
