package learnwdmethodsfinal;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.DataInputProvider;

public class ProjectMethods extends SeMethods{
	
	/*@BeforeTest
	public void beforeTest() {
		System.out.println("@BeforeTest");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("@BeforeClass");
	}
	*/
	
	
	//@Parameters({"url","username","password"})
	@BeforeMethod
	//public void login() {
		
		public void login()
		{
			startApp("chrome", "http://leaftaps.com/opentaps");
			/*WebElement eleUserName = locateElement("id", "username");
			type(eleUserName, username);
			WebElement elePassword = locateElement("password");
			type(elePassword, password);
			WebElement eleLogin = locateElement("class","decorativeSubmit");
			click(eleLogin);
			WebElement crmsfa = locateElement("linkText","CRM/SFA");
			crmsfa.click();
			*/
		}

		
		/*startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		WebElement crm = locateElement("linktext", "CRM/SFA");
		click(crm);	
		WebElement createlead = locateElement("linktext","Create Lead");
		createlead.click();
	*/
	
	@AfterMethod
	public void closeApp() {
		
	}
	@AfterClass
	public void afterClass() {
		System.out.println("@AfterClass");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("@AfterTest");
	}
	
	@DataProvider(name="fetchData")
	public Object[][] data() {
		
		String[][] data = DataInputProvider.getSheet(dataSheetName);
		return data;	
	}
	@AfterSuite
	public void afterSuite() {
		closeAllBrowsers();	
	}
	
	@BeforeSuite
	public void beforeSuite() {
		startResult();
	}

}






