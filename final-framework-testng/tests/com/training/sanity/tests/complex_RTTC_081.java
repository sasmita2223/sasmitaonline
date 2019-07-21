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
import com.training.pom.Medium_055;
import com.training.pom.sales_Returns;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class complex_RTTC_081 {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private Login_Admin_RTTC loginAdmin;  //newly added
	private sales_Returns salesReturns;
	
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
		salesReturns = new sales_Returns(driver);
		
		
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
		
		//admin page credentials
		loginAdmin.sendUserName("admin");
		loginAdmin.sendPassword("admin@123");
		loginAdmin.clickLoginBtn();
		
		salesReturns.clickOnSalesIcon();
		salesReturns.clickOnReturnsLink();
		salesReturns.clickOnAddButton();
		salesReturns.enterOrderIdTextBox("10");
		salesReturns.enterCustomerTextBox("sasmita");
		salesReturns.enterFirestNameTextBox("sasmita");
		salesReturns.enterLasttNameTextBox("123");
		salesReturns.enterEmailTextBox("sasmitasahoo@abc.com");
		salesReturns.enterInputTelephoneTextBox("9678266736");
		salesReturns.enterProductTextBoxTextBox("Bluetooth EarPhone");
		salesReturns.enterModelTextBoxTextBox("SKU-003");
		salesReturns.clickOnSaveButton();
		salesReturns.clickCusName();
		
		//salesReturns.selectCheckBox();
		//Thread.sleep(3000);
		salesReturns.clickOnDeleteButton();
		


}
}
