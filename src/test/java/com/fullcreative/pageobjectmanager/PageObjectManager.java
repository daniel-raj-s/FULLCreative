package com.fullcreative.pageobjectmanager;

import org.openqa.selenium.WebDriver;

import com.fullcreative.pages.BoardPage;
import com.fullcreative.pages.TrelloLoginPage;

public class PageObjectManager {

	private WebDriver driver;
	private BoardPage boardPage;
	private TrelloLoginPage trelloLoginPage;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public TrelloLoginPage getTrelloLoginPage() {
		return (trelloLoginPage == null) ? trelloLoginPage = new TrelloLoginPage(driver) : trelloLoginPage;

	}

	public BoardPage getBoardPage() {
		return (boardPage == null) ? boardPage = new BoardPage(driver) : boardPage;

	}

}
