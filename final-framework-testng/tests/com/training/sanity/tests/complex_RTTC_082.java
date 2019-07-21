package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.dataproviders.LoginDataProviders;
import com.training.pom.LoginPOM;
import com.training.pom.Login_Admin_RTTC;
import com.training.pom.sales_Returns;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class complex_RTTC_082 {
	
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private Login_Admin_RTTC loginAdmin;  //newly added
	private sales_Returns salesReturns;
	private complex_RTTC_082 salesReturns_TestData15;
	
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
	@Test(dataProvider="excel-inputsRTTC_82", dataProviderClass=LoginDataProviders.class)
	public void validLoginTest(String orderID,String customeTextBox,String firstName,String lastName,String email,String telephoneNum,String prodtctTextBox,String modelTextBox ) throws InterruptedException 
	{
		
		//admin page credentials
		loginAdmin.sendUserName("admin");
		loginAdmin.sendPassword("admin@123");
		loginAdmin.clickLoginBtn();
		
		salesReturns.clickOnSalesIcon();
		salesReturns.clickOnReturnsLink();
		salesReturns.clickOnAddButton();
		salesReturns.enterOrderIdTextBox(orderID);
		salesReturns.enterCustomerTextBox(customeTextBox);
		salesReturns.enterFirestNameTextBox(firstName);
		salesReturns.enterLasttNameTextBox(lastName);
		salesReturns.enterEmailTextBox(email);
		
		salesReturns.enterInputTelephoneTextBox(telephoneNum);
		salesReturns.enterProductTextBoxTextBox(prodtctTextBox);
		
		salesReturns.enterModelTextBoxTextBox(modelTextBox);
		//salesReturns.enter
		salesReturns.clickOnSaveButton();
		Thread.sleep(4000);
		
		salesReturns.clickCusName();		
		//salesReturns.selectCheckBox();
		//Thread.sleep(3000);
		salesReturns.clickOnDeleteButton();
		
		Thread.sleep(4000);
		
		//salesReturns
		
		
		


}
}



