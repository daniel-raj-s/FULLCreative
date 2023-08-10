package com.fullcreative.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.fullcreative.utils.CommonMethods;

public class TrelloLoginPage extends CommonMethods{

	WebDriver driver;
	public TrelloLoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	public void loginTrello() {
		driver.get("https://trello.com");
		sleep(5000);
		getElement(By.linkText("Log in")).click();
		getElement(By.id("user")).sendKeys("berzemelma@gufum.com");
		getElement(By.id("user")).submit();
		sleep(5000);
		getElement(By.id("password")).sendKeys("FullCreative@1");
		getElement(By.id("login-submit")).click();
		sleep(9000);
	}

}
