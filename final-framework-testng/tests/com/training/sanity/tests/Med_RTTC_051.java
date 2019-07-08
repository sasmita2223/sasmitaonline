package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.pom.Admin_Reports_Sales_Tax_RTTC_023;
import com.training.pom.LoginPOM;
import com.training.pom.Login_Admin_RTTC;
import com.training.pom.Medium_051;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Med_RTTC_051 {
	
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private Login_Admin_RTTC loginAdmin;  //newly added
	private Medium_051 customerDeatils;
	
	private static Properties properties;
	//private ScreenShot screenShot;
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		loginAdmin = new Login_Admin_RTTC(driver); 
		customerDeatils = new Medium_051(driver);
		
		
		baseUrl = properties.getProperty("baseURL");
		//screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		//driver.quit();
	}
	@Test
	public void validLoginTest() throws InterruptedException 
	{
		
		//login page credentials
		loginAdmin.sendUserName("admin");
		loginAdmin.sendPassword("admin@123");
		loginAdmin.clickLoginBtn();
		
		//adding customer groups from the customer->customer groups icon
		customerDeatils.CustomerIcon();
		customerDeatils.CustomerGroup();
		customerDeatils.AddNewButton();
		customerDeatils.CustomerGroupName("privileged customer");
		customerDeatils.Description("privileged customer");
		customerDeatils.ApproveNewCustomer();
		customerDeatils.saveButton();
		
		//adding customer from the customer->customer link
		customerDeatils.CustomerIcon();
		customerDeatils.clickCustomer();
		customerDeatils.clickAddNewButton();
		customerDeatils.selectprivCustomer();   // privileged customer
		//adding customer details
		customerDeatils.enterFirstName("bikash12381s");
		customerDeatils.enterLastName("patrap");
		customerDeatils.enterEmail("bikashpatrayhu@gmail.com");
		customerDeatils.enterTelephoneNum("9876543210");
		customerDeatils.enterPassword("manzoor123");
		customerDeatils.enterConfirmPassword("manzoor123");
		customerDeatils.clickAddress1Option();		
		
		//adding details on address1 option from customers->add customer
		customerDeatils.enterAdd1FirstName1("bikash12381");
		customerDeatils.enterAdd1LasttName1("patrap");
		customerDeatils.enterAddress1("yeshwanthapur");
		customerDeatils.enterAddress2("bangalore");
		customerDeatils.enterCity("bangalore");
		customerDeatils.enterPostalCode("560067");
		customerDeatils.selectCountry();
		customerDeatils.selectState();
		//saving the customer
		customerDeatils.clickonSaveButton();
		
	

}

}
