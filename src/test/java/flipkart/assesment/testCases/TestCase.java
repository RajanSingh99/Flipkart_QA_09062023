package flipkart.assesment.testCases;

import java.net.MalformedURLException;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import flipkart.assesment.base.BaseConfiguartions;
import flipkart.assessment.pageObjects.HomePage;
import flipkart.assessment.pageObjects.MobilesPage;

public class TestCase extends BaseConfiguartions {

	HomePage homeObj;
	MobilesPage mobObj;
	WebDriver driver;
	
	@Parameters({"Port"})
	@BeforeClass
	public void initialSetup(String Port) throws MalformedURLException {
		driver = setUp(Port);
		homeObj = new HomePage(driver);
		mobObj= new MobilesPage(driver);
	}
	
	@Test
	 public void scenario1() throws InterruptedException{
		homeObj.click();
		mobObj.checkboxClick();
		mobObj.filterCheck();
		mobObj.filterRemove();
	}
}
