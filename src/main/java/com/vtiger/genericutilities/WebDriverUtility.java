package com.vtiger.genericutilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class WebDriverUtility {
	/**
	 * This method is used to Maximize the Window
	 * @param driver
	 * author Rafi
	 */
public void maximizewindow(WebDriver driver) {
	driver.manage().window().maximize();
}
/**
 * This method is uesd to minimize the window
 * @param driver
 */
public void minimizewindow(WebDriver driver) {
	driver.manage().window().minimize();
}
/**
 * This method is used to wait till entire the page is loaded
 * @param driver
 */
public void waitForpageload(WebDriver driver) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
/**
 * This method is used to handle the dropdown with the help of index
 * @param ele
 * @param index
 */
public void handleDropDown(WebElement ele,int index) {
	Select s=new Select(ele);
	s.selectByIndex(index);
}
/**
 * This method is used to handle the dropdown with the help of Value
 * @param ele
 * @param value
 */
public void handleDropDown(WebElement ele,String value) {
	Select s=new Select(ele);
	s.selectByValue(value);
}
/**
 * This method is used to handle the dropdown with the help of Text
 * @param text
 * @param ele
 */
public void handleDropDown(String text,WebElement ele) {
	Select s=new Select(ele);
	s.selectByVisibleText(text);
}
/**
 * This method is used to move the cursor
 * @param driver
 * @param element
 */
public void moveToElement(WebDriver driver,WebElement element) {
	Actions a=new Actions(driver);
	a.moveToElement(element).perform();  
}
/**
 * This method is used to right click operation
 * @param driver
 * @param element
 */
public void rightClickonelement(WebDriver driver,WebElement element) {
	Actions a=new Actions(driver);
	a.contextClick(element).perform();
}
/**
 * This method is used to click operation
 * @param driver
 * @param element
 */
public void doubleclickonelement(WebDriver driver,WebElement element) {
	Actions a=new Actions(driver);
	a.click(element).perform();
}
/**
 * This methos is used to drag source element to drop destination element
 * @param driver
 * @param srcele
 * @param destele
 */
public void DragandDrop(WebDriver driver,WebElement srcele,WebElement destele) {
	Actions a=new Actions(driver);
	a.dragAndDrop(srcele, destele).perform();
}
/**
 * This method is used to take the Screenshot
 * @param driver
 */
public void getscreenshot(WebDriver driver) {
	TakesScreenshot tc=(TakesScreenshot)driver;
	File src = tc.getScreenshotAs(OutputType.FILE);
	File dest=new File("./"+"\\Screenshots\\Vtiger.png");
	try {
		Files.copy(src, dest);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
     
}
