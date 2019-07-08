package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Medium_053 {
private WebDriver driver; 
	
	public Medium_053(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//i[@class='fa fa-shopping-cart fw']") //sales
	private WebElement sales;
	@FindBy(xpath="//*[@id=\"menu-sale\"]/ul/li[1]/a") //ordres
	private WebElement orders;
	@FindBy(xpath="//*[contains(text(),'Deepashree ')]//following-sibling::td[5]//a[1]")
	private WebElement view;
	@FindBy(xpath="//option[contains(text(),'Complete')]")
	private WebElement orderStatusComplete;
	@FindBy(xpath="//*[@id='button-history']")	//history-button
	private WebElement historyButton;
	
	//method
	public void clickOnSales() {
		this.sales.click();
	}
	public void clickOnOrders() {
		this.orders.click();
	}
	public void clickOnview() {
		this.view.click();
	}
	//selecting the order status as complete
	public void clickOnOrderStatusComplete() {
		this.orderStatusComplete.click();
	}
	//click on add history button
	public void clickOnAddHistoryButton() {
		this.historyButton.click();
	}

}
