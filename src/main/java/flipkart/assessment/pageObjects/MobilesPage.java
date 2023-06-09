package flipkart.assessment.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MobilesPage {
	
	WebDriver driver;
	public MobilesPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[text()='SAMSUNG']")
	public WebElement checkboxSamsung;
	
	@FindBy(xpath = "//div[text()='APPLE']")
	public WebElement checkboxApple;
	
	@FindBy(xpath = "//*[text()='realme']")
	public WebElement checkboxRealme;
	
	@FindBy(xpath = "//section[1]/div[2]/div/div/div[text()='APPLE']")
	public WebElement appleFilter;
	
	@FindBy(xpath = "//section[1]/div[2]/div/div/div[text()='realme']")
	public WebElement realmeFilter;
	@FindBy(xpath = "//section[1]/div[2]/div/div/div[text()='SAMSUNG']")
	public WebElement samsungFilter;
	
	@FindBy(xpath = "//section/div[2]/div/div/div[text()='SAMSUNG']")
	public WebElement removeSAMFilter;
	@FindBy(xpath = "//section/div[2]/div/div/div[text()='realme']")
	public WebElement removeRealmFilter;
	@FindBy(xpath = "//section/div[2]/div/div/div[text()='APPLE']")
	public WebElement removeAPPFilter;
	
	
	public void checkboxClick() throws InterruptedException {
		checkboxSamsung.click();
		Thread.sleep(2000);
		checkboxRealme.click();
		Thread.sleep(2000);
		checkboxApple.click();
		
		
	}
	
	public void filterCheck() {
		Assert.assertTrue(appleFilter.isDisplayed(), "NO Apple Filter");
		Assert.assertTrue(realmeFilter.isDisplayed(), "NO realme Filter");
		Assert.assertTrue(samsungFilter.isDisplayed(), "NO Samsung Filter");
	}
	
	public void filterRemove() throws InterruptedException {
		removeSAMFilter.click();
		Thread.sleep(2000);
		removeRealmFilter.click();
		Thread.sleep(2000);
		removeAPPFilter.click();
	}
	
	
	
}
