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

public class complex_RTTC_084 {
	
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private Login_Admin_RTTC loginAdmin;  //newly added
	private Medium_055 catalogManufacture;
	
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
		catalogManufacture = new Medium_055(driver);
		
		
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

		//adding a product from the manufactures
				catalogManufacture.clickCatalogIcon();
				catalogManufacture.clickProducts();
				catalogManufacture.clickAddButton();
				catalogManufacture.addPrdouctName("MRF BAT");
				catalogManufacture.enterMetaTagTitle("Cricket Bat");
				
				//data tab
				catalogManufacture.clickOnDataTab();
				catalogManufacture.enterModelTextBox("SKU-012");
				catalogManufacture.enterPriceTextBox("500");
				catalogManufacture.enterQuantityTextBox("50");
				
				//links tab
				catalogManufacture.clickOnLinksTab();
				catalogManufacture.enterManufactureTextBox("sasmitaSelenium13");
				catalogManufacture.clickOnCatagories();
				catalogManufacture.clickCategoriesEarring();
				
				//saving the product
				catalogManufacture.clickSaveOption();
				
				//loggingout from the application & launching the homePage
				catalogManufacture.clickOnLogout();
				
				//homePage: searching for the added product
				catalogManufacture.clickOnSearchButton("MRF BAT");
				
				
				
				
}
}
