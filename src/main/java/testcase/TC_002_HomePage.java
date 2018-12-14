package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import learnwdmethodsfinal.ProjectMethods;
import pages.LoginPage;
import utils.DataInputProvider;

public class HomePage_TC extends ProjectMethods{
	
	@BeforeTest
	public void setdata()
	{
	
		testCaseName="Home_Page";
		testDesc="Login into Home Page";
		category="smoke";
		author="Ashraf";
		dataSheetName="TC001";
	}

@Test(dataProvider="fetchData")
public void loginLogout(String uName,String password)
{
	new LoginPage()
	.typeUsername(uName)
	.typePassword(password)
	.clickLogin()
	.clickCrmsfa();	
}
}