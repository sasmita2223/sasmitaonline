package com.training.pom;

import java.text.SimpleDateFormat;	//for date
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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
				
				
				//****************complex-sales-orders-RTTC_085***************************
	
	
	//order_ID text box
	@FindBy(id="input-order-id")
	private WebElement oredrIdText;
	
	public void enterValOrderIDText(String oredrIdText) {
		this.oredrIdText.sendKeys(oredrIdText);
	}
	
	//select value for order_status check box
	@FindBy(id="input-order-status")
	private WebElement orderStatus;
	
	public void clickOnOrderStatus(String orderStatus) {
		this.orderStatus.click();
		
		Select sel = new Select(this.orderStatus);
		sel.selectByVisibleText(orderStatus);
		this.orderStatus.sendKeys(orderStatus);
		
				
	}
	
	//click on Date Added
	@FindBy(id="input-date-added")
	private WebElement dateAdded;
	
	public void clickOnDateAdded(String dateAdded) {
		this.dateAdded.click();
		this.dateAdded.sendKeys(dateAdded);
		
		//to print the date from the excell to the UI
		/*SimpleDateFormat date = new SimpleDateFormat("MMM dd, yyyy");
		date.format(this.dateAdded);
		this.dateAdded.sendKeys(dateAdded); */
	}	
	//enter value from calender
	
		
	//enter value for customer text_box
	@FindBy(xpath="//input[@id='input-customer']")
	private WebElement customer;
	
	public void enterValForCustomer(String customer) {
		this.customer.sendKeys(customer);
		
		
	}
		
	//enter value for total text_box
	@FindBy(id="input-total")
	private WebElement totalTextBox;
	
	public void enterValaTotalTextBox(String totalTextBox) {
		this.totalTextBox.sendKeys(totalTextBox);
	}
	
	//click on calender icon for date_modified listBox
	@FindBy(id="input-date-modified")
	private WebElement dateModified;
	
	public void clickOnDateModified(String dateModified) {
		this.dateModified.click();
		this.dateModified.sendKeys(dateModified);
		
	}
	
	//select value from date_modified
	
	//click on filter button
	@FindBy(xpath="//i[@class='fa fa-filter']")
	private WebElement filterButton;
	
	public void clickOnFilterButton() {
		this.filterButton.click();
	}
	
	
	
	
	
	
}
