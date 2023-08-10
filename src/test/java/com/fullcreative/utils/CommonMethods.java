package com.fullcreative.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.fullcreative.pageobjectmanager.PageObjectManager;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonMethods {

	protected static WebDriver driver;
	protected Actions action;
	protected static JavascriptExecutor js;
	protected PageObjectManager pageObjectManager;
	
	public void startBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		pageObjectManager = new PageObjectManager(driver);
		action = new Actions(driver);
		js = (JavascriptExecutor) driver;
	}
	
	public void sleep(long duration) {
		try {
			Thread.sleep(duration);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public WebElement getElement(By by) {
		return driver.findElement(by);
	}

	public static void clickElement(By by) {
		try {
			driver.findElement(by).click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", driver.findElement(by));
			// TODO Auto-generated catch blocks
		}
	}

}
