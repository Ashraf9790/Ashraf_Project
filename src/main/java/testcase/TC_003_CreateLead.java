package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import learnwdmethodsfinal.ProjectMethods;
import pages.LoginPage;
/*//import pages.LoginPage;
import pages.MyLeads;
import pages.CreateLead_Page;
import pages.LoginPage;
*/
public class CreateLead_TC extends ProjectMethods{

	@BeforeTest
	public void setData()
	{
		testCaseName="Home_Page";
		testDesc="Login into Home Page";
		category="smoke";
		author="Ashraf";
		dataSheetName="CreateLead";
	}
	
	@Test(dataProvider="fetchData")
	public void createLead(String username,String password,String Cname,String Fname,String Lname,String Email,String Phone)
	{
		new LoginPage()
		.typeUsername(username)
		.typePassword(password)
		.clickLogin()
		.clickCrmsfa()
		.clickLeads()
		.clickCreateLead()
		.entercname(Cname)
		.enterfname(Fname)
		.enterlname(Lname)
		.enterEmail(Email)
		.enterPhNo(Phone)
		.clickCreateLead();
		}
		
	
}
