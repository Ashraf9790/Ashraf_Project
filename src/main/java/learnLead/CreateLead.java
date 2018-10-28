package learnLead;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import learnwdmethodsfinal.ProjectMethods;
import utils.DataInputProvider;

public class CreateLead extends ProjectMethods{

	@BeforeTest(groups = {"smoke"})
	public void setData() {
		testCaseName = "TC001_CreateLead";
		testDesc = "Create a new Lead";
		author = "Gopi";
		category = "smoke";
		dataSheetName="CreateLead";
	}

	@Test(dataProvider = "fetchData")
	
	public void createLead(String cName,String fName,String lName,String email,String ph) {	
		click(locateElement("linkText", "Leads"));
		click(locateElement("linkText", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"), cName);
		type(locateElement("id", "createLeadForm_firstName"), fName);
		type(locateElement("id", "createLeadForm_lastName"), lName);
		type(locateElement("id", "createLeadForm_primaryEmail"), email);
		type(locateElement("id", "createLeadForm_primaryPhoneNumber"), ""+ph);
		click(locateElement("name", "submitButton"));		
	}
	
	@DataProvider(name="fetchData")
	public Object[][] data() {
		DataInputProvider dp = new DataInputProvider();
		String[][] data = DataInputProvider.getSheet(dataSheetName);
		return data;	
	}

/*	@DataProvider(name = "qa")
	public Object[][] fetchData() {
		Object[][] data = new Object[2][5];
		data[0][0] = "TestLeaf";
		data[0][1] = "sarath";
		data[0][2] = "M";
		data[0][3] = "sarath@Testleaf.com";
		data[0][4] = 124567890;

		data[1][0] = "IBM";
		data[1][1] = "karthi";
		data[1][2] = "G";
		data[1][3] = "karthi@IBM.com";
		data[1][4] = 124567891;
		return data;
	}*/


}