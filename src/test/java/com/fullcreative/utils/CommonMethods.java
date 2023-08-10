package com.fullcreative.utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fullcreative.pageobjectmanager.PageObjectManager;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonMethods {

	protected WebDriver driver;
	protected Actions action;
	protected JavascriptExecutor js;
	protected PageObjectManager pageObjectManager;
	WebDriverWait wait;

	
	public void startBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		pageObjectManager = new PageObjectManager(driver);
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
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		return element;
	}

	public void clickElement(By by) {
		try {
			wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(by));
			element.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", getElement(by));
			// TODO Auto-generated catch blocks
		}
	}

}
