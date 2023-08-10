package com.fullcreative.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.fullcreative.utils.CommonMethods;

public class TrelloLoginPage extends CommonMethods{

	public TrelloLoginPage(WebDriver driver) {
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	
	public void loginTrello() {
		driver.get("https://trello.com");
		getElement(By.linkText("Log in")).click();
		getElement(By.id("user")).sendKeys("berzemelma@gufum.com");
		getElement(By.id("user")).submit();
		getElement(By.id("password")).sendKeys("FullCreative@1");
		getElement(By.id("login-submit")).click();
	}

}
