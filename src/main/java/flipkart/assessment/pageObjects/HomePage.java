package flipkart.assessment.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
	public WebElement closePopUp;
	
	@FindBy(xpath = "//img[@alt='Mobiles']")
	public WebElement mobilesLbl;
	
	public void click() {
		closePopUp.click();
		mobilesLbl.click();
	}

}
