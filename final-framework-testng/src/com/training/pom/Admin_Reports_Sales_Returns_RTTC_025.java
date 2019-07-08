package com.training.pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin_Reports_Sales_Returns_RTTC_025 {
private  WebDriver driver; 
//public WebElement element;


	public Admin_Reports_Sales_Returns_RTTC_025(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@class='fa fa-bar-chart-o fw']")
	private WebElement reports; 
	
	@FindBy(xpath="//a[text()='Sales']")
	private WebElement sales;
	
	@FindBy(xpath="//*[@id=\"menu-report\"]/ul/li[1]/ul/li[4]/a")
	private WebElement returns;
	
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
	public void clickReturnsLink() throws InterruptedException
	{
		this.returns.click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;         
		js.executeScript("arguments[0].style.border='3px solid red'", returns); 
		
		}
	
	public void clickOnGroupByWeek() throws InterruptedException {
		this.week.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;         
		js.executeScript("arguments[0].style.border='3px solid red'", week); 
		
	}
	public void filterButtonClick() throws InterruptedException {
		this.filterButton.click();
		Thread.sleep(3000);
		
			//draw the border
			JavascriptExecutor js = (JavascriptExecutor) driver;         
			js.executeScript("arguments[0].style.border='3px solid red'", filterButton); 
			
		

	}
	/*public  void javascript_draw_border(WebElement element)
	{
		//draw the border
		JavascriptExecutor js = (JavascriptExecutor) driver;         
		js.executeScript("arguments[0].style.border='3px solid red'", element); 
		
	}*/


}
