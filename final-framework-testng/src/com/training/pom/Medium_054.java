package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Medium_054 {
private WebDriver driver;

	
	public Medium_054(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
}
	//navigate from sales->orders->add new button
	@FindBy(xpath="//i[@class='fa fa-shopping-cart fw']") //sales icon
	private WebElement salesIcon;
	@FindBy(xpath="//*[@id=\"menu-sale\"]/ul/li[1]/a") //orders
	private WebElement ordersIcon;
	@FindBy(xpath="//i[@class='fa fa-plus']") //add new button
	private WebElement addNewButton;
	
	//customer details page
	@FindBy(id="input-firstname") //firstname
	private WebElement firstName;
	@FindBy(id="input-lastname") //last-name
	private WebElement lastName;
	@FindBy(id="input-email") //email
	private WebElement email;
	@FindBy(id="input-telephone") //telephone
	private WebElement telephone;
	@FindBy(id="button-customer") //continue button
	private WebElement continueButton;
	
	//products page
	@FindBy(xpath="//*[text()='Choose Product']")
	private WebElement chooseProduct;
	@FindBy(xpath="//*[@id=\"tab-product\"]/fieldset/div[1]/div/ul/li/a") //choose product
	private WebElement chooseProduct1;
	@FindBy(id="input-quantity")		//choose quantity
	private WebElement quantity;
	@FindBy(id="button-product-add")	//add product button
	private WebElement addProduct; 
	@FindBy(id="button-cart")	
	private WebElement continueButton1;	//continue
	
	//payments details page
	@FindBy(id="input-payment-firstname")
	private WebElement paymentFirstName;
	@FindBy(id="input-payment-lastname")
	private WebElement paymentLastName;
	@FindBy(id="input-payment-address-1")
	private WebElement paymentAddress1;
	@FindBy(id="input-payment-address-2")
	private WebElement paymentAddress2;
	@FindBy(id="input-payment-city")
	private WebElement paymentCity;
	@FindBy(id="input-payment-postcode")
	private WebElement paymentPostCode;
	@FindBy(xpath="//option[contains(text(),'India')][2]") //country
	private WebElement country;
	@FindBy(xpath="//option[contains(text(),'Karnataka')]") //state
	private WebElement state;
	@FindBy(xpath="//*[@id='button-payment-address']")
	private WebElement continueButton2;
	
	//shipping details page
	//shipping first-name
	@FindBy(id="input-shipping-firstname") //SHIPPING FIRSTNAME
	private WebElement shippingFirstName;
	//shipping last-name
	@FindBy(id="input-shipping-lastname")
	private WebElement shippingLastName;
	//shipping address1
	@FindBy(id="input-shipping-address-1")
	private WebElement shippingAddress1;
	//shipping address2
	@FindBy(id="input-payment-address-2")
	private WebElement shippingAddress2;
	//shipping city
	@FindBy(id="input-shipping-city")
	private WebElement shippingCity;
	//shipping postal-code
	@FindBy(id="input-shipping-postcode")
	private WebElement shippingPostCode;
	//shipping country
	@FindBy(xpath="//select[@id='input-shipping-country']") //country
	private WebElement shippingCountry;
	//shipping state
	@FindBy(xpath="//select[@id='input-shipping-zone']") //state
	private WebElement ShippingState;
	//shipping continue button
	@FindBy(xpath="//*[@id='button-shipping-address']")
	private WebElement shippingContinueButton2;
	
	//totals page
	@FindBy(xpath="//*[@id=\"tab-total\"]/fieldset/div[1]/label") //shipping method
	private WebElement totalShippingMethod;
	@FindBy(xpath="//select[@id='input-shipping-method']")
	private WebElement freeShipping;
	
	@FindBy(xpath="//*[@id=\"tab-total\"]/fieldset/div[2]/label") //payment method
	private WebElement totalPaymentMethod;
	@FindBy(xpath="//*[@id=\"input-payment-method\"]/option[3]")		//cash on delivery
	private WebElement cashOnDelivery;
	
	@FindBy(id="button-save")		//click on save button
	private WebElement saveButton;
		
	//methods
	public void cilckSalesIcon() throws InterruptedException {
		this.salesIcon.click();
		Thread.sleep(2000);
	}
	public void clickOrdersIcon() throws InterruptedException {
		this.ordersIcon.click();
		Thread.sleep(3000);
	}
	public void clickAddNewButton() throws InterruptedException{
		this.addNewButton.click();
		Thread.sleep(2000);
			}
	
	//customer details page
	public void enterFirstName(String firstName) throws InterruptedException {
		this.firstName.sendKeys(firstName);
		Thread.sleep(2000);
	}
	public void enterLastName(String lastName) throws InterruptedException {
		this.lastName.sendKeys(lastName);
		Thread.sleep(2000);
	}
	public void enterEmail(String email) throws InterruptedException {
		this.email.sendKeys(email);
		Thread.sleep(2000);
	}
	//enter phone number
	public void enterTelephoneNum(String telephone) throws InterruptedException {
		this.telephone.sendKeys(telephone);
		Thread.sleep(4000);
	}
	//click on continue button
	public void clickContinue() throws InterruptedException {
		this.continueButton.click();
		//Thread.sleep(4000);
	}
	
	
	//products page
	//go to choose product option
	public void ChooseProduct() throws InterruptedException {		
		this.chooseProduct.click();
		Thread.sleep(5000);
		
	}
	//click & choose the product
	public void selectChooseProduct1() {		
		this.chooseProduct1.click();
	}
	//add the quantity to the quantity box
	public void enterQuantity(String quantity) {
		this.quantity.sendKeys(quantity);
	}
	//click on add product button
	public void clickAddProductButton() {
		this.addProduct.click();
	}
	//click on continue button
	public void clickContinueButton() {
		this.continueButton1.click();
	}
	//payments details page:
	//payments detail page: enter the firstname
	public void enterPaymentFirstName(String paymentFirstName) {
		this.paymentFirstName.sendKeys(paymentFirstName);
	}
	//payments detail page: enter the lastname
	public void enterPaymentLastName(String paymentLastName) {
		this.paymentLastName.sendKeys(paymentLastName);
	}
	//payments detail page: enter the address1
	public void enterPaymentAddress1(String paymentAddress1) {
		this.paymentAddress1.sendKeys(paymentAddress1);
	}
	//payments detail page: enter the address2
	public void enterPaymentAddress2(String paymentAddress2) {
	this.paymentAddress2.sendKeys(paymentAddress2);
	}
	//payments detail page: enter the city text box
	public void enterPaymentCityTextBox(String paymentCity) {
	this.paymentCity.sendKeys(paymentCity);
	}
	//payments detail page: enter the post code text box
	public void enterPaymentPostCodeTextBox(String paymentPostCode) {
		this.paymentPostCode.sendKeys(paymentPostCode);
	}
	//select country
	public void paymentSelectCountry() {
		this.country.click();
	}
	//select state
	public void paymentSelectState() {
		this.state.click();
	}
	//click on continue button
	public void paymentClickOnContinueButton2() {
		this.continueButton2.click();
	}
	//shipping details page
	//shipping first-name
		
		public void enterShippingFirstName(String shippingFirstName) throws InterruptedException {
			this.shippingFirstName.sendKeys(shippingFirstName);
			Thread.sleep(2000);
		}
		//shipping last-name
		public void enterShippingLastName(String shippingLastName) throws InterruptedException {
			this.shippingLastName.sendKeys(shippingLastName);
			Thread.sleep(2000);
		}
		//shipping address1
		public void enterShippingAddress1(String shippingAddress1) throws InterruptedException {
			this.shippingAddress1.sendKeys(shippingAddress1);
			Thread.sleep(2000);
		}
		//shipping address2
		public void enterShippingAddress2(String shippingAddress2) throws InterruptedException {
				
			this.shippingAddress2.sendKeys(shippingAddress2);
			Thread.sleep(2000);
			}
		//shipping city
		public void selectShippingCity(String shippingCity) throws InterruptedException {
			this.shippingCity.sendKeys(shippingCity);
			Thread.sleep(2000);
		}
		//shipping postal-code
		public void selectShippingPostCode(String shippingPostCode) throws InterruptedException {
			this.shippingPostCode.sendKeys(shippingPostCode);
			Thread.sleep(5000);
		}
		//shipping country
		
		public void selectShippingCountry() throws InterruptedException {
			//WebElement shippingCountry = driver.findElement(By.xpath("//option[contains(text(),'India')][2]"));
	        //This will scroll the page Horizontally till the element is found	
			JavascriptExecutor js = (JavascriptExecutor) driver; 
	        js.executeScript("arguments[0].scrollIntoView();", this.shippingCountry); 
			Select sel = new Select(this.shippingCountry);
			sel.selectByVisibleText("India");
			
			//this.shippingCountry.click();
			Thread.sleep(5000);
		}
		//shipping state
		public void selectShippingState() throws InterruptedException {
			Select sel1 = new Select(this.ShippingState);
			sel1.selectByVisibleText("Karnataka");
			
			//this.ShippingState.click();
			
			Thread.sleep(2000);
		}
		//shipping continue button
		public void clickShippingContinueButton2() throws InterruptedException {
			this.shippingContinueButton2.click();
			Thread.sleep(2000);
		}
		
	
	//totals page
	//click on shipping-method
	public void clickOntotalShippingMethod() {
		this.totalShippingMethod.click();
	}
	//click on free shipping
	public void clickOnFreeShipping() {
		Select sel2 = new Select(this.freeShipping);
		sel2.selectByVisibleText("Free Shipping - Rs.0");
		
		
		//this.freeShipping.click();
	}
	//click on total payment method
	public void clickOnTotalPaymentMethod() {
		this.totalPaymentMethod.click();
	}
	//click on cash-on-delivery
	public void clickOnCashOnDelivery() {
		this.cashOnDelivery.click();
	}
	//click on save-button
	public void clickOnSaveButton() {
		this.saveButton.click();
	}
	
	
}