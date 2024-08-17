package com.vtiger.genericutilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.vtiger.objectreposeter.HomePage;
import com.vtiger.objectreposeter.LoginPage;

public class Base {
public PropertyFileUtility putil=new PropertyFileUtility();
public excelfileUtility eutil=new excelfileUtility();
public Javautility jutil=new Javautility();
public WebDriverUtility wbutil=new WebDriverUtility();
//runtime polymorphism
public WebDriver driver=null;
@BeforeSuite
public void bsconfig() {
	Reporter.log("==DataBase Connection==",true);
}
@AfterSuite
public void asconfig() {
	Reporter.log("==DataBase Disconnection",true);
}
@BeforeClass
public void bcconfig() throws Throwable {
	String BROWSER = putil.readDataFromPF("browser");
	String URL = putil.readDataFromPF("url");
	if (BROWSER.equals("chrome")) {
		driver=new ChromeDriver();
		Reporter.log("Chrome browser has launched",true);
	}
	else if (BROWSER.equals("edge")) {
		driver=new EdgeDriver();
		Reporter.log("Edge browser has launched",true);
	}
	else if(BROWSER.equals("firefox")) {
		driver=new FirefoxDriver();
		Reporter.log("Firefox browser has launched",true);
	}
	else {
		Reporter.log("U have given invalid browser name into propertyfile",true);
	}
	driver.get(URL);
	wbutil.maximizewindow(driver);
	wbutil.waitForpageload(driver);
	Reporter.log("Open the url",true);
	}
@AfterClass
public void acconfig() {
	driver.quit();
	Reporter.log("Close the Browser",true);
}
@BeforeMethod
public void bmconfig() throws Throwable {
	String UN = putil.readDataFromPF("un");
	String PWD = putil.readDataFromPF("pwd");
	LoginPage lp=new LoginPage(driver);
	lp.LogintoApp(UN, PWD);
	Reporter.log("User login Successfully",true);
}
@AfterMethod
public void amconfig() {
	HomePage hp=new HomePage(driver);
	hp.logoutFromApp(driver);
	Reporter.log("User logout successfully",true);
}
}

