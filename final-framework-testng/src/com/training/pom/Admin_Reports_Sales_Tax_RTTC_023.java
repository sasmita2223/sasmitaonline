package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin_Reports_Sales_Tax_RTTC_023 {
	
private WebDriver driver; 
	
	public Admin_Reports_Sales_Tax_RTTC_023(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@class='fa fa-bar-chart-o fw']")
	private WebElement reports; 
	
	@FindBy(xpath="//a[text()='Sales']")
	private WebElement sales;
	
	@FindBy(xpath="//a[text()='Tax']")
	private WebElement tax;
	
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
	public void clickTaxLink() throws InterruptedException
	{
		this.tax.click();
		Thread.sleep(2000);
		}
	
	public void clickOnGroupByWeek() throws InterruptedException {
		this.week.click();
		Thread.sleep(2000);
	}
	public void filterButtonClick() throws InterruptedException {
		this.filterButton.click();
		Thread.sleep(2000);
	}


	

}
