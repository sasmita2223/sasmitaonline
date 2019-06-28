package com.training.pom;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin_Reports_Sales_Shipping_RTTC_024 {
	private WebDriver driver; 
	
	
	public Admin_Reports_Sales_Shipping_RTTC_024(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@class='fa fa-bar-chart-o fw']")
	private WebElement reports; 
	
	@FindBy(xpath="//a[text()='Sales']")
	private WebElement sales;
	
	@FindBy(xpath="//a[text()='Shipping']")
	private WebElement shipping;
	
	@FindBy(xpath="//*[@id=\"input-group\"]/option[3]")
	private WebElement week;
	
	@FindBy(id="button-filter")
	private WebElement filterButton;
	
	public void clickReportLink() throws InterruptedException 
	{
		this.reports.click();
		Thread.sleep(2000);
	}
	public void clickSalesLink() throws InterruptedException {
		this.sales.click();
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		
		
	}
	public void clickShippingLink() throws InterruptedException
	{
		this.shipping.click();
		Thread.sleep(2000);
		}
	
	public void clickOnGroupByWeek() throws InterruptedException {
		this.week.click();
		Thread.sleep(2000);
	}
	public void filterButtonClick() throws InterruptedException {
		this.filterButton.click();
		Thread.sleep(3000);
	}
	
}
