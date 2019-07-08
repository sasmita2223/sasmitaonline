package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Medium_052 {
private WebDriver driver; 
	
	public Medium_052(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@class='fa fa-user fw']")		//customer icon
	private WebElement customersIcon; 
	@FindBy(xpath="//*[@id=\"menu-customer\"]/ul/li[1]/a")		//customer link
	private WebElement customerLink; 
	//@FindBy(xpath="//*[contains(text(),'bikash')]//following-sibling::td[6]//a//i") 
	@FindBy(xpath="//*[contains(text(),'Abdul')]//following-sibling::td[6]//a//i")
	private WebElement name;
	@FindBy(id="input-firstname")
	private WebElement FirstName;
	@FindBy(xpath="//*[text()=' Address 1']") //address1 change
	private WebElement address1;
	@FindBy(id="input-postcode1") //postcode change
	private WebElement postcode1;
	@FindBy(linkText="Reward Points") //rewards points
	private WebElement rewardsPointsTab;
	@FindBy(id="input-reward-description") //description box
	private WebElement descriptionBox;
	@FindBy(id="input-points")	//points box
	private WebElement addPoints;
	@FindBy(id="button-reward")	//add rewards point
	private WebElement addRewwardsPoint;
	@FindBy(xpath="//*[@class='fa fa-save']")	//click on save
	private WebElement saveButton;
	@FindBy(xpath="//*[@class='fa fa-bar-chart-o fw']") //reports icon
	private WebElement reportsIcon;
	
	@FindBy(xpath="//*[@id=\"menu-report\"]/ul/li[3]/a") //customericon
	private WebElement customerIcon;
	@FindBy(xpath="//*[@id=\"menu-report\"]/ul/li[3]/ul/li[5]/a") //rewardspoints
	private WebElement rewardsPoints;
	
	
	
	//method	
		public void clickCustomerIcon() throws InterruptedException {
			this.customersIcon.click();
			Thread.sleep(2000);
				}
		public void ClickCustomerLink() throws InterruptedException {
			this.customerLink.click();
			Thread.sleep(2000);
		}
		public void clickOnCustomerNameEdit() throws InterruptedException {
			this.name.click();
			Thread.sleep(5000);
			
		}
		public void clearFirstName(String FirstName) throws InterruptedException {
			//this.FirstName.clear();
			this.FirstName.sendKeys(FirstName);	
			Thread.sleep(4000);
			
		}
		public void clickOnAddress1() throws InterruptedException {
			this.address1.click();
			Thread.sleep(4000);
			
		}
		public void clearOnPostCode(String postcode1) throws InterruptedException {
			this.postcode1.clear();
			Thread.sleep(4000);
			this.postcode1.sendKeys(postcode1);
		}
		public void clickOnRewardsPointsTab() throws InterruptedException {
			this.rewardsPointsTab.click();
			Thread.sleep(4000);
			
		}
		public void addDescriptionBox(String descriptionBox) throws InterruptedException {
			this.descriptionBox.sendKeys(descriptionBox);
			Thread.sleep(4000);
			
		}
		public void addPointsCheckBox(String addPoints) throws InterruptedException {
			this.addPoints.sendKeys(addPoints);
			Thread.sleep(4000);
			
		}
		public void clickOnAddRewardsPointButton() throws InterruptedException {
			this.addRewwardsPoint.click();
			Thread.sleep(4000);
			
		}
		public void clickOnSaveButton() throws InterruptedException {
			this.saveButton.click();
			Thread.sleep(4000);
			
		}
		public void clickOnReportsIcon() throws InterruptedException {
			this.reportsIcon.click();
			Thread.sleep(4000);
			
		}
		
		public void clickOnCustomerIcon() throws InterruptedException {
			this.customerIcon.click();
			Thread.sleep(4000);
			
		}
		public void clickOnRewardsPoints() throws InterruptedException {
			this.rewardsPoints.click();
			Thread.sleep(4000);
			
		}
}


