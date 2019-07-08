package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Medium_051 {
private WebDriver driver; 
	
	public Medium_051(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@class='fa fa-user fw']")		//customer icon
	private WebElement customersIcon; 
	
	@FindBy(xpath="//*[text()='Customer Groups']") //customer group
	private WebElement customersGroup; 
	@FindBy(xpath="//i[@class='fa fa-plus']")//add new button
	private WebElement addNew;
	@FindBy(xpath="//input[@name='customer_group_description[1][name]']")
	private WebElement CusGroupName;
	@FindBy(id="input-description1")
	private WebElement desc;
	@FindBy(name="approval")
	private WebElement button;
	@FindBy(xpath="//*[@class='fa fa-save']")
	private WebElement save;
	@FindBy(xpath="//*[@id=\"menu-customer\"]/ul/li[1]/a")
	private WebElement customer;
	@FindBy(xpath="//*[@class='fa fa-plus']")
	private WebElement addnewbutton;
	
	//add customer
	@FindBy(xpath="//option[contains(text(),'privileged customer')][1]")  //privliged customer
	//@FindBy(xpath="//*[@id=\"input-customer-group\"]/option[4]")
	private WebElement privCustomer;
	@FindBy(id="input-firstname")
	private WebElement firstname;
	@FindBy(id="input-lastname")
	private WebElement lastname;
	@FindBy(id="input-email")
	private WebElement email;
	@FindBy(id="input-telephone")
	private WebElement telephone;
	@FindBy(id="input-password")
	private WebElement password; 
	@FindBy(id="input-confirm")
	private WebElement confirPassword; //password
	@FindBy(xpath="//i[@class='fa fa-plus-circle']")
	private WebElement addAddress1;
	
	@FindBy(id="input-firstname1") //address1 firstname
	private WebElement firstname1;
	@FindBy(id="input-lastname1")
	private WebElement lastname1;	//address1 lastname
	
	
	@FindBy(id="input-address-11")
	private WebElement address1;
	@FindBy(id="input-address-21")
	private WebElement address2;
	@FindBy(id="input-city1")
	private WebElement city;
	@FindBy(id="input-postcode1")
	private WebElement postcode;
	@FindBy(xpath="//option[contains(text(),'India')][2]")
	private WebElement country;
	@FindBy(xpath="//option[contains(text(),'Karnataka')]")
	private WebElement state;
	@FindBy(xpath="//i[@class='fa fa-save']")
	private WebElement savebutton;
	
	//method	
	public void CustomerIcon() throws InterruptedException {
		this.customersIcon.click();
		Thread.sleep(2000);
			}
	public void CustomerGroup() throws InterruptedException {
		this.customersGroup.click();
		Thread.sleep(2000);
	}
	public void AddNewButton() throws InterruptedException {
		this.addNew.click();
		Thread.sleep(2000);
	}
	public void CustomerGroupName(String CusGroupName) throws InterruptedException {
		this.CusGroupName.sendKeys(CusGroupName);
		Thread.sleep(2000);
	}
	public void Description(String desc) throws InterruptedException {
		this.desc.sendKeys(desc);
		Thread.sleep(2000);
	}
	public void ApproveNewCustomer() throws InterruptedException {
		this.button.click();
		Thread.sleep(3000);
	}
	public void saveButton() throws InterruptedException {
		this.save.click();
		Thread.sleep(3000);
	}
	public void clickCustomer() throws InterruptedException {
		this.customer.click();
		Thread.sleep(3000);
	}
	public void clickAddNewButton() throws InterruptedException {
		this.addnewbutton.click();
		Thread.sleep(3000);
	}
	
	public void selectprivCustomer() throws InterruptedException { 
		this.privCustomer.click();
		Thread.sleep(3000);
	}
	public void enterFirstName(String firstname) throws InterruptedException {
		this.firstname.sendKeys(firstname);
		Thread.sleep(2000);
	}
	public void enterLastName(String lastname) throws InterruptedException {
		this.lastname.sendKeys(lastname);
		Thread.sleep(2000);
	}
	public void enterEmail(String email) throws InterruptedException {
		this.email.sendKeys(email);
		Thread.sleep(2000);
	}
	public void enterTelephoneNum(String telephone) throws InterruptedException {
		this.telephone.sendKeys(telephone);
		Thread.sleep(2000);
	}
	public void enterPassword(String password) throws InterruptedException {
		this.password.sendKeys(password);
		Thread.sleep(2000);
		}
	
	public void enterConfirmPassword(String confirPassword) throws InterruptedException {
		this.confirPassword.sendKeys(confirPassword);
		Thread.sleep(10000);
	}
	public void clickAddress1Option() throws InterruptedException {
		this.addAddress1.click();
		Thread.sleep(5000);
	}
	
	 public void enterAdd1FirstName1(String firstname1) throws InterruptedException {
		this.firstname1.sendKeys(firstname1);;
		Thread.sleep(5000);
	}
	public void enterAdd1LasttName1(String lastname1) throws InterruptedException {
		this.lastname1.sendKeys(lastname1);
		Thread.sleep(5000);
	}
	
	
	public void enterAddress1(String address1) throws InterruptedException {
		this.address1.sendKeys(address1);
		Thread.sleep(2000);
	}
	
	public void enterAddress2(String address2) throws InterruptedException {
		this.address2.sendKeys(address2);
		Thread.sleep(2000);
	}
	public void enterCity(String city) throws InterruptedException {
		this.city.sendKeys(city);
		Thread.sleep(2000);
	}
	public void enterPostalCode(String postcode) throws InterruptedException {
		this.postcode.sendKeys(postcode);
		Thread.sleep(2000);
	}
	public void selectCountry() throws InterruptedException {
		this.country.click();
		Thread.sleep(2000);
	}
	public void selectState() throws InterruptedException {
		this.state.click();
		Thread.sleep(5000);
	}
	
	public void clickonSaveButton() throws InterruptedException {
		this.savebutton.click();
		Thread.sleep(5000);
	}
	}
