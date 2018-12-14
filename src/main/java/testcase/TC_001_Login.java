package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import learnwdmethodsfinal.ProjectMethods;
import pages.LoginPage;
import utils.DataInputProvider;

public class Login_TC extends ProjectMethods{
	
	@BeforeTest
	public void setdata()
	{
	
		testCaseName="Login";
		testDesc="Login into Leaftap";
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
