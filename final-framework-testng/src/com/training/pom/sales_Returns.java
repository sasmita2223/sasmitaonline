package com.training.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sales_Returns {
private WebDriver driver; 
	
	public sales_Returns(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
}
	
	
	
	//click on sales_icon
	@FindBy(xpath="//i[@class='fa fa-shopping-cart fw']")
	private WebElement sales_icon;
	
	public void clickOnSalesIcon() {
		this.sales_icon.click();
	}
	
	//click on returns_link
	@FindBy(xpath="//li[@id='menu-sale']/ul/li[3]/a")
	private WebElement returnsLink;
	
	public void clickOnReturnsLink() {
		this.returnsLink.click();
	}
	//click on add button
	@FindBy(xpath="//i[@class='fa fa-plus']")
	private WebElement addButton;
	
	public void clickOnAddButton() {
		this.addButton.click();
	}
	//add product return page
	
	//enter order_id
		@FindBy(id="input-order-id")
		private WebElement orderID;
		
		public void enterOrderIdTextBox(String orderID) {
			this.orderID.sendKeys(orderID);
		}
	//enter customer
				@FindBy(id="input-customer")
				private WebElement customeTextBox;
				
				public void enterCustomerTextBox(String customeTextBox) {
					this.customeTextBox.sendKeys(customeTextBox);
				}
	//enter first_name
				@FindBy(id="input-firstname")
				private WebElement firstName;
				
				public void enterFirestNameTextBox(String firstName) {
					this.firstName.sendKeys(firstName);
				}
	//enter last_name
				@FindBy(id="input-lastname")
				private WebElement lastName;
				
				public void enterLasttNameTextBox(String lastName) {
					this.lastName.sendKeys(lastName);
				}
	//enter email
				@FindBy(id="input-email")
				private WebElement email;
				
				public void enterEmailTextBox(String email) {
					this.email.sendKeys(email);
				}	
	//enter telephone
				@FindBy(id="input-telephone")
				private WebElement telephoneNum;
				
				public void enterInputTelephoneTextBox(String telephoneNum) {
					this.telephoneNum.sendKeys(telephoneNum);
				}	
	//enter product text box
				@FindBy(id="input-product")
				private WebElement prodtctTextBox;
				
				public void enterProductTextBoxTextBox(String prodtctTextBox) {
					this.prodtctTextBox.sendKeys(prodtctTextBox);
				}	
		
	//enter model text box
				@FindBy(id="input-model")
				private WebElement modelTextBox;
				
				public void enterModelTextBoxTextBox(String modelTextBox) {
					this.modelTextBox.sendKeys(modelTextBox);
				}	
	//click on save button
				@FindBy(xpath="//i[@class='fa fa-save']")
				private WebElement saveButton;
				
				public void clickOnSaveButton() {
					this.saveButton.click();
				}	
				
	//select the customer name
				
				@FindBy(xpath="//*[contains(text(),'pri')]//preceding-sibling::td[3]")
				private WebElement cusName;
					
				public void clickCusName() throws InterruptedException {
					this.cusName.click();
					//this.cusName.isSelected();
					Thread.sleep(4000);		
									
				}
								
				
	//select the checkbox
				/* @FindBy(xpath="//*[contains(text(),'sas')]")
				private WebElement checkBox;
				
				public void selectCheckBox() {
					this.checkBox.click();
				} */
				
				
				
				
	//click on delete icon
				//@FindBy(xpath="//i[@class='fa fa-trash-o']")
				@FindBy(xpath="//button[@class='btn btn-danger']")
				private WebElement deleteButton;
				
				public void clickOnDeleteButton() throws InterruptedException {
					
				this.deleteButton.click();
				Thread.sleep(4000);
				
				Alert alert = driver.switchTo().alert();
				alert.accept();
				driver.navigate().refresh();
				
				}
	//click on ok button
				
				
				
		
}
