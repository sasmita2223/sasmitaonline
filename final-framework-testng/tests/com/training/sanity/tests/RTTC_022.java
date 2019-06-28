package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.pom.Admin_Reports_Sales_RTTC_022;
import com.training.pom.LoginPOM;
import com.training.pom.Login_Admin_RTTC;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RTTC_022 {
	
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private Login_Admin_RTTC loginAdmin;  //newly added
	private Admin_Reports_Sales_RTTC_022 loginReportsSales;
	
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
		loginReportsSales = new Admin_Reports_Sales_RTTC_022(driver);
		
		
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
		
		
		loginAdmin.sendUserName("admin");
		loginAdmin.sendPassword("admin@123");
		loginAdmin.clickLoginBtn();
		
		loginReportsSales.clickReportLink();
		loginReportsSales.clickSalesLink();
		loginReportsSales.clickOrdersLink();
		//loginReportsSales.scroll(element, driver);
		
		
		
		
		


	}
}
