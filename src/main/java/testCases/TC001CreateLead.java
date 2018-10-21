package testCases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class TC001CreateLead extends SeMethods{

	//@Test(invocationCount=2,timeOut=15000)
	//@Test(enabled=false)
	@Test(groups= {"smoke"})
	public void createLead() {
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		WebElement crmsfa = locateElement("linktext","CRM/SFA");
		crmsfa.click();
		WebElement createlead = locateElement("linktext","Create Lead");
		createlead.click();
		WebElement compname = locateElement("id","createLeadForm_companyName");
		compname.sendKeys("TestLeaf");
		WebElement firstname = locateElement("id","createLeadForm_firstName");
		firstname.sendKeys("Ashraf");
		WebElement lastname = locateElement("id","createLeadForm_lastName");
		lastname.sendKeys("Ali");
		WebElement submit = locateElement("xpath","//input[@name='submitButton']");
		submit.click();
		
		
	}
	
}
