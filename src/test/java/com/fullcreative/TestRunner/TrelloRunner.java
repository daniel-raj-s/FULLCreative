package com.fullcreative.TestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.fullcreative.pageobjectmanager.PageObjectManager;
import com.fullcreative.utils.CommonMethods;

public class TrelloRunner extends CommonMethods {
	
	@BeforeTest
	public void setUpBrowser() {
		startBrowser();
	}
	
	@Test
	public void trelloTest() {
		pageObjectManager.getTrelloLoginPage().loginTrello();
		sleep(5000);
		pageObjectManager.getBoardPage().createBoard("Test");
		sleep(5000);
		pageObjectManager.getBoardPage().createList("List A");
		sleep(5000);
		pageObjectManager.getBoardPage().createList("List B");
		sleep(5000);
		pageObjectManager.getBoardPage().createCard("Card 1");
		sleep(5000);
		pageObjectManager.getBoardPage().dragAndDropCard();
		sleep(7000);
		pageObjectManager.getBoardPage().getCardCoordinates();
	}
	
	@AfterTest
	void tearDown() {
		sleep(15000);
		driver.quit();
	}

}
