package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.Login_Admin_RTTC;
import com.training.pom.Medium_053;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Med_RTTC_053 {
	
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private Login_Admin_RTTC loginAdmin;  //newly added
	private Medium_053 orderStatusComplete;
	
	//log4j implementation
	static final Logger log = Logger.getLogger(Med_RTTC_053.class);
	//extent report implementation
	//private static ExtentReports extent;
	
	private static Properties properties;
	private ScreenShot screenShot;
	//private ExtentTest logger;
	
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
		orderStatusComplete = new Medium_053(driver);
		
		
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
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
		
		//admin login page with screen_shot & log-4j implementation
		loginAdmin.sendUserName("admin");
		screenShot.captureScreenShot("sendUserName");
		loginAdmin.sendPassword("admin@123");
		screenShot.captureScreenShot("sendPassword");
		log.info("userID & password has been entered"); // log4j
		loginAdmin.clickLoginBtn();
		log.info("login button has been clicked"); // log4j
		screenShot.captureScreenShot("clickLoginBtn");
		
		//verifying the complete order status from sales->orders
		orderStatusComplete.clickOnSales();
		screenShot.captureScreenShot("clickOnSales");
		orderStatusComplete.clickOnOrders();
		screenShot.captureScreenShot("clickOnOrders");
		orderStatusComplete.clickOnview();
		screenShot.captureScreenShot("clickOnview");
		orderStatusComplete.clickOnOrderStatusComplete();
		screenShot.captureScreenShot("clickOnOrderStatusComplete");
		orderStatusComplete.clickOnAddHistoryButton();
		screenShot.captureScreenShot("clickOnAddHistoryButton");
			
		//verifying the assertion from the page url
		try {
		String expectedurl = "http://retailm1.upskills.in/admin/index.php?route=sale/order/info&token=rd7lxIvrjigCmtFS1trU04SSAxMXzmIQ&order_id=11";
		String actualurl = "http://retailm1.upskills.in/admin/";
			Assert.assertEquals(actualurl, expectedurl);
		}
		catch(Error e) {
			log.error("url didnt match");
		}

}
}
