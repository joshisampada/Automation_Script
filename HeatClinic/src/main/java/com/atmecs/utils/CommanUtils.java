package com.atmecs.utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommanUtils
{
	
	
	public static void waitForElement(WebDriver driver, String locator) {
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		try {
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
		}
		catch(Exception exception) {
			
		}
		
	}
}
