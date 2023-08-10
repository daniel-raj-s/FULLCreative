package com.fullcreative.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.fullcreative.utils.CommonMethods;

public class BoardPage extends CommonMethods {

	WebDriver driver;
	By createBtn = By.xpath("//button[@aria-label='Create board or Workspace']");
	By createBoardBtn = By.xpath("//button[@data-testid='header-create-board-button']");
	By boardTitleInp = By.xpath("//input[@data-testid='create-board-title-input']");
	By submitBtn = By.xpath("//button[@data-testid='create-board-submit-button']");
	By cardBoxInp = By.xpath("//a[@data-testid='trello-card']");
	By listField2 = By.xpath("(//div[@class='list-cards u-fancy-scrollbar js-list-cards js-sortable ui-sortable'])[2]");
	By listTitleInp = By.xpath("//input[@name='name']");
	By addListBtn = By.xpath("(//span[text()='Add a card'])[1]");
	By addCardTitleInp = By.xpath("//textarea[@placeholder='Enter a title for this card…']");
	By addCardBtn = By.xpath("//input[@value='Add card']");
	By cancelBtn = By.xpath("(//a[contains(@class,'js-cancel')])[1]");

	public BoardPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public void createBoard(String BoardTitle) {
		clickElement(createBtn);
		sleep(5000);
		clickElement(createBoardBtn);
		sleep(5000);
		getElement(boardTitleInp).sendKeys(BoardTitle);
		clickElement(submitBtn);
		sleep(5000);
		
	}

	public void createList(String listName) {
		getElement(listTitleInp).sendKeys(listName);
		getElement(listTitleInp).submit();
	}

	public void createCard(String CardName) {
		clickElement(addListBtn);
		sleep(5000);
		getElement(addCardTitleInp).sendKeys(CardName);
		sleep(5000);
		clickElement(addCardBtn);
		getElement(cancelBtn).click();
		sleep(5000);
	}

	public void dragAndDropCard() {
		action.dragAndDrop(getElement(cardBoxInp), getElement(listField2)).build().perform();
	}

	public void getCardCoordinates() {
		WebElement element = driver.findElement(By.xpath("//div[@class='list-card-details js-card-details']"));
		// Get x and y coordinates of the element
		int xCoordinate = element.getLocation().getX();
		int yCoordinate = element.getLocation().getY();
		System.out.println("X Coordinate: " + xCoordinate);
		System.out.println("Y Coordinate: " + yCoordinate);
		// Close the browser when done
	}

}
