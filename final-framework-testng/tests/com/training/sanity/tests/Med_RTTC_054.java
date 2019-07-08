package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.pom.LoginPOM;
import com.training.pom.Login_Admin_RTTC;
import com.training.pom.Medium_054;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Med_RTTC_054 {
	
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private Login_Admin_RTTC loginAdmin;  //newly added
	private Medium_054 salesOrder;
	
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
		salesOrder = new Medium_054(driver);
		
		
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
		
		//login to admin page
		loginAdmin.sendUserName("admin");
		loginAdmin.sendPassword("admin@123");
		loginAdmin.clickLoginBtn();
		
		//navigating to sales icon & adding a customer
		salesOrder.cilckSalesIcon();
		salesOrder.clickOrdersIcon();
		salesOrder.clickAddNewButton();
		
		//customer details page
		salesOrder.enterFirstName("manzoor");
		salesOrder.enterLastName("mehadi");
		salesOrder.enterEmail("manzoor@gmail.com");
		salesOrder.enterTelephoneNum("9876543210");
		salesOrder.clickContinue();
		
		//products page
		salesOrder.ChooseProduct();//navigating to choose product option
		salesOrder.selectChooseProduct1();//for selecting the product
		
		
		salesOrder.enterQuantity("1"); //enter the quantity
		salesOrder.clickAddProductButton();
		salesOrder.clickContinueButton();
		
		//payments details page:
		salesOrder.enterPaymentFirstName("manzoor");
		salesOrder.enterPaymentLastName("mehadi");
		salesOrder.enterPaymentAddress1("yeshwanthapur");
		salesOrder.enterPaymentAddress2("bangalore");
		salesOrder.enterPaymentCityTextBox("bangalore");
		salesOrder.enterPaymentPostCodeTextBox("560022");
		salesOrder.paymentSelectCountry();
		salesOrder.paymentSelectState();
		salesOrder.paymentClickOnContinueButton2();
		
		//shipping details page:
		salesOrder.enterShippingFirstName("manzoor");
		salesOrder.enterShippingLastName("mehadi");
		salesOrder.enterShippingAddress1("yeshwanthapur");
		//salesOrder.enterShippingAddress2("bangalore");
		salesOrder.selectShippingCity("bangalore");
		salesOrder.selectShippingPostCode("560022");
		salesOrder.selectShippingCountry();
		salesOrder.selectShippingState();
		salesOrder.clickShippingContinueButton2();
		
		
		//totals page:
		salesOrder.clickOntotalShippingMethod();
		salesOrder.clickOnFreeShipping();
		salesOrder.clickOnTotalPaymentMethod();
		salesOrder.clickOnCashOnDelivery();
		salesOrder.clickOnSaveButton();
		
		
		
		
		
		
		
		
	
		
		
		

}

}



