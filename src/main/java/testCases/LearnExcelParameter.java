package testCases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import wdMethods.SeMethods;
import week6.day2.LearnExcel;

public class LearnExcelParameter extends SeMethods{

	//@Test(invocationCount=2,timeOut=15000)
	//@Test(enabled=false)

	//@Test(groups= {"smoke"})
	@Parameters({"url", "username", "password"})
	@Test	
	public void login(String url,String username,String password)
	{
		startApp("chrome", url);
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, username);
		WebElement elePassword = locateElement("password");
		type(elePassword, password);
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		WebElement crmsfa = locateElement("linktext","CRM/SFA");
		crmsfa.click();
		WebElement createlead = locateElement("linktext","Create Lead");
		createlead.click();
	}

	//@Test(dataProvider="qa")
	public void createLead(String cname,String fname,String lname) {
		WebElement compname = locateElement("id","createLeadForm_companyName");
		compname.sendKeys(cname);
		WebElement firstname = locateElement("id","createLeadForm_firstName");
		firstname.sendKeys(fname);
		WebElement lastname = locateElement("id","createLeadForm_lastName");
		lastname.sendKeys(lname);
		WebElement submit = locateElement("xpath","//input[@name='submitButton']");
		submit.click();

	}
	@DataProvider(name="qa")
	public Object[][] fetchData() throws IOException{
		Object[][] data = LearnExcel.readexcel();
		return data;
		/*Object[][] data =new Object[2][3];
		data[0][0]  = "TCS";
		data[0][1]  ="Ashraf";
		data[0][2]  ="Ali";

		data[1][0]  = "CTS";
		data[1][1]  ="Ashraf Ali";
		data[1][2]  ="S";
		return data;
*/


	}

}
