package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin_Reports_Sales_RTTC_022 {
	
private WebDriver driver; 
	
	public Admin_Reports_Sales_RTTC_022(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@class='fa fa-bar-chart-o fw']")
	private WebElement reports; 
	
	@FindBy(xpath="//a[text()='Sales']")
	private WebElement sales;
	
	@FindBy(xpath="//*[@id=\"menu-report\"]/ul/li[1]/ul/li[1]/a")
	private WebElement orders;
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
	public void clickOrdersLink() throws InterruptedException	{
	this.orders.click();
	Thread.sleep(2000);
		
/*	WebElement sales = driver.findElement(By.className("Sales"));
		scroll(sales,driver);
		public void scroll(WebElement element, WebDriver driver)
		{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollINtoView(true)", element); 
		} */
	
	}
	
	public void clickOnGroupBy() throws InterruptedException {
		this.week.click();
		Thread.sleep(3000);
	}
	public void filterButtonClick() throws InterruptedException {
		this.filterButton.click();
		Thread.sleep(3000);
	}

}
