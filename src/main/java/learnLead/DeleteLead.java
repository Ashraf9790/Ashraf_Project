package learnLead;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import learnwdmethodsfinal.ProjectMethods;
import utils.DataInputProvider;


public class DeleteLead extends ProjectMethods{
	
	@BeforeTest(groups = {"sanity"})
	public void setData() {
		testCaseName = "TC003_DeleteLead";
		testDesc = "Delete Lead";
		author = "Gopi";
		category = "Sanity";
		dataSheetName="DeleteLead";
	}

	@Test(dataProvider="fetchData")
	public void deleteLead(String name, String errorMsg) throws InterruptedException {
		click(locateElement("linkText", "Leads"));
		click(locateElement("linkText", "Find Leads"));
		type(locateElement("xpath", "(//input[@name='firstName'])[3]"), name);
		click(locateElement("xpath", "//button[contains(text(),'Find Leads')]"));
		Thread.sleep(3000);
		String txt = getText(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		click(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		verifyTitle("View Lead | opentaps CRM");
		click(locateElement("linkText", "Delete"));
		click(locateElement("linkText", "Find Leads"));
		type(locateElement("xpath", "//label[contains(text(),'Lead ID:')]/following::input"), txt);
		click(locateElement("xpath", "//button[contains(text(),'Find Leads')]"));
		verifyPartialText(locateElement("xpath", "//div[@class='x-paging-info']"), errorMsg);
		
	}
	@DataProvider(name="fetchData")
	public Object[][] data() {
		DataInputProvider dp = new DataInputProvider();
		String[][] data = DataInputProvider.getSheet(dataSheetName);
		return data;	
	}
}






